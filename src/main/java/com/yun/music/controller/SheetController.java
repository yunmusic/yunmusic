package com.yun.music.controller;

import com.yun.music.common.JsonBean;
import com.yun.music.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SheetController {
    @Autowired
    private SheetService sheetService;

    @RequestMapping("sheetlist.do")//获取指定数量的歌单列表
    public JsonBean randSheet(int count){
        return sheetService.randSearch(count);
    }
}
