package com.goku.webservice.controller.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.webservice.controller.BusController;
import com.goku.webservice.service.commService;
import com.goku.webservice.util.RequestUtil.RequestInfo;
import com.goku.webservice.util.RequestUtil.RequestUtil;
import com.goku.webservice.util.ResponseUtil.Body;
import com.goku.webservice.util.ResponseUtil.ResponseInfo;
import com.goku.webservice.util.XmlUtil;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-10-26.
 */

@WebService(endpointInterface = "com.goku.webservice.controller.BusController")
public class BusControllerImpl implements BusController {

    @Autowired
    private commService commservice;

    @Override
    public String process(String para) {
        try {
            RequestInfo requestInfo= RequestUtil.Serialize(XmlUtil.XMLToMap(para));
            ResponseInfo responseInfo=new ResponseInfo();
            Body body=new Body();
            Object info=commservice.doProess(requestInfo.getHeader().getBs_code(),requestInfo.getHeader().getTran_no(),requestInfo.getBody().getData());
            if(info.getClass().getName().equals("java.lang.String")){
                body.setRet_code("1");
                body.setRet_info((String) info);
                responseInfo.setBody(body);
            }else if(info.getClass().getName().equals("java.lang.Integer")) {
                body.setRet_code("0");
                body.setRet_info("成功");
                responseInfo.setBody(body);
            }else {
                body.setRet_code("0");
                body.setRet_info("成功");
                body.setData(info);
                responseInfo.setBody(body);
            }
            Map<String,Object> Response=new HashMap<>();
            Response.put("goku",responseInfo);
            return XmlUtil.MapToXML(Response);
        } catch (Exception e) {
            ResponseInfo responseInfo=new ResponseInfo();
            Body body=new Body();
            body.setRet_code("1");
            body.setRet_info(e.getMessage());
            responseInfo.setBody(body);
            Map<String,Object> Response=new HashMap<>();
            Response.put("goku",responseInfo);
            return XmlUtil.MapToXML(Response);
        }

    }
}
