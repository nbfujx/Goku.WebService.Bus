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
