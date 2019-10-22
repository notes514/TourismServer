package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ExhibitsPic;
import com.ncvt.tourism.model.ExhibitsPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitsPicMapper {
    long countByExample(ExhibitsPicExample example);

    int deleteByExample(ExhibitsPicExample example);

    int deleteByPrimaryKey(Integer exhibitsPicId);

    int insert(ExhibitsPic record);

    int insertSelective(ExhibitsPic record);

    List<ExhibitsPic> selectByExample(ExhibitsPicExample example);

    ExhibitsPic selectByPrimaryKey(Integer exhibitsPicId);

    int updateByExampleSelective(@Param("record") ExhibitsPic record, @Param("example") ExhibitsPicExample example);

    int updateByExample(@Param("record") ExhibitsPic record, @Param("example") ExhibitsPicExample example);

    int updateByPrimaryKeySelective(ExhibitsPic record);

    int updateByPrimaryKey(ExhibitsPic record);
}