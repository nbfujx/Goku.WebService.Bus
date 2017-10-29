package com.goku.webservice.util.ResponseUtil;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-26.
 */
public class ResponseInfo extends HashMap<String,Object>{

    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.put("body", (this.body = body));
    }


}
