package com.ncvt.tourism.mapper;

import com.ncvt.tourism.model.AmountRecharge;
import com.ncvt.tourism.model.AmountRechargeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmountRechargeMapper {
    long countByExample(AmountRechargeExample example);

    int deleteByExample(AmountRechargeExample example);

    int deleteByPrimaryKey(Integer rechargeId);

    int insert(AmountRecharge record);

    int insertSelective(AmountRecharge record);

    List<AmountRecharge> selectByExample(AmountRechargeExample example);

    AmountRecharge selectByPrimaryKey(Integer rechargeId);

    int updateByExampleSelective(@Param("record") AmountRecharge record, @Param("example") AmountRechargeExample example);

    int updateByExample(@Param("record") AmountRecharge record, @Param("example") AmountRechargeExample example);

    int updateByPrimaryKeySelective(AmountRecharge record);

    int updateByPrimaryKey(AmountRecharge record);
}