package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.CommonAddr;
import com.ncvt.tourism.model.CommonAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonAddrMapper {
    long countByExample(CommonAddrExample example);

    int deleteByExample(CommonAddrExample example);

    int deleteByPrimaryKey(Integer commonAddrId);

    int insert(CommonAddr record);

    int insertSelective(CommonAddr record);

    List<CommonAddr> selectByExample(CommonAddrExample example);

    CommonAddr selectByPrimaryKey(Integer commonAddrId);

    int updateByExampleSelective(@Param("record") CommonAddr record, @Param("example") CommonAddrExample example);

    int updateByExample(@Param("record") CommonAddr record, @Param("example") CommonAddrExample example);

    int updateByPrimaryKeySelective(CommonAddr record);

    int updateByPrimaryKey(CommonAddr record);
}