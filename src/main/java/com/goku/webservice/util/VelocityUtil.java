package com.goku.webservice.util;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.mybatis.scripting.velocity.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by nbfujx on 2017-11-03.
 */
public class VelocityUtil {



    public static String Velocitytemplate2String(String sqltemplate, HashMap<String, String> Para) {
        //加载velocity配置
        Properties p = new Properties();
        try {
            p.load(VelocityUtil.class.getClassLoader().getResourceAsStream("velocity.properties"));
        } catch (IOException e) {

        }
        VelocityEngine ve = new VelocityEngine();
        ve.init(p);
        String content =sqltemplate;
        VelocityContext context = new VelocityContext();
        Set set = Para.keySet();
        for (Iterator it = set.iterator(); it.hasNext(); ){
            String key = (String) it.next();
            Object value = Para.get(key);
            if (null == value) value = "";
            context.put(key, value);
        }
        StringWriter writer = new StringWriter();
        ve.evaluate(context, writer, "", content); // 关键方法
        return writer.toString();
    }
}
