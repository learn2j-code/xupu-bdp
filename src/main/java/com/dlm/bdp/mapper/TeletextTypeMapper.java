package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.pojo.TeletextTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeletextTypeMapper {
    int countByExample(TeletextTypeExample example);

    int deleteByExample(TeletextTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeletextType record);

    int insertSelective(TeletextType record);

    List<TeletextType> selectByExample(TeletextTypeExample example);

    TeletextType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeletextType record, @Param("example") TeletextTypeExample example);

    int updateByExample(@Param("record") TeletextType record, @Param("example") TeletextTypeExample example);

    int updateByPrimaryKeySelective(TeletextType record);

    int updateByPrimaryKey(TeletextType record);
}