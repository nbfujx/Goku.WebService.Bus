package test.com.goku.webservice.service.impl;


import com.alibaba.druid.support.json.JSONUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.webservice.mapper.checkMapper;
import com.goku.webservice.model.gokuBussiness;
import com.goku.webservice.service.VelocityService;
import com.goku.webservice.service.commService;
import com.goku.webservice.util.ResponseUtil.Body;
import com.goku.webservice.util.ResponseUtil.ResponseInfo;
import com.goku.webservice.util.ResponseUtil.ResponseUtil;
import com.goku.webservice.util.XmlUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-10-26.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:spring-base.xml"})
public class commServiceImplTest {

    @Autowired
    private commService commservice;

    @Autowired
    private VelocityService velocityService;

    @Autowired
    private checkMapper checkmapper;

    @Test
    public void selectOne() throws Exception {
        String bsCode="sysUserMapper";
        String Operation="SelectOne";
        Map<String, String> para=new HashMap<String, String>();
        para.put("id","fjx");
        Map<String, String> userinfo=(Map<String, String>) commservice.doProess(bsCode,Operation, para);
        System.out.print(userinfo);
    }

   @Test
    public void doProess2() throws Exception {
        String bsCode="sysUserMapper";
        String Operation="SelectProc";
        Map<String, String> para=new HashMap<String, String>();
        para.put("id","fjx");
        Object userinfo=commservice.doProess(bsCode,Operation,para);
        System.out.print(userinfo);
    }

    @Test
    public void doProess3() throws Exception {
        String bsCode="sysUserMapper";
        String Operation="SelectList";
        Map<String, String> para=new HashMap<String, String>();
        para.put("male_","1");
        Object users=commservice.doProess(bsCode,Operation,para);
        ResponseInfo responseInfo=new  ResponseInfo();
        Body body=new Body();
        if(users.getClass().getName().equals("java.lang.String")){
            body.setRet_code("1");
            body.setRet_info((String) users);
            responseInfo.setBody(body);
        }else {
            body.setRet_code("0");
            body.setRet_info("成功");
            body.setData(users);
            responseInfo.setBody(body);
        }
        Map<String,Object> Response=new HashMap<>();
        Response.put("goku",responseInfo);
        System.out.print( JSONUtils.toJSONString(  responseInfo.getBody().getRet_info()));
        System.out.print( JSONUtils.toJSONString(  responseInfo.getBody().getData()));
        System.out.print(  XmlUtil.MapToXML( Response));
    }

    @Test
    public void doProess4() throws Exception {
        String bsCode="test";
        String Operation="SelectOne";
        Map<String, String> para=new HashMap<String, String>();
        para.put("username","fjx");
        gokuBussiness gokubus=checkmapper.GetBussiness(bsCode,Operation);
        Object userinfo=velocityService.doProess(bsCode,Operation,gokubus.getSqltemplate(),para);
        System.out.print(userinfo);
    }

}