package com.goku.webservice.util.RequestUtil;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-26.
 */
public class RequestInfo  extends HashMap<String,Object>{


    private Header header;

    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.put("body", (this.body = body));
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.put("Header", (this.header = header));
    }
}
