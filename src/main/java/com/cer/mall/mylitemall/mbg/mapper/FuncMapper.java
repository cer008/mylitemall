package com.cer.mall.mylitemall.mbg.mapper;

import com.cer.mall.mylitemall.mbg.model.Func;
import com.cer.mall.mylitemall.mbg.model.FuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuncMapper {
    long countByExample(FuncExample example);

    int deleteByExample(FuncExample example);

    int deleteByPrimaryKey(String name);

    int insert(Func record);

    int insertSelective(Func record);

    List<Func> selectByExample(FuncExample example);

    Func selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Func record, @Param("example") FuncExample example);

    int updateByExample(@Param("record") Func record, @Param("example") FuncExample example);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}