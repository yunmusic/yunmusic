package com.yun.music.dao;

import com.yun.music.entity.Sheet;

public interface SheetMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Sheet record);

    int insertSelective(Sheet record);

    Sheet selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Sheet record);

    int updateByPrimaryKey(Sheet record);
}