package com.yun.music.dao;

import com.yun.music.entity.UserSheet;

public interface UserSheetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSheet record);

    int insertSelective(UserSheet record);

    UserSheet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSheet record);

    int updateByPrimaryKey(UserSheet record);
}