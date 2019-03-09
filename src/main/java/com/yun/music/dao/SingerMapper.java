package com.yun.music.dao;

import com.yun.music.entity.Singer;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);
}