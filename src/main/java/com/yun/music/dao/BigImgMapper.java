package com.yun.music.dao;

import com.yun.music.entity.BigImg;

import java.util.List;

public interface BigImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BigImg record);

    int insertSelective(BigImg record);

    BigImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BigImg record);

    int updateByPrimaryKey(BigImg record);
    //轮播图随机推荐
    List<BigImg> selectRand();
}