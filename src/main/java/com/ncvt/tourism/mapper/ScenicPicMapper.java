package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ScenicPic;
import com.ncvt.tourism.model.ScenicPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicPicMapper {
    long countByExample(ScenicPicExample example);

    int deleteByExample(ScenicPicExample example);

    int deleteByPrimaryKey(Integer scenicPicId);

    int insert(ScenicPic record);

    int insertSelective(ScenicPic record);

    List<ScenicPic> selectByExample(ScenicPicExample example);

    ScenicPic selectByPrimaryKey(Integer scenicPicId);

    int updateByExampleSelective(@Param("record") ScenicPic record, @Param("example") ScenicPicExample example);

    int updateByExample(@Param("record") ScenicPic record, @Param("example") ScenicPicExample example);

    int updateByPrimaryKeySelective(ScenicPic record);

    int updateByPrimaryKey(ScenicPic record);
}