package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.UserPay;
import com.ncvt.tourism.model.UserPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPayMapper {
    long countByExample(UserPayExample example);

    int deleteByExample(UserPayExample example);

    int deleteByPrimaryKey(Integer payId);

    int insert(UserPay record);

    int insertSelective(UserPay record);

    List<UserPay> selectByExample(UserPayExample example);

    UserPay selectByPrimaryKey(Integer payId);

    int updateByExampleSelective(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByExample(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByPrimaryKeySelective(UserPay record);

    int updateByPrimaryKey(UserPay record);
}