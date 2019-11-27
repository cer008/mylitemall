package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.TablesPriv;
import com.cer.mall.mylitemall.mbg.model.TablesPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesPrivMapper {
    long countByExample(TablesPrivExample example);

    int deleteByExample(TablesPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("tableName") String tableName);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    List<TablesPriv> selectByExample(TablesPrivExample example);

    TablesPriv selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("tableName") String tableName);

    int updateByExampleSelective(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByExample(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}