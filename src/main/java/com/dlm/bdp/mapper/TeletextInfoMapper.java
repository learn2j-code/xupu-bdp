package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeletextInfoMapper {
    int countByExample(TeletextInfoExample example);

    int deleteByExample(TeletextInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeletextInfo record);

    int insertSelective(TeletextInfo record);

    List<TeletextInfo> selectByExample(TeletextInfoExample example);

    TeletextInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeletextInfo record, @Param("example") TeletextInfoExample example);

    int updateByExample(@Param("record") TeletextInfo record, @Param("example") TeletextInfoExample example);

    int updateByPrimaryKeySelective(TeletextInfo record);

    int updateByPrimaryKey(TeletextInfo record);
}