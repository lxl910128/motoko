package club.projectgaia.motoko;

import com.baidu.aip.ocr.AipOcr;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MotokoApplicationTests {

    @Autowired
    AipOcr client;

    @Test
    public void testOcr(){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");


        // 参数为本地路径
        String image = "/home/magneto/data/pic/fff272a7b8ec-4d76-9273-be884a18ff61.jpg";
        JSONObject res = client.basicGeneral(image, options);
        System.out.println(res.toString(2));



    }

    @Test
    public void contextLoads() {
    }

}

