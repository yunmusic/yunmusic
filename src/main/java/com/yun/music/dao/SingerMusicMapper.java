package com.yun.music.dao;

import com.yun.music.entity.SingerMusic;

public interface SingerMusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SingerMusic record);

    int insertSelective(SingerMusic record);

    SingerMusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SingerMusic record);

    int updateByPrimaryKey(SingerMusic record);
}