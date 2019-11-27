package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.ProcsPriv;
import com.cer.mall.mylitemall.mbg.model.ProcsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    long countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    ProcsPriv selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}