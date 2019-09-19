package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ScenicDetails;
import com.ncvt.tourism.model.ScenicDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicDetailsMapper {
    long countByExample(ScenicDetailsExample example);

    int deleteByExample(ScenicDetailsExample example);

    int deleteByPrimaryKey(Integer scenicDetailsId);

    int insert(ScenicDetails record);

    int insertSelective(ScenicDetails record);

    List<ScenicDetails> selectByExample(ScenicDetailsExample example);

    ScenicDetails selectByPrimaryKey(Integer scenicDetailsId);

    int updateByExampleSelective(@Param("record") ScenicDetails record, @Param("example") ScenicDetailsExample example);

    int updateByExample(@Param("record") ScenicDetails record, @Param("example") ScenicDetailsExample example);

    int updateByPrimaryKeySelective(ScenicDetails record);

    int updateByPrimaryKey(ScenicDetails record);
}