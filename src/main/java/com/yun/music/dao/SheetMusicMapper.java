package com.yun.music.dao;

import com.yun.music.entity.SheetMusic;

public interface SheetMusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SheetMusic record);

    int insertSelective(SheetMusic record);

    SheetMusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SheetMusic record);

    int updateByPrimaryKey(SheetMusic record);
}