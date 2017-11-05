package com.goku.webservice.service.impl;

import com.goku.webservice.datahelper.DataSource;
import com.goku.webservice.mapper.VelocityMapper;
import com.goku.webservice.service.VelocityService;
import com.goku.webservice.util.VelocityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-11-03.
 */
@Service
@DataSource("business")
public class VelocityServiceImpl implements VelocityService {


    @Autowired
    public VelocityMapper velocitymapper;

    @Transactional
    public Object doProess(String BsCode, String Operation,String sqltemplate, Object Para) {

        switch (Operation) {
            case "SelectOne":
                return SelectOne(sqltemplate, Para);
            case "SelectList":
                return SelectList(sqltemplate, Para);
            case "SelectProc":
                return SelectProc(sqltemplate, Para);
            case "insert":
                insert(sqltemplate, Para);
                return 1;
            case "update":
                update(sqltemplate, Para);
                return 1;
            case "delete":
                delete(sqltemplate, Para);
                return 1;
            default:
                return "error";
        }
    }


    public Map<String, String> SelectOne(String sqltemplate,Object Para) {
        String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
        return velocitymapper.SelectOne(sqlstr);
    }

    public List<Map<String, String>> SelectList(String sqltemplate, Object Para){
        String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
        return velocitymapper.SelectList(sqlstr);
    }

    public List<Map<String, String>> SelectProc(String sqltemplate,Object Para){
        String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
        return velocitymapper.SelectProc(sqlstr);
    }

    public void  insert(String sqltemplate,Object Para){
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) hm);
                velocitymapper.insert(sqlstr);
            }
        }
        else
        {
            String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
            velocitymapper.insert(sqlstr);
        }
    }

    public void  update(String sqltemplate,Object Para){
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) hm);
                velocitymapper.update(sqlstr);
            }
        }
        else
        {
            String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
            velocitymapper.update(sqlstr);
        }

    }

    public void delete(String sqltemplate,Object Para){
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) hm);
                velocitymapper.delete(sqlstr);
            }
        }
        else
        {
            String sqlstr= VelocityUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
            velocitymapper.delete(sqlstr);
        }
    }

}
