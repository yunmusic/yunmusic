package com.yun.music.controller;

import com.yun.music.common.JsonBean;
import com.yun.music.service.SingerService;
import com.yun.music.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/singer")
@RestController
public class SingerController {

    @Autowired
    private SingerService singerService;

    @RequestMapping("/findbysize.do")
    public JsonBean findSingerBySize(int size){
        return JsonUtils.createJsonBean(1, singerService.findSingerBySize(size));
    }
}
