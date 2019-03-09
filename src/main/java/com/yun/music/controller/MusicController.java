package com.yun.music.controller;

import com.yun.music.common.JsonBean;
import com.yun.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping("findmusic.do")
    public JsonBean findMusicById(int id){
        return musicService.findById(id);
    }
}
