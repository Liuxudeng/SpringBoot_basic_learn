package club.xianfu;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "sms")
@Configuration
public class SmsConfigProperty {

    private String username;
    private String password;
}
