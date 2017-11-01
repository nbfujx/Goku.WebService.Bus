package com.goku.webservice.util.ResponseUtil;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-27.
 */
public class Body extends HashMap<String,Object> {

    private String ret_code;
    private String ret_info;
    private String page_index;
    private String page_count;
    private Object data;

    public String getPage_index() {
        return page_index;
    }

    public void setPage_index(String page_index) {
        this.put("page_index", (this.page_index = page_index));
    }

    public String getPage_count() {
        return page_count;
    }

    public void setPage_count(String page_count) {
        this.put("page_count", (this.page_count = page_count));
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.put("ret_code", (this.ret_code = ret_code));
    }

    public String getRet_info() {
        return ret_info;
    }

    public void setRet_info(String ret_info) {
        this.put("ret_info", (this.ret_info = ret_info));
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.put("data", (this.data = data));
    }
}
