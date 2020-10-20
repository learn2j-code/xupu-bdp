package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.AreaInfo;
import com.dlm.bdp.pojo.AreaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaInfoMapper {
    int countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);
}