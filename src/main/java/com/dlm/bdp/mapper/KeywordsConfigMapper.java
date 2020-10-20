package com.dlm.bdp.mapper;

import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.KeywordsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordsConfigMapper {
    int countByExample(KeywordsConfigExample example);

    int deleteByExample(KeywordsConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeywordsConfig record);

    int insertSelective(KeywordsConfig record);

    List<KeywordsConfig> selectByExample(KeywordsConfigExample example);

    KeywordsConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeywordsConfig record, @Param("example") KeywordsConfigExample example);

    int updateByExample(@Param("record") KeywordsConfig record, @Param("example") KeywordsConfigExample example);

    int updateByPrimaryKeySelective(KeywordsConfig record);

    int updateByPrimaryKey(KeywordsConfig record);
}