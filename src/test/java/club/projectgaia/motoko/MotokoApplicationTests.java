package club.projectgaia.motoko;

import club.projectgaia.motoko.repository.WordRepository;
import com.baidu.aip.ocr.AipOcr;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MotokoApplicationTests {

    @Autowired
    AipOcr client;
    @Autowired
    WordRepository wordRepository;

    @Test
    public void saveWord() {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "false");

        File dir = new File("/Users/deepclue/workspace/ocr/word/");
        for (File file : dir.listFiles()) {
            String name = file.getName().split(".")[0];
            if (name.startsWith("0")) {

            }
        }
    }


    @Test
    public void testOcr() {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "false");


        // 参数为本地路径
        String image = "/Users/deepclue/workspace/ocr/word/0ab9a840c6b0-4c23-92b0-73ec4af3ad85.jpg";
        JSONObject res = client.basicGeneral(image, options);
        System.out.println(res);


    }

    @Test
    public void contextLoads() {
    }

}

