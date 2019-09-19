package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.MemberPower;
import com.ncvt.tourism.model.MemberPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberPowerMapper {
    long countByExample(MemberPowerExample example);

    int deleteByExample(MemberPowerExample example);

    int deleteByPrimaryKey(Integer powerId);

    int insert(MemberPower record);

    int insertSelective(MemberPower record);

    List<MemberPower> selectByExample(MemberPowerExample example);

    MemberPower selectByPrimaryKey(Integer powerId);

    int updateByExampleSelective(@Param("record") MemberPower record, @Param("example") MemberPowerExample example);

    int updateByExample(@Param("record") MemberPower record, @Param("example") MemberPowerExample example);

    int updateByPrimaryKeySelective(MemberPower record);

    int updateByPrimaryKey(MemberPower record);
}