package com.yun.music.service.impl;

import com.yun.music.common.JsonBean;
import com.yun.music.dao.SheetMapper;
import com.yun.music.service.SheetService;
import com.yun.music.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    private SheetMapper sheetDao;
    @Override
    public JsonBean randSearch(int count) {
        return JsonUtils.createJsonBean(1,sheetDao.selectRandCount(count));
    }
}
