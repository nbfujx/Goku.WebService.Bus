package com.goku.webservice.service.impl;

import com.goku.webservice.datahelper.DataSource;
import com.goku.webservice.mapper.VelocityMapper;
import com.goku.webservice.mapper.checkMapper;
import com.goku.webservice.model.gokuBussiness;
import com.goku.webservice.service.VelocityService;
import com.goku.webservice.service.checkService;
import com.goku.webservice.util.VelocityEngineUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
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
                return null;
            case "SelectProc":
                return null;
            case "insert":
                return 1;
            case "update":
                return 1;
            case "delete":
                return 1;
            case "insertOrUpdate":
                return 1;
            default:
                return "error";
        }
    }

    public Map<String, String> SelectOne(String sqltemplate,Object Para) {
        String sqlstr= VelocityEngineUtil.Velocitytemplate2String(sqltemplate, (HashMap<String, String>) Para);
        return velocitymapper.SelectOne(sqlstr);
    }

}
