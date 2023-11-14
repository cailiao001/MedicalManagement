package com.example.service;

import com.example.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
public interface IUserService extends IService<User> {

    void register(User user);

    User login(String email,String password);

}
