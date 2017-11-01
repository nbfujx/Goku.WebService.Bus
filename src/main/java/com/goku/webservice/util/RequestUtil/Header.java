package com.goku.webservice.util.RequestUtil;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-27.
 */
public class Header extends HashMap<String,Object> {

    private  String user_id;
    private  String password;
    private  String tran_no;
    private  String bs_code;
    private  String  is_pagination;
    private  String  page_index;
    private  String  page_limit;

    public String getIs_pagination() {
        return is_pagination;
    }

    public void setIs_pagination(String is_pagination) {
        this.put("is_pagination", (this.is_pagination = is_pagination));
    }

    public String getPage_index() {
        return page_index;
    }

    public void setPage_index(String page_index) {
        this.put("page_index", (this.page_index = page_index));
    }

    public String getPage_limit() {
        return page_limit;
    }

    public void setPage_limit(String page_limit) {
        this.put("page_limit", (this.page_limit = page_limit));
    }

    public String getBs_code() {
        return bs_code;
    }

    public void setBs_code(String bs_code) {
        this.put("bs_code", (this.bs_code = bs_code));
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.put("user_id", (this.user_id = user_id));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.put("password", (this.password = password));
    }

    public String getTran_no() {
        return tran_no;
    }

    public void setTran_no(String tran_no) {
        this.put("tran_no", (this.tran_no = tran_no));
    }
}
