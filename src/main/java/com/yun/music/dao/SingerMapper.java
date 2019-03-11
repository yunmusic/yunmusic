package com.yun.music.dao;

import com.yun.music.entity.Singer;

import java.util.List;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    // 根据数量随机查询歌手
    List<Singer> selectBySize(int size);
}