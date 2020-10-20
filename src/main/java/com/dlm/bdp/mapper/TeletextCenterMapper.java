package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.TeletextCenter;
import com.dlm.bdp.pojo.TeletextCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeletextCenterMapper {
    int countByExample(TeletextCenterExample example);

    int deleteByExample(TeletextCenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeletextCenter record);

    int insertSelective(TeletextCenter record);

    List<TeletextCenter> selectByExample(TeletextCenterExample example);

    TeletextCenter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeletextCenter record, @Param("example") TeletextCenterExample example);

    int updateByExample(@Param("record") TeletextCenter record, @Param("example") TeletextCenterExample example);

    int updateByPrimaryKeySelective(TeletextCenter record);

    int updateByPrimaryKey(TeletextCenter record);
}