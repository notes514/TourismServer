package com.ncvt.tourism.controller;

import com.ncvt.tourism.mapper.*;
import com.ncvt.tourism.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class TourismController {
    private static final String TIPS = "TIPS";          //提示
    private static final String RESULT = "RESULT";      //返回结果
    private static final String ONE_DATA = "ONE_DETAIL";   //返回数据1
    private static final String TWO_DATA = "TWO_DETAIL";   //返回数据2
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AmountRechargeMapper amountRechargeMapper;
    @Autowired
    private CommonAddrMapper commonAddrMapper;
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private MemberPowerMapper memberPowerMapper;
    @Autowired
    private UserCollectionMapper collectionMapper;
    @Autowired
    private ScenicRegionMapper scenicRegionMapper;
    @Autowired
    private ScenicSpotMapper scenicSpotMapper;
    @Autowired
    private ScenicDetailsMapper scenicDetailsMapper;
    @Autowired
    private ScenicPicMapper scenicPicMapper;

    /**
     * 用户进行登录
     * @param user 用户信息
     * @return 返回结果
     */
    @RequestMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        UserExample example = new UserExample();
        example.createCriteria().andUserAccountNameEqualTo(user.getUserAccountName()).andPasswordEqualTo(user.getPassword());
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() > 0) {
            map.put(RESULT, "S");
            map.put(TIPS, "登录成功！");
            return map;
        } else {
            map.put(RESULT, "F");
            map.put(TIPS, "登录失败！");
            return map;
        }
    }

    /**
     * 用户注册
     * @param user
     * @return 返回的结果
     */
    @RequestMapping("/register")
    public Map<String, String> register(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        try {
            user.setUserTime(date);
            userMapper.insertSelective(user);
            userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "注册失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(RESULT, "注册成功！");
        return map;
    }

    /**
     * 检测账户名是否已存在
     * @param user
     * @return 返回的结果
     */
    @RequestMapping("/qeuryUserAccountName")
    public Map<String, String> qeuryUserAccountName(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        UserExample example = new UserExample();
        example.createCriteria().andUserAccountNameEqualTo(user.getUserAccountName());
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() > 0) {
            map.put(RESULT, "该用户名已存在！");
            return map;
        } else {
            map.put(RESULT, "");
            return map;
        }
    }

    /**
     * 更新用户信息
     * @param user
     * @return 返回的结果
     */
    @RequestMapping("/updateUserInformation")
    public Map<String, String> updateUserInformation(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        if (userMapper.selectByPrimaryKey(user.getUserId()) == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该用户！");
            return map;
        }
        try {
            userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "修改失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "修改成功！");
        return map;
    }

    /**
     * 添加常用地址内容信息
     * @param commonAddr
     * @return 返回结果
     */
    @RequestMapping("/addedCommonAddress")
    public Map<String, String> addedCommonAddress(@RequestBody CommonAddr commonAddr) {
        Map<String, String> map = new HashMap<>();
        try {
            commonAddrMapper.insertSelective(commonAddr);
            commonAddrMapper.updateByPrimaryKeySelective(commonAddr);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功！");
        return map;
    }

    /**
     * 修改常用地址内容信息
     * @param commonAddr
     * @return 返回结果
     */
    @RequestMapping("/updateCommonAddress")
    public Map<String, String> updateCommonAddress(@RequestBody CommonAddr commonAddr) {
        Map<String, String> map = new HashMap<>();
        if (commonAddrMapper.selectByPrimaryKey(commonAddr.getCommonAddrId()) == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "请先添加您的常用地址！");
            return map;
        }
        try {
            commonAddrMapper.updateByPrimaryKeySelective(commonAddr);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "更新失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "更新成功！");
        return map;
    }

    /**
     * 查询所有常用地址内容信息
     * @param commonAddr
     * @return 返回结果
     */
    @RequestMapping("/queryAllCommonAddress")
    public Map<String, Object> queryAllCommonAddress(@RequestBody CommonAddr commonAddr, int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录！");
            return map;
        }
        if (commonAddrMapper.selectByPrimaryKey(commonAddr.getCommonAddrId()) == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "暂无常用地址！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, commonAddrMapper.selectByExample(null));
        return map;
    }

    /**
     * 账户充值
     * @param userId 用户编号
     * @param money 充值金额
     * @return 返回结果
     */
    @RequestMapping("accountRecharge")
    public Map<String, String> accountRecharge(@RequestBody AmountRecharge recharge, int userId, double money) {
        Map<String, String> map = new HashMap<>();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该用户！");
            return map;
        }
        try { //异常处理（捕获异常）
            //获取账户金额加上充值的金额
            Double balance = user.getUserMoney() + money;
            user.setUserMoney(balance);
            userMapper.updateByPrimaryKeySelective(user);
            //充值成功后新增一条充值记录
            //充值用户
            recharge.setUserId(userId);
            //设置面值（充值金额）
            recharge.setFaceValue(money);
            //设置充值时间
            recharge.setRechargeTime(date);
            amountRechargeMapper.insertSelective(recharge);
            amountRechargeMapper.updateByPrimaryKeySelective(recharge);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "充值失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "充值成功！");
        return map;
    }

    /**
     * 用户办理会员
     * @param member
     * @param userId 用户编号
     * @param money 会员价格
     * @return
     */
    @RequestMapping("/userMemberHandling")
    public Map<String, String> userMemberHandling(@RequestBody Member member, int userId, int money) {
        Map<String, String> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该用户！");
            return map;
        }
        if (user.getUserMoney() - money < 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "充值失败，账户余额不足！");
            return map;
        }
        //会员充值成功提示语
        String tips = "";
        try { //异常处理(捕获异常)
            member.setUserId(userId);
            if (money > 59) { //充值金额大于59元
                member.setMemberType(1); //1:超级会员
                member.setMemberIntegral(500); //500初始会员积分
                member.setMemberDiscount(0.85); //0.85折
                member.setMemberDescribe("超级会员可在会员的基础上享有更多优惠");
                tips = "充值超级会员成功！";
            } else {
                member.setMemberType(2); //2:普通会员
                member.setMemberIntegral(200); //200初始会员积分
                member.setMemberDiscount(0.90); //0.90折
                member.setMemberDescribe("会员享有更多优惠");
                tips = "充值会员成功！";
            }
            //插入数据，并更新数据库
            memberMapper.insertSelective(member);
            memberMapper.updateByPrimaryKeySelective(member);
            //扣除用户账户金额，并更新数据库
            user.setUserMoney(user.getUserMoney() - money);
            userMapper.updateByPrimaryKey(user);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "充值会员失败！");
        }
        map.put(RESULT, "S");
        map.put(TIPS, tips);
        return map;
    }

    /**
     * 添加会员权益
     * @param memberPower
     * @return 返回结果
     */
    @RequestMapping("/addByMembershipInterests")
    public Map<String, String> addByMembershipInterests(@RequestBody MemberPower memberPower) {
        Map<String, String> map = new HashMap<>();
        try {
            memberPowerMapper.insertSelective(memberPower);
            memberPowerMapper.updateByPrimaryKeySelective(memberPower);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功！");
        return map;
    }

    /**
     * 用户收藏
     * @param collection 收藏信息
     * @param userId 用户编号
     * @param scenicDetailsId 景区详情编号
     * @return
     */
    @RequestMapping("/userAddByCollection")
    public Map<String, String> userAddByCollection(@RequestBody UserCollection collection, int userId, int scenicDetailsId) {
        Map<String, String> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) { //如果为空则提示登录，否则直接跳过
            map.put(RESULT, "F");
            map.put(TIPS, "请先登录！");
            return map;
        }
        ScenicDetails details = scenicDetailsMapper.selectByPrimaryKey(scenicDetailsId);
        if (details == null) { //检测指定的景区是否为空
            map.put(RESULT, "F");
            map.put(TIPS, "没有该景区！");
            return map;
        }
        try { //异常处理（捕获异常）
            //设置收藏的用户
            collection.setUserId(userId);
            //设置收藏的景区
            collection.setScenicDetailsId(details.getScenicSpotId());
            //插入数据
            collectionMapper.insertSelective(collection);
            //更新数据
            collectionMapper.updateByPrimaryKeySelective(collection);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功！");
        return map;
    }

    /**
     * 查询用户收藏记录
     * @param collection 收藏内容信息
     * @return 返回结果
     */
    @RequestMapping("/queryAllUserCollection")
    public Map<String, Object> queryAllUserCollection(@RequestBody UserCollection collection, int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        //true则提示未登录，false则下一步
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录！");
            return map;
        }
        //true则提示暂无收藏，false则下一步
        if (collectionMapper.selectByPrimaryKey(collection.getCollectionId()) == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "暂无收藏！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, collectionMapper.selectByExample(null));
        return map;
    }

    /**
     * 添加景区地址内容信息
     * @param region
     * @return 返回结果
     */
    @RequestMapping("/addScenicRegion")
    public Map<String, String> addScenicRegion(@RequestBody ScenicRegion region) {
        Map<String, String> map = new HashMap<>();
        try { //异常处理（捕获异常）
            //插入数据
            scenicRegionMapper.insertSelective(region);
            //更新数据
            scenicRegionMapper.updateByPrimaryKeySelective(region);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败!");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功!");
        return map;
    }

    /**
     * 添加景区内容信息
     * @param spot
     * @return 返回结果
     */
    @RequestMapping("/addScenicSpot")
    public Map<String, String> addScenicSpot(@RequestBody ScenicSpot spot) {
        Map<String, String> map = new HashMap<>();
        try { //异常处理（捕获异常）
            //插入数据
            scenicSpotMapper.insertSelective(spot);
            //更新数据
            scenicSpotMapper.updateByPrimaryKeySelective(spot);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败!");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功!");
        return map;
    }

    /**
     * 添加景区内容详情信息
     * @param details
     * @return 返回结果
     */
    @RequestMapping("/addScenicDetails")
    public Map<String, String> addScenicDetails(@RequestBody ScenicDetails details) {
        Map<String, String> map = new HashMap<>();
        try { //异常处理（捕获异常）
            //插入数据
            scenicDetailsMapper.insertSelective(details);
            //更新数据
            scenicDetailsMapper.updateByPrimaryKeySelective(details);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败!");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功!");
        return map;
    }

    /**
     * 添加景区内容详情图片路径信息
     * @param scenicPic
     * @return 返回结果
     */
    @RequestMapping("/addScenicPic")
    public Map<String, String> addScenicPic(@RequestBody ScenicPic scenicPic) {
        Map<String, String> map = new HashMap<>();
        try { //异常处理（捕获异常）
            //插入数据
            scenicPicMapper.insertSelective(scenicPic);
            //更新数据
            scenicPicMapper.updateByPrimaryKeySelective(scenicPic);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败!");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功!");
        return map;
    }

    /**
     * 查询景区所有地址
     * @return 返回结果
     */
    @RequestMapping("queryAllScenicRegion")
    public List<ScenicRegion> queryAllScenicRegion() {
        return scenicRegionMapper.selectByExample(null);
    }

    /**
     * 查询景区信息
     * @return 返回结果
     */
    @RequestMapping("queryAllScenicSpot")
    public List<ScenicSpot> queryAllScenicSpot() {
        return scenicSpotMapper.selectByExample(null);
    }

    /**
     * 查询景区信息详情
     * @param scenicSpotId 景区编号
     * @return 返回结果
     */
    @RequestMapping("queryByScenicDetailsAndPic")
    public Map<String, Object> queryByScenicDetailsAndPic(int scenicSpotId) {
        Map<String, Object> map = new HashMap<>();
        ScenicDetails details = scenicDetailsMapper.selectByPrimaryKey(scenicSpotId);
        if (details == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicDetailsMapper.selectByPrimaryKey(scenicSpotId));
        map.put(TWO_DATA, scenicPicMapper.selectByPrimaryKey(details.getScenicDetailsId()));
        return map;
    }

}
