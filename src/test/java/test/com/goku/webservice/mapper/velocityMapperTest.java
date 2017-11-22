package test.com.goku.webservice.mapper;

import com.goku.webservice.WebserviceApplication;
import com.goku.webservice.mapper.VelocityMapper;
import com.goku.webservice.util.VelocityUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

/**
 * Created by nbfujx on 2017-11-03.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@SpringBootTest(classes = WebserviceApplication.class)
public class velocityMapperTest {

    @Autowired
    public VelocityMapper velocitymapper;

    @Test
    public void selectOne() throws Exception {
        String sql="update sys_user  " +
                "#mset() " +
                "  #if($username)  name=$username,#end " +
                "#end  " +
                "WHERE id = $id";
        HashMap<String,String> para=new HashMap<String, String>();
        para.put("username","fjx");
        para.put("id","fjx");
        String sqlp= VelocityUtil.Velocitytemplate2String(sql,para);
        velocitymapper.SelectOne(sqlp);
        //System.out.print(sqlp);
    }

}