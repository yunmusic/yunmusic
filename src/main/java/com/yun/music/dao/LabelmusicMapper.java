package com.yun.music.dao;

import com.yun.music.entity.Labelmusic;

public interface LabelmusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Labelmusic record);

    int insertSelective(Labelmusic record);

    Labelmusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Labelmusic record);

    int updateByPrimaryKey(Labelmusic record);
}