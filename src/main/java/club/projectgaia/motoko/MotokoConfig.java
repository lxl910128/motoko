package club.projectgaia.motoko;

import com.baidu.aip.ocr.AipOcr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luoxiaolong on 18-12-28.
 */
@Configuration
public class MotokoConfig {
    @Autowired
    BaiduConfig baiduConfig;

    @Bean
    public AipOcr aipOcr() {
        AipOcr client = new AipOcr(baiduConfig.getAppId(), baiduConfig.getApiKey(), baiduConfig.getSecretKey());

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        return client;
    }
}
