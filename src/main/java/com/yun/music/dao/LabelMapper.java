package com.yun.music.dao;

import com.yun.music.entity.Label;

public interface LabelMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);
}