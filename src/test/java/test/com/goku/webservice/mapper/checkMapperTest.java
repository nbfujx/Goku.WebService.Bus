package test.com.goku.webservice.mapper;

import com.goku.webservice.WebserviceApplication;
import com.goku.webservice.mapper.checkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nbfujx on 2017-11-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@SpringBootTest(classes = WebserviceApplication.class)
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