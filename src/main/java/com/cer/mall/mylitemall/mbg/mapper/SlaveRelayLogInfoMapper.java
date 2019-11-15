package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.SlaveRelayLogInfo;
import com.cer.mall.mylitemall.mbg.model.SlaveRelayLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveRelayLogInfoMapper {
    int countByExample(SlaveRelayLogInfoExample example);

    int deleteByExample(SlaveRelayLogInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SlaveRelayLogInfo record);

    int insertSelective(SlaveRelayLogInfo record);

    List<SlaveRelayLogInfo> selectByExampleWithBLOBs(SlaveRelayLogInfoExample example);

    List<SlaveRelayLogInfo> selectByExample(SlaveRelayLogInfoExample example);

    SlaveRelayLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExample(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByPrimaryKeySelective(SlaveRelayLogInfo record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfo record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}