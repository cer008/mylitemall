package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.PmsProductOperateLog;
import com.cer.mall.mylitemall.mbg.model.PmsProductOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductOperateLogMapper {
    int countByExample(PmsProductOperateLogExample example);

    int deleteByExample(PmsProductOperateLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    int insertSelective(PmsProductOperateLog record);

    List<PmsProductOperateLog> selectByExample(PmsProductOperateLogExample example);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);

    int updateByExample(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);

    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    int updateByPrimaryKey(PmsProductOperateLog record);
}