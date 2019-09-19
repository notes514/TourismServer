package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ScenicRegion;
import com.ncvt.tourism.model.ScenicRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicRegionMapper {
    long countByExample(ScenicRegionExample example);

    int deleteByExample(ScenicRegionExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(ScenicRegion record);

    int insertSelective(ScenicRegion record);

    List<ScenicRegion> selectByExample(ScenicRegionExample example);

    ScenicRegion selectByPrimaryKey(Integer regionId);

    int updateByExampleSelective(@Param("record") ScenicRegion record, @Param("example") ScenicRegionExample example);

    int updateByExample(@Param("record") ScenicRegion record, @Param("example") ScenicRegionExample example);

    int updateByPrimaryKeySelective(ScenicRegion record);

    int updateByPrimaryKey(ScenicRegion record);
}