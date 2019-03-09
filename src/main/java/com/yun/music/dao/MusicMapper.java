package com.yun.music.dao;

import com.yun.music.entity.Music;
import com.yun.music.vo.MusicVo;

public interface MusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer id);
    //通过id查找歌曲所有的相关信息
    MusicVo selectById(int id);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);

}