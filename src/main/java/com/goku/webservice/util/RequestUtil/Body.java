package com.goku.webservice.util.RequestUtil;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-27.
 */
public class Body extends HashMap<String,Object> {

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.put("data", (this.data = data));
    }
}
