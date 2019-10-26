package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.FabulousDetails;
import com.ncvt.tourism.model.FabulousDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FabulousDetailsMapper {
    long countByExample(FabulousDetailsExample example);

    int deleteByExample(FabulousDetailsExample example);

    int deleteByPrimaryKey(Integer fabulousDetailsId);

    int insert(FabulousDetails record);

    int insertSelective(FabulousDetails record);

    List<FabulousDetails> selectByExample(FabulousDetailsExample example);

    FabulousDetails selectByPrimaryKey(Integer fabulousDetailsId);

    int updateByExampleSelective(@Param("record") FabulousDetails record, @Param("example") FabulousDetailsExample example);

    int updateByExample(@Param("record") FabulousDetails record, @Param("example") FabulousDetailsExample example);

    int updateByPrimaryKeySelective(FabulousDetails record);

    int updateByPrimaryKey(FabulousDetails record);
}