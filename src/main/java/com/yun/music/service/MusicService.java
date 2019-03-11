package com.yun.music.service;

import com.yun.music.common.JsonBean;

public interface MusicService {

    JsonBean findById(int id);

    JsonBean findBySize(int size);

    JsonBean findNewMusicBySize(int size);

    JsonBean findHotMusicBySize(int size);
}
