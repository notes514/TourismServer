package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.NewsPublish;
import com.ncvt.tourism.model.NewsPublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsPublishMapper {
    long countByExample(NewsPublishExample example);

    int deleteByExample(NewsPublishExample example);

    int deleteByPrimaryKey(Integer publishId);

    int insert(NewsPublish record);

    int insertSelective(NewsPublish record);

    List<NewsPublish> selectByExample(NewsPublishExample example);

    NewsPublish selectByPrimaryKey(Integer publishId);

    int updateByExampleSelective(@Param("record") NewsPublish record, @Param("example") NewsPublishExample example);

    int updateByExample(@Param("record") NewsPublish record, @Param("example") NewsPublishExample example);

    int updateByPrimaryKeySelective(NewsPublish record);

    int updateByPrimaryKey(NewsPublish record);
}