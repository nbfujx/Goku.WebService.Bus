package com.goku.webservice.util.RequestUtil;

import com.goku.webservice.util.ResponseUtil.*;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-27.
 */
public class RequestUtil {

    public static RequestInfo Serialize(HashMap<String,Object> info)
    {
        RequestInfo requestInfo=new RequestInfo();
        Header header=new  Header();
        Body body=new Body();
        if(info.containsKey("goku")) {
            HashMap<String, Object> request = (HashMap<String, Object>) info.get("goku");
            if (request.containsKey("header")) {
                HashMap<String, Object> requestheader = (HashMap<String, Object>) request.get("header");
                if (requestheader.containsKey("user_id")) {
                    header.setUser_id((String) requestheader.get("user_id"));
                }
                if (requestheader.containsKey("password")) {
                    header.setPassword((String) requestheader.get("password"));
                }
                if (requestheader.containsKey("tran_no")) {
                    header.setTran_no((String) requestheader.get("tran_no"));
                }
                if (requestheader.containsKey("bs_code")) {
                    header.setBs_code((String) requestheader.get("bs_code"));
                }
                requestInfo.setHeader(header);
            }
            if (request.containsKey("body")) {
                HashMap<String, Object> requestbody = (HashMap<String, Object>) request.get("body");
                if (requestbody.containsKey("data")) {
                    body.setData(requestbody.get("data"));
                }
                requestInfo.setBody(body);
            }
        }

        return requestInfo;
    }

}
