package test.com.goku.webservice.util;


import com.alibaba.druid.support.json.JSONUtils;
import com.goku.webservice.util.XmlUtil;
import com.goku.webservice.util.VelocityUtil;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-10-26.
 */
public class XmlUtilTest  {


    @Test
    public void test() throws Exception {
        String xml="<goku>\n" +
                "<header>\n" +
                "<user_id>1</user_id>\n" +
                "<password>2</password>\n" +
                "<bs_code>sysUserMapper</bs_code>\n" +
                "<tran_no>SelectList</tran_no>\n" +
                "</header>\n" +
                "<body>\n" +
                "<data>\n" +
                "<male_>2</male_>\n" +
                "</data>\n" +
                "</body>\n" +
                "</goku>";
        XmlUtil.XMLToMap(xml);
        XmlUtil.MapToXML( XmlUtil.XMLToMap(xml));
        System.out.print( JSONUtils.toJSONString(XmlUtil.XMLToMap(xml)));
        System.out.print( XmlUtil.MapToXML( XmlUtil.XMLToMap(xml)));
    }

    @Test
    public void test2() throws Exception {
        String sql="#set( $pattern = $username + '%' )  SELECT * FROM goku_userinfo WHERE username LIKE '$pattern'";
        HashMap<String,String> para=new HashMap<String, String>();
        para.put("username","fjx");
        VelocityUtil.Velocitytemplate2String(sql,para);
        System.out.print( VelocityUtil.Velocitytemplate2String(sql,para));
    }

}