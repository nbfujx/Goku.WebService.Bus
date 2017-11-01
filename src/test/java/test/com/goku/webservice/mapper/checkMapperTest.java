package test.com.goku.webservice.mapper;

import com.goku.webservice.mapper.checkMapper;
import com.goku.webservice.service.commService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017-11-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:spring-base.xml"})
public class checkMapperTest {

    @Autowired
    private checkMapper checkmapper;

    @Test
    public void getUserinfo() throws Exception {
        System.out.print(checkmapper.GetUserinfo("fjx"));
    }

    @Test
    public void getAuthority() throws Exception {

    }

    @Test
    public void saveTranlog() throws Exception {

    }

}