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
    private static final String THREE_DATA = "THREE_DATA"; //返回数据3
    private static final String FOUR_DATA = "FOUR_DATA"; //返回数据4
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
    @Autowired
    private ExhibitionAreaMapper exhibitionAreaMapper;
    @Autowired
    private ExhibitsMapper exhibitsMapper;
    @Autowired
    private ExhibitsPicMapper exhibitsPicMapper;
    @Autowired
    private ExhibitsCommentMapper exhibitsCommentMapper;
    @Autowired
    private FabulousDetailsMapper fabulousDetailsMapper;
    @Autowired
    private ExhibitsCommentMapper ecmMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailsMapper orderDetailsMapper;
    @Autowired
    private ContactsMapper contactsMapper;
    @Autowired
    private PassengerMapper passengerMapper;
    @Autowired
    private TripMapper tripMapper;

    /**
     * 用户进行登录
     * @param user 用户信息
     * @return 返回结果
     */
    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        UserExample example = new UserExample();
        example.createCriteria().andUserAccountNameEqualTo(user.getUserAccountName());
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() > 0) {
            //校验密码输入是否正确
            if (!user.getPassword().equals(userList.get(0).getPassword())) {
                map.put(RESULT, "F");
                map.put(TIPS, "密码输入错误");
                return map;
            }
            map.put(RESULT, "S");
            map.put(TIPS, "登录成功！");
            map.put(ONE_DATA,userList.get(0));
            return map;
        } else {
            map.put(RESULT, "F");
            map.put(TIPS, "该用户不存在");
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
            user.setUserMoney((double) 1000000);
            user.setUserTime(date);
            userMapper.insertSelective(user);
            userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "注册失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "注册成功！");
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
            map.put(RESULT, "F");
            map.put(TIPS, "该用户名已被使用！");
            return map;
        } else {
            map.put(RESULT, "S");
            map.put(TIPS, "可以创建");
            return map;
        }
    }

    /**
     * 查询用户信息
     * @param userId 用户编号
     * @return 返回的结果
     */
    @RequestMapping("/queryByUserInformation")
    public Map<String, Object> queryByUserInformation(int userId) {
        //向上造型
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该用户！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, userMapper.selectByPrimaryKey(userId));
        return map;
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
     * @return
     */
    @RequestMapping("/userAddByCollection")
    public Map<String, String> userAddByCollection(@RequestBody UserCollection collection) {
        Map<String, String> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(collection.getUserId());
        if (user == null) { //如果为空则提示登录，否则直接跳过
            map.put(RESULT, "F");
            map.put(TIPS, "请先登录！");
            return map;
        }
        ScenicDetails details = scenicDetailsMapper.selectByPrimaryKey(collection.getScenicDetailsId());
        if (details == null) { //检测指定的景区是否为空
            map.put(RESULT, "F");
            map.put(TIPS, "没有该景区！");
            return map;
        }
        try { //异常处理（捕获异常）
            //插入数据
            collectionMapper.insert(collection);
            //更新数据
            collectionMapper.updateByPrimaryKey(collection);
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
     * 查询用户收藏信息
     * @param userId 用户编号
     * @return
     */
    @RequestMapping("/queryAllUserCollection")
    public Map<String, Object> queryAllUserCollection(int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        //true则提示未登录，false则下一步
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录！");
            return map;
        }
        UserCollectionExample collectionExample = new UserCollectionExample();
        collectionExample.createCriteria().andUserIdEqualTo(userId);
        List<UserCollection> collectionList = collectionMapper.selectByExample(collectionExample);
        if (collectionList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "暂无收藏！");
            return map;
        }
        List<ScenicDetails> scenicDetailsList = new ArrayList<>();
        for (UserCollection colle : collectionList) {
            ScenicDetails scenicDetails = scenicDetailsMapper.selectByPrimaryKey(colle.getScenicDetailsId());
            scenicDetailsList.add(scenicDetails);
        }
        List<ScenicSpot> scenicSpotList = new ArrayList<>();
        for (ScenicDetails details : scenicDetailsList) {
            ScenicSpot scenicSpot = scenicSpotMapper.selectByPrimaryKey(details.getScenicSpotId());
            scenicSpotList.add(scenicSpot);
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicSpotList);
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
     * 通过景区编号查询景区信息详情
     *
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
        map.put(ONE_DATA, scenicSpotMapper.selectByPrimaryKey(scenicSpotId));
        map.put(TWO_DATA, scenicDetailsMapper.selectByPrimaryKey(scenicSpotId));
        ScenicPicExample example = new ScenicPicExample();
        //拼接查询
        example.createCriteria().andScenicSpotIdEqualTo(scenicSpotId);
        map.put(THREE_DATA, scenicPicMapper.selectByExample(example));
        return map;
    }

    /**
     * 通过景区详情编号查询景区详情信息
     *
     * @param scenicDetailsId 景区编号
     * @return
     */
    @RequestMapping("queryByScenicDetails")
    public Map<String, Object> queryByScenicDetails(int scenicDetailsId) {
        Map<String, Object> map = new HashMap<>();
        ScenicDetails scenicDetails = scenicDetailsMapper.selectByPrimaryKey(scenicDetailsId);
        if (scenicDetails == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicDetails);
        return map;
    }

    /**
     * 查询地区编号对应景区
     * @return
     */
    @RequestMapping("queryScenicByRegionId")
    public List<ScenicSpot> queryScenicByRegionId(int regionId){
        ScenicSpotExample pe = new ScenicSpotExample();
        pe.createCriteria().andRegionIdEqualTo(regionId);
        return scenicSpotMapper.selectByExample(pe);
    }

    /**
     * 查询出游方式对应景区
     * @param travelMode 出游方式
     * @return 返回结果
     */
    @RequestMapping("queryByTravelMode")
    public Map<String, Object> queryByTravelMode(int travelMode) {
        Map<String, Object> map = new HashMap<>();
        ScenicSpotExample scenicSpotExample = new ScenicSpotExample();
        scenicSpotExample.createCriteria().andTravelModeEqualTo(travelMode);
        List<ScenicSpot> scenicSpots = scenicSpotMapper.selectByExample(scenicSpotExample);
        if (scenicSpots == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA,scenicSpots);
        return map;
    }

    /**
     * 查询所有展区
     * @return 返回结果
     */
    @RequestMapping("queryAllExhibitionArea")
    public Map<String, Object> queryAllExhibitionArea() {
        Map<String, Object> map = new HashMap<>();
        map.put(RESULT, "S");
        map.put(ONE_DATA,exhibitionAreaMapper.selectByExample(null));
        return map;
    }

    /**
     * 查询对应展区
     * @param exhibitionAreaId 展区编号
     * @return 返回结果
     */
    @RequestMapping("queryExhibitionArea")
    public Map<String, Object> queryExhibitionArea(int exhibitionAreaId) {
        Map<String, Object> map = new HashMap<>();
        ExhibitionArea exhibitionArea = exhibitionAreaMapper.selectByPrimaryKey(exhibitionAreaId);
        if (exhibitionArea == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, exhibitionArea);
        return map;
    }

    /**
     * 查询展品信息详情
     * @param exhibitsId 展品编号
     * @return 返回结果
     */
    @RequestMapping("queryExhibitsDetails")
    public Map<String, Object> queryExhibitsDetails(int exhibitsId) {
        Map<String, Object> map = new HashMap<>();
        Exhibits exhibits = exhibitsMapper.selectByPrimaryKey(exhibitsId);
        if (exhibits == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, exhibitsMapper.selectByPrimaryKey(exhibitsId));
        return map;
    }

    /**
     * 查找所有展品
     * @return 返回结果
     */
    @RequestMapping("queryAllExhibits")
    public Map<String, Object> queryAllExhibits() {
        Map<String, Object> map = new HashMap<>();
        map.put(RESULT, "S");
        map.put(ONE_DATA,exhibitsMapper.selectByExample(null));
        return map;
    }

    /**
     * 查找展区下的所有展品
     * @param exhibitionAreaId 展区编号
     * @return 返回结果
     */
    @RequestMapping("queryByExhibitionArea")
    public Map<String, Object> queryByExhibitionArea(int exhibitionAreaId, int page) {
        Map<String, Object> map = new HashMap<>();
        ExhibitsExample exhibitsExample = new ExhibitsExample();
        exhibitsExample.createCriteria().andExhibitionAreaIdEqualTo(exhibitionAreaId);
        List<Exhibits> exhibits = exhibitsMapper.selectByExample(exhibitsExample);

        if (exhibits == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        Collections.sort(exhibits, new Comparator<Exhibits>() {
            @Override
            public int compare(Exhibits exhibits, Exhibits t1) {
                return t1.getLikeCount() - exhibits.getLikeCount();
            }
        });
        map.put(RESULT, "S");
        List<Exhibits> exhibits2 = new ArrayList<>();
        for (int i = page*5; i < page*5+5; i++) {
            if (i<exhibits.size()){
                exhibits2.add(exhibits.get(i));
            }
        }
        map.put(ONE_DATA,exhibits2);
        return map;
    }

    /**
     * 查找展品评论
     * @param exhibitsId 展品编号
     * @return 返回结果
     */
    @RequestMapping("queryExhibitsComment")
    public Map<String, Object> queryExhibitsComment(int exhibitsId) {
        Map<String, Object> map = new HashMap<>();
        ExhibitsCommentExample exhibitsCommentExample = new ExhibitsCommentExample();
        exhibitsCommentExample.createCriteria().andExhibitsIdEqualTo(exhibitsId);
        List<ExhibitsComment> exhibitsComments = exhibitsCommentMapper.selectByExample(exhibitsCommentExample);
        if (exhibitsComments == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该详情内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA,exhibitsComments);
        return map;
    }

    /**
     * 发送评论
     * @param exhibitsComment 展品评论
     * @return 返回结果
     */
    @RequestMapping("sendExhibitsComment")
    public Map<String, Object> sendExhibitsComment(@RequestBody ExhibitsComment exhibitsComment) {
        Map<String, Object> map = new HashMap<>();
        try {
            exhibitsComment.setCommentPraisePoints(0);
            exhibitsCommentMapper.insertSelective(exhibitsComment);
            exhibitsCommentMapper.updateByPrimaryKeySelective(exhibitsComment);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "发送失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "发送成功！");
        return map;
    }

    /**
     * 用户根据展品进行点赞，用户不能指定的展品进行多次点赞
     * 只能多个用户对指定的展品进行点赞
     * @param userId 用户编号
     * @param exhibitsId 展品编号
     * @return
     */
    @RequestMapping("addFabulousDetails")
    public Map<String, Object> addFabulousDetails(int userId, int exhibitsId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        Exhibits exhibits = exhibitsMapper.selectByPrimaryKey(exhibitsId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "请先登录！");
            return map;
        }
        if (exhibits == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该展品！");
            return map;
        }
        FabulousDetails fabulousDetails = new FabulousDetails();
        //查询点赞表的所有数据
        List<FabulousDetails> fabulousList = fabulousDetailsMapper.selectByExample(null);
        for (FabulousDetails details : fabulousList) {
            if (details.getUserId() == userId && details.getExhibitsId() == exhibitsId) {
                map.put(RESULT, "F");
                map.put(TIPS, "该用户已经对该展品进行点赞！");
                return map;
            }
        }
        try { //捕获异常
            //设置指定用户进行点赞
            fabulousDetails.setUserId(userId);
            //设置用户点赞的展品编号
            fabulousDetails.setExhibitsId(exhibitsId);
            //设置状态
            fabulousDetails.setFlag(1);
            //添加点赞数量
            fabulousDetails.setFabulousNumber(1);
            //插入数据
            fabulousDetailsMapper.insertSelective(fabulousDetails);
            //更新数据表
            fabulousDetailsMapper.updateByPrimaryKey(fabulousDetails);
        } catch (Exception e) {
            map.put(RESULT, "S");
            map.put(TIPS, "添加失败！");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "点赞成功！");
        return map;
    }

    /**
     * 查询用户对展品点赞状态
     * @param userId 用户编号
     * @param exhibitsId 展品编号
     * @return
     */
    @RequestMapping("queryFabulousDetailsFlag")
    public Map<String, Object> queryFabulousDetailsFlag(int userId, int exhibitsId) {
        Map<String, Object> map = new HashMap<>();
        FabulousDetailsExample fabulousDetailsExample = new FabulousDetailsExample();
        fabulousDetailsExample.createCriteria().andUserIdEqualTo(userId).andExhibitsIdEqualTo(exhibitsId);
        List<FabulousDetails> fabulousDetailsList = fabulousDetailsMapper.selectByExample(fabulousDetailsExample);
        User user = userMapper.selectByPrimaryKey(userId);
        Exhibits exhibits = exhibitsMapper.selectByPrimaryKey(exhibitsId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "请先登录！");
            return map;
        }
        if (exhibits == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该展品！");
            return map;
        }
        if (fabulousDetailsList.size() == 0) {
            map.put(RESULT, "S");
            map.put(ONE_DATA,0);
            return map;
        }else {
            map.put(RESULT, "S");
            map.put(ONE_DATA,fabulousDetailsList.get(0).getFlag());
            return map;
        }
    }

    /**
     * 对展品进行点赞或取消点赞
     * @param userId 用户编号
     * @param exhibitsId 展品编号
     * @return
     */
    @RequestMapping("setFabulousDetailsFlag")
    public Map<String, Object> setFabulousDetailsFlag(int userId, int exhibitsId) {
        Map<String, Object> map = new HashMap<>();
        FabulousDetailsExample fabulousDetailsExample = new FabulousDetailsExample();
        fabulousDetailsExample.createCriteria().andUserIdEqualTo(userId).andExhibitsIdEqualTo(exhibitsId);
        List<FabulousDetails> fabulousDetailsList = fabulousDetailsMapper.selectByExample(fabulousDetailsExample);
        User user = userMapper.selectByPrimaryKey(userId);
        Exhibits exhibits = exhibitsMapper.selectByPrimaryKey(exhibitsId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "请先登录！");
            return map;
        }
        if (exhibits == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该展品！");
            return map;
        }
        try {
            if (fabulousDetailsList.size() == 0){
                FabulousDetails fabulousDetails = new FabulousDetails();
                fabulousDetails.setUserId(userId);
                fabulousDetails.setExhibitsId(exhibitsId);
                fabulousDetails.setFlag(1);
                fabulousDetails.setFabulousNumber(1);
                fabulousDetailsMapper.insertSelective(fabulousDetails);
                fabulousDetailsMapper.updateByPrimaryKeySelective(fabulousDetails);
                map.put(RESULT, "S");
                map.put(ONE_DATA,fabulousDetails);
                map.put(TIPS, "点赞成功！");
                return map;
            }else if (fabulousDetailsList.get(0).getFlag() == 0){
                fabulousDetailsList.get(0).setFlag(1);
                fabulousDetailsMapper.updateByPrimaryKeySelective(fabulousDetailsList.get(0));
                map.put(RESULT, "S");
                map.put(ONE_DATA,fabulousDetailsList.get(0));
                map.put(TIPS, "点赞成功！");
                return map;
            }else {
                fabulousDetailsList.get(0).setFlag(0);
                fabulousDetailsMapper.updateByPrimaryKeySelective(fabulousDetailsList.get(0));
                map.put(RESULT, "S");
                map.put(ONE_DATA,fabulousDetailsList.get(0));
                map.put(TIPS, "点赞取消！");
                return map;
            }
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "请求失败！");
            return map;
        }
    }

    /**
     * 景区订单模块
     * 生成联系人信息
     * @param contacts
     * @return
     */
    @RequestMapping("addByContacts")
    public Map<String, Object> addByContacts(@RequestBody Contacts contacts) {
        Map<String, Object> map = new HashMap<>();
        try { //捕获异常
            contactsMapper.insertSelective(contacts);
            contactsMapper.updateByPrimaryKey(contacts);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功");
        return map;
    }

    /**
     * 删除指定联系人信息
     * @param contactsId
     * @return
     */
    @RequestMapping("deleteByContacts")
    public Map<String, Object> deleteByContacts(int contactsId) {
        Map<String, Object> map = new HashMap<>();
        Contacts contacts = contactsMapper.selectByPrimaryKey(contactsId);
        if (contacts == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该联系人");
            return map;
        }
        try { //捕获异常
            contactsMapper.deleteByPrimaryKey(contactsId);
            contactsMapper.updateByPrimaryKey(contacts);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "删除失败");
            return map;
        }
        map.put(RESULT, "F");
        map.put(TIPS, "删除成功");
        return map;
    }

    /**
     * 查询指定联系人信息
     * @param orderId
     * @return
     */
    @RequestMapping("queryByContacts")
    public Map<String, Object> queryByContacts(int orderId) {
        Map<String, Object> map = new HashMap<>();
        ContactsExample contactsExample = new ContactsExample();
        contactsExample.createCriteria().andOrderIdEqualTo(orderId);
        List<Contacts> contactsList = contactsMapper.selectByExample(contactsExample);
        if (contactsList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该订单联系人");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, contactsList);
        return map;
    }

    /**
     * 添加出行人
     * @param passenger
     * @return
     */
    @RequestMapping("addByPassenger")
    public Map<String, Object> addByPassenger(@RequestBody Passenger passenger) {
        Map<String, Object> map = new HashMap<>();
        try { //捕获异常
            passengerMapper.insertSelective(passenger);
            passengerMapper.updateByPrimaryKey(passenger);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功");
        return map;
    }

    /**
     * 删除出行人信息
     * @param passengerId
     * @return
     */
    @RequestMapping("deleteByPassenger")
    public Map<String, Object> deleteByPassenger(int passengerId) {
        Map<String, Object> map = new HashMap<>();
        Passenger passenger = passengerMapper.selectByPrimaryKey(passengerId);
        if (passenger == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该出行人信息，无法删除");
            return map;
        }
        try { //捕获异常
            passengerMapper.deleteByPrimaryKey(passengerId);
            passengerMapper.updateByPrimaryKey(passenger);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "删除失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "删除失败");
        return map;
    }

    /**
     * 查询出行人信息
     * @param orderId 订单编号
     * @return
     */
    @RequestMapping("queryByPassenger")
    public Map<String, Object> queryByPassenger(int orderId) {
        Map<String, Object> map = new HashMap<>();
        PassengerExample passengerExample = new PassengerExample();
        passengerExample.createCriteria().andOrderIdEqualTo(orderId);
        List<Passenger> passengerList = passengerMapper.selectByExample(passengerExample);
        if (passengerList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该订单出行人信息");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, passengerList);
        return map;
    }

    /**
     * 更新出行人信息
     * @param passenger
     * @return
     */
    @RequestMapping("updateByPassenger")
    public Map<String, Object> updateByPassenger(@RequestBody Passenger passenger) {
        Map<String, Object> map = new HashMap<>();
        Passenger pger = passengerMapper.selectByPrimaryKey(passenger.getPassengerId());
        if (pger == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该出行人信息");
            return map;
        }try { //捕获异常
            passengerMapper.updateByPrimaryKey(passenger);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "更新失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "更新成功");
        return map;
    }

    /**
     * 订单管理模块
     * 用户下单
     * @param order
     * @return
     */
    @RequestMapping("addByOrder")
    public Map<String, Object> addByOrder(@RequestBody Order order) {
        Map<String, Object> map = new HashMap<>();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        try { //捕获异常
            //设置下单日期为当前日期
            order.setOrderDate(date);
            orderMapper.insertSelective(order);
            orderMapper.updateByPrimaryKey(order);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功");
        return map;
    }

    /**
     * 订单管理模块
     * 删除订单
     * @param orderId
     * @return
     */
    @RequestMapping("deleteByOrder")
    public Map<String, Object> deleteByOrder(int orderId) {
        Map<String, Object> map = new HashMap<>();
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该订单");
            return map;
        }
        try { //捕获异常
            orderMapper.deleteByPrimaryKey(orderId);
            orderMapper.updateByPrimaryKey(order);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "删除失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "删除成功");
        return map;
    }

    /**
     * 订单管理模块
     * 查询订单
     * @param orderId
     * @return
     */
    @RequestMapping("queryByOrder")
    public Map<String, Object> queryByOrder(int userId, int orderId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该订单");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, order);
        return map;
    }

    /**
     * 订单管理模块
     * 查询全部订单
     * @param userId
     * @return
     */
    @RequestMapping("queryAllOrder")
    public Map<String, Object> queryAllOrder(int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        List<Order> orderList = orderMapper.selectByExample(null);
        if (orderList.size() < 1) {
            map.put(RESULT, "F");
            map.put(TIPS, "暂无订单");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, orderList);
        return map;
    }

    /**
     * 订单管理模块
     * 修改订单状态 根据订单状态来来获取景区订单的状态信息
     * @param orderId
     * @return
     */
    @RequestMapping("updateByOrderState")
    public Map<String, Object> updateByOrderState(int orderId, int orderState) {
        Map<String, Object> map = new HashMap<>();
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该订单");
            return map;
        }
        try { //捕获异常
            order.setOrderState(orderState);
            orderMapper.updateByPrimaryKey(order);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "修改订单状态成功失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "修改订单状态成功");
        return map;
    }

    /**
     * 订单管理模块
     * 根据指定用户和订单状态来来获取景区订单的列表信息
     * @param userId 用户比那好
     * @param orderState 订单状态
     * @return
     */
    @RequestMapping("queryByOrderState")
    public Map<String, Object> queryByOrderState(int userId, int orderState) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        OrderExample example = new OrderExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<Order> orderList = orderMapper.selectByExample(example);
        if (orderList.size() < 1) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有相关的订单");
            return map;
        }
        //如果传入的是0 则直接返回全部订单数据 否则继续执行以下代码
        if (orderState == 0) {
            map.put(RESULT, "S");
            map.put(ONE_DATA, orderList);
            return map;
        }
        List<Order> sOrderList = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getOrderState() == orderState) {
                sOrderList.add(order);
            }
        }
        if (sOrderList.size() < 1) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有相关的订单");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, sOrderList);
        return map;
    }

    /**
     * 查询订单、联系人、出行人信息
     * @param contactsName
     * @param identityCard
     * @return
     */
    @RequestMapping("queryNewestByOCP")
    public Map<String, Object> queryNewestByOCP(String contactsName, String identityCard) {
        Map<String, Object> map = new HashMap<>();
        //获取所有订单数据集
        List<Order> orderList = orderMapper.selectByExample(null);
        if (orderList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有相关的订单");
            return map;
        }
        //获取所有联系人数据集
        List<Contacts> contactsList = contactsMapper.selectByExample(null);
        if (contactsList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有添加联系人");
            return map;
        }
        //获取所有出行人数据集
        List<Passenger> passengerList = passengerMapper.selectByExample(null);
        if (passengerList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有添加出行人");
            return map;
        }
        //循环处理联系人数据
        for (Contacts contacts : contactsList) {
            if (contacts.getContactsName().equals(contactsName)) {
                map.put(RESULT, "S");
                map.put(TWO_DATA, contacts);
                break;
            } else {
                map.put(RESULT, "F");
                map.put(TIPS, "获取联系人信息失败");
            }
        }
        //循环处理出行人数据
        for (Passenger passenger : passengerList) {
            if (passenger.getIdentityCard().equals(identityCard)) {
                map.put(RESULT, "S");
                map.put(THREE_DATA, passenger);
                break;
            } else {
                map.put(RESULT, "F");
                map.put(TIPS, "获取出行人信息失败");
            }
        }
        map.put(ONE_DATA, orderList.get(orderList.size()-1));
        return map;
    }

    /**
     * 查询最新订单
     * @return
     */
    @RequestMapping("queryNewestOrder")
    public Map<String, Object> queryNewestOrder(int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        //获取所有订单数据集
        List<Order> orderList = orderMapper.selectByExample(null);
        if (orderList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有相关的订单");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, orderList.get(orderList.size()-1));
        return map;
    }

    /**
     * 查询最新订单
     * @return
     */
    @RequestMapping("queryContactsAndPassenger")
    public Map<String, Object> queryContactsAndPassenger(int userId, int orderId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有该订单");
            return map;
        }
        ContactsExample contactsExample = new ContactsExample();
        contactsExample.createCriteria().andOrderIdEqualTo(orderId);
        List<Contacts> contactsList = contactsMapper.selectByExample(contactsExample);
        if (contactsList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "该订单联系人为空");
            return map;
        } else {
            map.put(RESULT, "S");
            map.put(ONE_DATA, contactsList);
        }
        PassengerExample passengerExample = new PassengerExample();
        passengerExample.createCriteria().andOrderIdEqualTo(orderId);
        List<Passenger> passengerList = passengerMapper.selectByExample(passengerExample);
        if (passengerList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "该订单出行人为空");
            return map;
        } else {
            map.put(RESULT, "S");
            map.put(TWO_DATA, passengerList);
        }
        return map;
    }


    /**
     * 添加行程
     * @param trip 参数
     * @return
     */
    @RequestMapping("addByTrips")
    public Map<String, Object> queByTrips(@RequestBody Trip trip) {
        Map<String, Object> map = new HashMap<>();
        List<Trip> tripList = tripMapper.selectByExample(null);
        boolean flag = false;
        for (Trip trips: tripList) {
            if (trip.getUserId().equals(trips.getUserId()) && trip.getScenicSpotId().equals(trips.getScenicSpotId())) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if(flag) {
            map.put(RESULT, "F");
            map.put(TIPS, "该景区已在您的行程中！");
        } else {
            try { //捕获异常
                //插入数据
                tripMapper.insert(trip);
                //更新数据
                tripMapper.updateByPrimaryKey(trip);
            } catch (Exception e) {
                map.put(RESULT, "F");
                map.put(TIPS, "添加失败");
                return map;
            }
            map.put(RESULT, "S");
            map.put(TIPS, "添加成功");
        }
        return map;
    }

    /**
     * 查询行程信息
     * @param userId
     * @return
     */
    @RequestMapping("queryAllTrips")
    public Map<String, Object> queryAllTrips(int userId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有登录，请先登录");
            return map;
        }
        TripExample tripExample = new TripExample();
        tripExample.createCriteria().andUserIdEqualTo(userId);
        List<Trip> tripList = tripMapper.selectByExample(tripExample);
        if (tripList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "您还没有行程");
            return map;
        }
        List<ScenicSpot> scenicSpotList = new ArrayList<>();
        for (Trip trip : tripList) {
            scenicSpotList.add(scenicSpotMapper.selectByPrimaryKey(trip.getScenicSpotId()));
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicSpotList);
        return map;
    }

    /**
     * 模糊搜索
     * @param pStr
     * @return
     */
    @RequestMapping("searchArea")
    public Map<String, Object> searchArea(String pStr) {
        Map<String, Object> map = new HashMap<>();
        if (pStr.length() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "请输入您要搜索的内容");
            return map;
        }
        //查询所有地区
        List<ScenicRegion> scenicRegionList = scenicRegionMapper.selectByExample(null);
        //查询所有景区
        List<ScenicSpot> scenicSpotList = scenicSpotMapper.selectByExample(null);
        //存储地区集合
        List<ScenicRegion> scenicRegions = new ArrayList<>();
        //存储景区集合
        List<ScenicSpot> scenicSpots = new ArrayList<>();
        for (ScenicRegion region : scenicRegionList) {
            if (region.getRegionName().contains(pStr)) scenicRegions.add(region);
        }
        //循环遍历景区
        for (ScenicSpot spot : scenicSpotList) {
            if (spot.getScenicSpotTheme().contains(pStr)) scenicSpots.add(spot);
        }
        String[] sList = new String[]{"国内游", "出境游", "自由行", "跟团游", "主题游", "周边游", "一日游", "定制游"};
        //循环遍历出游方式
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].contains(pStr)) {
                for (ScenicSpot spot : scenicSpotList) {
                    if (spot.getTravelMode() == i) scenicSpots.add(spot);
                }
            }
        }
        if (scenicRegions.size() == 0 && scenicSpots.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "没有您输入的查找内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicRegions);
        map.put(TWO_DATA, scenicSpots);
        return map;
    }

    /**
     * 添加订单详情
     * @return
     */
    @RequestMapping("addByOrderDedails")
    public Map<String, Object> addByOrderDedails(@RequestBody OrderDetails orderDetails) {
        Map<String, Object> map = new HashMap<>();
        try { //捕获异常
            //插入数据
            orderDetailsMapper.insert(orderDetails);
            //更新数据
            orderDetailsMapper.updateByPrimaryKey(orderDetails);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "添加失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "添加成功");
        return map;
    }

    /**
     * 根据订单查询订单详情
     * @param orderId 订单状态
     * @return
     */
    @RequestMapping("queryByOrderDedails")
    public Map<String, Object> queryByOrderDedails(int orderId) {
        Map<String, Object> map = new HashMap<>();
        OrderDetailsExample example = new OrderDetailsExample();
        example.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderDetails> orderDetailsList = orderDetailsMapper.selectByExample(example);
        if (orderDetailsList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "暂无该订单详情");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, orderDetailsList.get(0));
        map.put(TWO_DATA, orderMapper.selectByPrimaryKey(orderDetailsList.get(0).getOrderId()));
        map.put(THREE_DATA, contactsMapper.selectByPrimaryKey(orderDetailsList.get(0).getContactsId()));
        map.put(FOUR_DATA, passengerMapper.selectByPrimaryKey(orderDetailsList.get(0).getPassengerId()));
        return map;
    }

    /**
     * 查询景区类型内容
     * @param type 类型
     * @return
     */
    @RequestMapping("queryRomanticTypeScenicSpot")
    public Map<String, Object> queryRomanticTypeScenicSpot(String type) {
        Map<String, Object> map = new HashMap<>();
        List<ScenicSpot> scenicSpotList = scenicSpotMapper.selectByExample(null);
        if (scenicSpotList.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "无景区内容");
            return map;
        }
        List<ScenicSpot> scenicSpotList1 = new ArrayList<>();
        for (ScenicSpot spot : scenicSpotList) {
            if (spot.getScenicSpotDescribe().equals(type)) {
                scenicSpotList1.add(spot);
            }
        }
        if (scenicSpotList1.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该景区类型内容");
            return map;
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicSpotList1);
        return map;
    }

    /**
     * 订单支付
     * @param userId
     * @param orderId
     * @return
     */
    @RequestMapping("orderPayment")
    public Map<String, Object> orderPayment(int userId, int orderId) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该用户");
            return map;
        }
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该订单");
            return map;
        }
        Double uMoney = user.getUserMoney();
        Double oMoney = order.getOrderPrice();
        try {
            //对用户账户进行扣款
            user.setUserMoney(uMoney - oMoney);
            //修改订单状态
            order.setOrderState(2);
            //更新数据
            userMapper.updateByPrimaryKey(user);
            orderMapper.updateByPrimaryKey(order);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "扣款失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "支付成功");
        return map;
    }

    /**
     * 订单支付，使用密码支付
     * @param userId
     * @param orderId
     * @param password
     * @return
     */
    @RequestMapping("orderPaymentPassWord")
    public Map<String, Object> orderPaymentPassWord(int userId, int orderId, String password) {
        Map<String, Object> map = new HashMap<>();
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该用户");
            return map;
        }
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            map.put(RESULT, "F");
            map.put(TIPS, "无该订单");
            return map;
        }
        if (!password.equals("111111")) {
            map.put(RESULT, "F");
            map.put(TIPS, "密码输入错误，请重新输入");
            return map;
        }
        Double uMoney = user.getUserMoney();
        Double oMoney = order.getOrderPrice();
        try {
            //对用户账户进行扣款
            user.setUserMoney(uMoney - oMoney);
            //修改订单状态
            order.setOrderState(2);
            //更新数据
            userMapper.updateByPrimaryKey(user);
            orderMapper.updateByPrimaryKey(order);
        } catch (Exception e) {
            map.put(RESULT, "F");
            map.put(TIPS, "扣款失败");
            return map;
        }
        map.put(RESULT, "S");
        map.put(TIPS, "支付成功");
        return map;
    }

    /**
     * 刷新随机返回8条数据
     * @return
     */
    @RequestMapping("onRefresh")
    public Map<String, Object> onRefresh() {
        Map<String, Object> map = new HashMap<>();
        List<ScenicSpot> scenicSpotList = scenicSpotMapper.selectByExample(null);
        List<ScenicSpot> scenicSpotList1 = new ArrayList<>();
        int max = scenicSpotList.size();
        int min = 1;
        //创建随机数对象
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            scenicSpotList1.add(scenicSpotMapper.selectByPrimaryKey(random.nextInt(max - min) + min));
        }
        if (scenicSpotList1.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "刷新失败!");
        }
        map.put(RESULT, "S");
        map.put(TIPS, "已为您更新9条内容");
        map.put(ONE_DATA, scenicSpotList1);
        return map;
    }

    /**
     * 上拉加载刷新
     * @return
     */
    @RequestMapping("onFooterFinish")
    public Map<String, Object> onFooterFinish() {
        Map<String, Object> map = new HashMap<>();
        List<ScenicSpot> scenicSpotList = scenicSpotMapper.selectByExample(null);
        List<ScenicSpot> scenicSpotList1 = new ArrayList<>();
        int max = scenicSpotList.size();
        int min = 1;
        //创建随机数对象
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            scenicSpotList1.add(scenicSpotMapper.selectByPrimaryKey(random.nextInt(max - min) + min));
        }
        if (scenicSpotList1.size() == 0) {
            map.put(RESULT, "F");
            map.put(TIPS, "加载失败");
        }
        map.put(RESULT, "S");
        map.put(ONE_DATA, scenicSpotList1);
        return map;
    }

}
