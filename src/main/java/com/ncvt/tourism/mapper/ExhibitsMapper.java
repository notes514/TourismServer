package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.Exhibits;
import com.ncvt.tourism.model.ExhibitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitsMapper {
    long countByExample(ExhibitsExample example);

    int deleteByExample(ExhibitsExample example);

    int deleteByPrimaryKey(Integer exhibitsId);

    int insert(Exhibits record);

    int insertSelective(Exhibits record);

    List<Exhibits> selectByExample(ExhibitsExample example);

    Exhibits selectByPrimaryKey(Integer exhibitsId);

    int updateByExampleSelective(@Param("record") Exhibits record, @Param("example") ExhibitsExample example);

    int updateByExample(@Param("record") Exhibits record, @Param("example") ExhibitsExample example);

    int updateByPrimaryKeySelective(Exhibits record);

    int updateByPrimaryKey(Exhibits record);
}