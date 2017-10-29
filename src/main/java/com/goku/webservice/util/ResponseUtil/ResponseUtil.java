package com.goku.webservice.util.ResponseUtil;


import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-27.
 */
public class ResponseUtil {

    public static ResponseInfo Serialize(HashMap<String,Object> info)
    {
        ResponseInfo responseInfo=new  ResponseInfo();
        Body body=new Body();
        if(info.containsKey("goku")) {
            HashMap<String, Object> response = (HashMap<String, Object>) info.get("goku");
            if (info.containsKey("body")) {
                HashMap<String, Object> responsebody = (HashMap<String, Object>) response.get("body");
                if (responsebody.containsKey("ret_code")) {
                    body.setRet_code((String) responsebody.get("ret_code"));
                }
                if (responsebody.containsKey("ret_info")) {
                    body.setRet_info((String) responsebody.get("ret_info"));
                }
                if (responsebody.containsKey("data")) {
                    body.setData(responsebody.get("data"));
                }
                responseInfo.setBody(body);
            }
        }
        return responseInfo;
    }
}
