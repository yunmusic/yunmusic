package com.yun.music.dao;

import com.yun.music.entity.Sheet;

import java.util.List;

public interface SheetMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Sheet record);

    int insertSelective(Sheet record);

    Sheet selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Sheet record);

    int updateByPrimaryKey(Sheet record);

    //随机查找几个歌单
    List<Sheet> selectRandCount(int count);
}