package com.goku.webservice.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.*;

/**
 * Created by nbfujx on 2017-10-26.
 */
public class XmlUtil {

    /**
     * map转换成xml
     * **/
    public static String  MapToXML(Map map) {
        StringBuffer sb=new  StringBuffer();
        assembleElement(map,sb);
        return sb.toString();
    }

    /**
     * xml转换成map
     * **/
    public static HashMap<String, Object> XMLToMap(String xml)
            throws DocumentException {
        Document document = DocumentHelper.parseText(xml);
        Element root = document.getRootElement();
        return parseElement(root);
    }

    @SuppressWarnings("unchecked")
    private static void assembleElement(Map map, StringBuffer xmlsb) {

        Set set = map.keySet();
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            String key = (String) it.next();
            Object value = map.get(key);
            if (null == value)
                value = "";
            if (value.getClass().getName().equals("java.util.ArrayList")) {
                ArrayList list = (ArrayList) map.get(key);
                for (int i = 0; i < list.size(); i++) {
                    xmlsb.append("<" + key + ">");
                    HashMap hm = (HashMap) list.get(i);
                    assembleElement(hm, xmlsb);
                    xmlsb.append("</" + key + ">");
                }

            } else {
                if (value instanceof HashMap) {
                    xmlsb.append("<" + key + ">");
                    assembleElement((HashMap) value, xmlsb);
                    xmlsb.append("</" + key + ">");
                } else {
                    xmlsb.append("<" + key + ">" + value + "</" + key + ">");
                }

            }

        }
    }
    @SuppressWarnings("unchecked")
    private static HashMap<String, Object> parseElement(Element root) {
        String rootName = root.getName();
        Iterator<Element> rootItor = root.elementIterator();
        HashMap<String, Object> rMap = new HashMap<>();
        Map<String, Object> rsltMapp = new HashMap<>();
        while (rootItor.hasNext()) {

            Element tmpElement = rootItor.next();
            String name = tmpElement.getName();


            if (!tmpElement.isTextOnly()) {
                HashMap<String,Object> rsltMap=parseElement(tmpElement);
                Set set = rsltMap.keySet();
                for (Iterator it = set.iterator(); it.hasNext(); ) {
                    String key = (String) it.next();
                    List<HashMap<String, Object>> rsltList = new ArrayList<>();
                    if (rsltMapp.containsKey(key)) {
                        rsltMapp.containsKey(key);
                        rsltMapp.get(key);
                        rsltList.add((HashMap<String, Object>) rsltMap.get(key));
                        rsltList.add((HashMap<String, Object>) rsltMapp.get(key));
                        rsltMapp.put(key, rsltList);
                    }else
                    {
                        rsltMapp.put(key, rsltMap.get(key));
                    }
                }
            }else
            {
                rsltMapp.put(name,tmpElement.getTextTrim());
            }
        }

        rMap.put(rootName, rsltMapp);

        return rMap;
    }


}

