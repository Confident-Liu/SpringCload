import com.liu.Config.ApiService;
import com.netflix.discovery.shared.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuJiangFeng
 * @ClassName: TestDB
 * @Date 2019/3/16 21:45
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {


    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
