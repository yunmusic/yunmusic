package com.yun.music.controller;

import com.yun.music.common.JsonBean;
import com.yun.music.service.BigImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigImgController {
    @Autowired
    private BigImgService bigImgService;
    @RequestMapping("lunbo.do")
    public JsonBean lunbo(){
        return bigImgService.randSearch();
    }
}
