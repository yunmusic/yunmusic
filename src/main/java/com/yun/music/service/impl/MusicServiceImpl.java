package com.yun.music.service.impl;

import com.yun.music.common.JsonBean;
import com.yun.music.dao.MusicMapper;
import com.yun.music.service.MusicService;
import com.yun.music.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicDao;


    @Override
    public JsonBean findById(int id) {
        return JsonUtils.createJsonBean(1,musicDao.selectById(id));
    }
}