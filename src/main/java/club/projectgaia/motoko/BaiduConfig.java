package club.projectgaia.motoko;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

/**
 * Created by luoxiaolong on 18-12-28.
 */
@Component
@Data
@ConfigurationProperties(prefix = "baidu")
@ToString
public class BaiduConfig {
    private String appId;
    private String apiKey;
    private String secretKey;
}
