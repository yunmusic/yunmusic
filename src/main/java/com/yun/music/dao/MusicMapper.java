package com.yun.music.dao;

import com.yun.music.entity.Music;
import com.yun.music.vo.IndexMusicVo;
import com.yun.music.vo.MusicVo;

import java.util.List;

public interface MusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer id);
    //通过id查找歌曲所有的相关信息
    MusicVo selectById(int id);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);

    // 随机查询歌曲
    List<IndexMusicVo> selectBySize(int size);

    // 查询新歌榜数据
    List<Music> selectNewMusic(int size);

    // 根据播放量降序查询(查询飙升榜)
    List<Music> selectHotMusic(int size);
}