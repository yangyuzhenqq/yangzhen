package com.skcl.dao;

import com.skcl.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 添加
     */
    int add(User User);

    /**
     * 查询
     */
    List<User> list();

    /**
     * 删除
     */
    int delete(Integer usreId);

    /**
     * 修改
     */
    int update(User User);


}
