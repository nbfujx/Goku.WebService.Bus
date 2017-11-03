package com.goku.webservice.datahelper;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 *  Created by nbfujx on 2017/10/18.
 */
public class DataSourceAspect {

    /**
     * 在service层获取datasource对象之前在切面中获取数据源
     */
    public void before(JoinPoint point)
    {
        Object target = point.getTarget();
        try {
            if(target!=null&&target.getClass().isAnnotationPresent(DataSource.class))
            {
                DataSource dataSource =target.getClass().getAnnotation(DataSource.class);
                System.out.println("dataSource："+dataSource.value());
                DataSourceHolder.putDataSource(dataSource.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
