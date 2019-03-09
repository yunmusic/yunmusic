package com.yun.music.service.impl;

import com.yun.music.common.JsonBean;
import com.yun.music.dao.BigImgMapper;
import com.yun.music.service.BigImgService;
import com.yun.music.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BigImgServiceImpl implements BigImgService {
    @Autowired
    private BigImgMapper bigImgDao;


    @Override
    public JsonBean randSearch() {
        return JsonUtils.createJsonBean(1,bigImgDao.selectRand());
    }
}
