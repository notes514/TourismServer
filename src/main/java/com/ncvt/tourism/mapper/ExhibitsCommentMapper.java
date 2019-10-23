package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.ExhibitsComment;
import com.ncvt.tourism.model.ExhibitsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitsCommentMapper {
    long countByExample(ExhibitsCommentExample example);

    int deleteByExample(ExhibitsCommentExample example);

    int deleteByPrimaryKey(Integer exhibitsCommentId);

    int insert(ExhibitsComment record);

    int insertSelective(ExhibitsComment record);

    List<ExhibitsComment> selectByExample(ExhibitsCommentExample example);

    ExhibitsComment selectByPrimaryKey(Integer exhibitsCommentId);

    int updateByExampleSelective(@Param("record") ExhibitsComment record, @Param("example") ExhibitsCommentExample example);

    int updateByExample(@Param("record") ExhibitsComment record, @Param("example") ExhibitsCommentExample example);

    int updateByPrimaryKeySelective(ExhibitsComment record);

    int updateByPrimaryKey(ExhibitsComment record);
}