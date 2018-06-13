package com.bizoe.ldapcheck.service;

/**
 * Created by wangxinxin on 2018/6/13.
 */
public interface userCheckService {
    String userCheck(String host,String port,String dn,String password);
}
