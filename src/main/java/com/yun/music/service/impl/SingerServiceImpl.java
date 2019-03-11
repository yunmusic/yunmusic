package com.yun.music.service.impl;

import com.yun.music.common.JsonBean;
import com.yun.music.dao.SingerMapper;
import com.yun.music.service.SingerService;
import com.yun.music.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerDao;

    @Override
    public JsonBean findSingerBySize(int size) {
        return JsonUtils.createJsonBean(1, singerDao.selectBySize(size));
    }
}
