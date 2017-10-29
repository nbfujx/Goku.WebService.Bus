package com.goku.webservice.service.impl;

import com.goku.webservice.service.commService;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-10-26.
 */
@Service
public class commServiceImpl implements commService {

    @Autowired
    private  SqlSession sqlSession;

    @Transactional
    public  Object doProess(String BsCode,String Operation, Object Para) {
        String method=BsCode.trim()+"."+Operation.trim();
       // try {
            switch (Operation) {
                case "SelectOne":
                    return SelectOne(method, Para);
                case "SelectList":
                    return SelectList(method, Para);
                case "SelectProc":
                    return SelectProc(method, Para);
                case "insert":
                     insert(method, Para);
                     return 1;
                case "update":
                     update(method, Para);
                     return 1;
                case "delete":
                     delete(method, Para);
                     return 1;
                default:
                    return "无相关操作类型";

            }
       // }catch (Exception e)
       // {
           // return e.getMessage();
       // }
    }


    public Map<String, String> SelectOne(String method,Object Para)
    {
        return sqlSession.selectOne(method, Para);
    }

    public List<Map<String, String>> SelectList(String method,Object Para)
    {
        return sqlSession.selectList(method, Para);
    }

    public List<Map<String, String>> SelectProc(String method,Object Para)
    {
        return sqlSession.selectList(method, Para);
    }


    public void  insert(String method,Object Para)
    {
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                sqlSession.insert(method, hm);
            }
        }
        else
        {
             sqlSession.insert(method, Para);
        }
    }


    public void  update(String method,Object Para)
    {
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                sqlSession.update(method, hm);
            }
        }
        else
        {
            sqlSession.update(method, Para);
        }

    }


    public void delete(String method,Object Para)
    {
        if(Para.getClass().getName().equals("java.util.ArrayList"))
        {
            ArrayList list = (ArrayList) Para;
            for (int i = 0; i < list.size(); i++) {
                HashMap hm = (HashMap) list.get(i);
                sqlSession.delete(method, hm);
            }
        }
        else
        {
            sqlSession.delete(method, Para);
        }
    }




}
