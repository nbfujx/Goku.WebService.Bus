package com.goku.webservice.util;

import com.github.pagehelper.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017-11-01.
 */
public class PageUtil {

    public static List<Object> Page2list(Page page) {
        List<Object> nowlist=new ArrayList<> ();
        for (Object item: page )
        {
            nowlist.add(item);
        }
        return nowlist;
    }
}
