package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.Trip;
import com.ncvt.tourism.model.TripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TripMapper {
    long countByExample(TripExample example);

    int deleteByExample(TripExample example);

    int deleteByPrimaryKey(Integer tripId);

    int insert(Trip record);

    int insertSelective(Trip record);

    List<Trip> selectByExample(TripExample example);

    Trip selectByPrimaryKey(Integer tripId);

    int updateByExampleSelective(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByExample(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByPrimaryKeySelective(Trip record);

    int updateByPrimaryKey(Trip record);
}