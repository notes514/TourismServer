package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.Evaluatetion;
import com.ncvt.tourism.model.EvaluatetionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluatetionMapper {
    long countByExample(EvaluatetionExample example);

    int deleteByExample(EvaluatetionExample example);

    int deleteByPrimaryKey(Integer evaluatetionId);

    int insert(Evaluatetion record);

    int insertSelective(Evaluatetion record);

    List<Evaluatetion> selectByExample(EvaluatetionExample example);

    Evaluatetion selectByPrimaryKey(Integer evaluatetionId);

    int updateByExampleSelective(@Param("record") Evaluatetion record, @Param("example") EvaluatetionExample example);

    int updateByExample(@Param("record") Evaluatetion record, @Param("example") EvaluatetionExample example);

    int updateByPrimaryKeySelective(Evaluatetion record);

    int updateByPrimaryKey(Evaluatetion record);
}