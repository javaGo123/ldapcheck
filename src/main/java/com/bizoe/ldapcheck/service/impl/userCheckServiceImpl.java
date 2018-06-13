package com.bizoe.ldapcheck.service.impl;

import com.bizoe.ldapcheck.domain.CheckResult;
import com.bizoe.ldapcheck.service.userCheckService;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import java.util.Hashtable;

/**
 * Created by wangxinxin on 2018/6/13.
 */
@Service
public class userCheckServiceImpl implements userCheckService {
    public String userCheck(String host,String port,String dn,String password){
        LdapContext ctx=null;
        Hashtable<String,String> HashEnv = new Hashtable<String,String>();
        HashEnv.put(Context.SECURITY_AUTHENTICATION, "simple"); // LDAP访问安全级别(none,simple,strong)

//        String dn="cn=alex,ou=rws,dc=bizoe123,dc=com";

        HashEnv.put(Context.SECURITY_PRINCIPAL, dn); //AD的用户名
        HashEnv.put(Context.SECURITY_CREDENTIALS, password); //AD的密码
        HashEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory"); // LDAP工厂类
        HashEnv.put("com.sun.jndi.ldap.connect.timeout", "3000");//连接超时设置为3秒
        HashEnv.put(Context.PROVIDER_URL, "ldap://" + host + ":" + port);// 默认端口389
        try {
            ctx =  new InitialLdapContext(HashEnv, null);
            System.out.println("身份验证成功!");
            return CheckResult.CHECK_SUCCESS.getMsg();
        } catch (AuthenticationException e) {
            System.out.println("身份验证失败!");
            e.printStackTrace();
            return CheckResult.CHECK_FAIL.getMsg();
        } catch (javax.naming.CommunicationException e) {
            System.out.println("AD域连接失败!");
            e.printStackTrace();
            return CheckResult.AD_CONNECT_FAIL.getMsg();
        } catch (Exception e) {
            System.out.println("身份验证未知异常!");
            e.printStackTrace();
            return CheckResult.CHECK_UNKONW_ERROR.getMsg();
        } finally{
            if(null!=ctx){
                try {
                    ctx.close();
                    ctx=null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
