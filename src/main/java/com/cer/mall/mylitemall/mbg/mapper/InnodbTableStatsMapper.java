package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.InnodbTableStats;
import com.cer.mall.mylitemall.mbg.model.InnodbTableStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTableStatsMapper {
    long countByExample(InnodbTableStatsExample example);

    int deleteByExample(InnodbTableStatsExample example);

    int deleteByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    List<InnodbTableStats> selectByExample(InnodbTableStatsExample example);

    InnodbTableStats selectByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName);

    int updateByExampleSelective(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByExample(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}