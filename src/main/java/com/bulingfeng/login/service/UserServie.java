package com.bulingfeng.login.service;


import com.bulingfeng.login.entity.SysUserPo;

/**
 * @Author:bulingfeng
 * @Date: 2020-06-13
 */
public interface UserServie {
    SysUserPo getUser(String userName);
}
