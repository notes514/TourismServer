package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.MessagePush;
import com.ncvt.tourism.model.MessagePushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagePushMapper {
    long countByExample(MessagePushExample example);

    int deleteByExample(MessagePushExample example);

    int deleteByPrimaryKey(Integer pushId);

    int insert(MessagePush record);

    int insertSelective(MessagePush record);

    List<MessagePush> selectByExample(MessagePushExample example);

    MessagePush selectByPrimaryKey(Integer pushId);

    int updateByExampleSelective(@Param("record") MessagePush record, @Param("example") MessagePushExample example);

    int updateByExample(@Param("record") MessagePush record, @Param("example") MessagePushExample example);

    int updateByPrimaryKeySelective(MessagePush record);

    int updateByPrimaryKey(MessagePush record);
}