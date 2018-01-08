package com.skcl.service;

import com.skcl.dao.UserDao;
import com.skcl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired(required = false)
    UserDao userDao;

    /**
     * 添加
     */
    public int add(User User){
        return  userDao.add(User);
    }

    /**
     * 查询
     */
    public List<User> list(){
        return userDao.list();
    }

    /**
     * 删除
     */
    public int delete(Integer usreId){
        return userDao.delete(usreId);
    }

    /**
     * 修改
     */
    public int update(User User){
        return userDao.update(User);
    }
}
