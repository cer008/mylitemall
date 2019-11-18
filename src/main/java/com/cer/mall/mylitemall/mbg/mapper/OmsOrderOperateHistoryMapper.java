package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.OmsOrderOperateHistory;
import com.cer.mall.mylitemall.mbg.model.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryMapper {
    int countByExample(OmsOrderOperateHistoryExample example);

    int deleteByExample(OmsOrderOperateHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);
}