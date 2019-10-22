package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ExhibitionArea;
import com.ncvt.tourism.model.ExhibitionAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitionAreaMapper {
    long countByExample(ExhibitionAreaExample example);

    int deleteByExample(ExhibitionAreaExample example);

    int deleteByPrimaryKey(Integer exhibitionAreaId);

    int insert(ExhibitionArea record);

    int insertSelective(ExhibitionArea record);

    List<ExhibitionArea> selectByExample(ExhibitionAreaExample example);

    ExhibitionArea selectByPrimaryKey(Integer exhibitionAreaId);

    int updateByExampleSelective(@Param("record") ExhibitionArea record, @Param("example") ExhibitionAreaExample example);

    int updateByExample(@Param("record") ExhibitionArea record, @Param("example") ExhibitionAreaExample example);

    int updateByPrimaryKeySelective(ExhibitionArea record);

    int updateByPrimaryKey(ExhibitionArea record);
}