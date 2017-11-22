package com.goku.webservice.config.druid;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  Created by nbfujx on 2017/10/18.
 */
@Aspect
@Order(-99) // 控制多个Aspect的执行顺序，越小越先执行
@Component
public class DataSourceAspect {

    /**
     * 在service层获取datasource对象之前在切面中获取数据源
     */
    @Before("execution(* com.goku.webservice.service..*.*(..))")
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