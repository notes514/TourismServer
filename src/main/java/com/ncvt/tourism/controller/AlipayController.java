package com.ncvt.tourism.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.ncvt.tourism.config.AlipayConfig;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AlipayController {

    @RequestMapping(value = "/alipay", method = RequestMethod.GET)
    public Object alipayment(String content, int price) {
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, "json", AlipayConfig.CHARSET,
                AlipayConfig.ALIPAY_PUBLIC_KEY, "RSA2");
        //实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        //SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试Java" + content);
        model.setOutTradeNo(AlipayConfig.CHARSET);
        model.setTimeoutExpress("30m");
        model.setTotalAmount(price+"");
        model.setProductCode("QUICK_MSECURITY_PAY");
        request.setBizModel(model);
        request.setNotifyUrl("商户外网可以访问的异步地址");
        try {
            //这里和普通的接口调用不同，使用的是sdkExecute
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            System.out.println("输出结果"+response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
            Map<String, String> map = new HashMap<>();
            map.put("RESULT", "S");
            map.put("orderString", response.getBody());
            return map;
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return null;
    }

}
