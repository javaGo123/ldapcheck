package com.bizoe.ldapcheck.web;

import com.bizoe.ldapcheck.domain.AdUser;
import com.bizoe.ldapcheck.service.userCheckService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxinxin on 2018/6/13.
 */
@RestController
@RequestMapping(value="/userCheck")
public class LdapCheck {

    @Autowired
    private userCheckService checkService;

    @Autowired
    private AdUser adcfg;

    @ApiOperation(value="校验用户", notes="根据username,password校验用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "AdUser")
    @RequestMapping(value="", method=RequestMethod.POST)
    public String postUser(@RequestBody AdUser user) {
        //        String dn="cn=alex,ou=rws,dc=bizoe123,dc=com";
        String dn="cn="+user.getName()+",ou="+adcfg.getOu()+","+adcfg.getBase();
        System.out.println("dn="+dn);
        return checkService.userCheck(adcfg.getHost(),adcfg.getPort(),dn,user.getPassword());

    }
}
