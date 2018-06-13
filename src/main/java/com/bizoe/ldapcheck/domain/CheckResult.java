package com.bizoe.ldapcheck.domain;

/**
 * Created by wangxinxin on 2018/6/13.
 */
public enum CheckResult {
    CHECK_SUCCESS("身份验证成功!",0),CHECK_FAIL("身份验证失败!",1),
    AD_CONNECT_FAIL("AD域连接失败!",2),CHECK_UNKONW_ERROR("身份验证未知异常!",3);

    private String msg;
    private int index;

    CheckResult(String msg, int index) {
        this.index=index;
        this.msg=msg;
    }

    public static String getMsg(int index) {
        for (CheckResult c : CheckResult.values()) {
            if (c.getIndex() == index) {
                return c.msg;
            }
        }
        return null;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
