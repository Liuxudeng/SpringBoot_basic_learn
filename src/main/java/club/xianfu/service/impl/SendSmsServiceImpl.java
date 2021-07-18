package club.xianfu.service.impl;

import club.xianfu.SmsConfigProperty;
import club.xianfu.service.SendSmsService;
import club.xianfu.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


@Service
@Slf4j
public class SendSmsServiceImpl implements SendSmsService {
    @Autowired
    private SmsConfigProperty smsConfigProperty;




    /**
     * 发送验证码
     * @param phone
     */
    @Override
    public void sendVerifyCode(String phone) {
        //1.判断是否是黑名单手机
        //2.判断是否60S内发过
        //3.判断每天是否超过20次



        //验证码为随机数字，因此需要创建一个六位数的随机数字
            String randomStr = RandomStringUtils.randomNumeric(6);
        String message = "【alex】您的注册验证码是: "+randomStr;

        message = encodeUtf(message);
        String url = "https://api.smsbao.com/sms?u="+smsConfigProperty.getUsername()+"&p="+smsConfigProperty.getPassword()+"&m="+phone+"&c="+message;


        HttpUtil.sendGetRequest(url);

        log.info("发送验证码到:{} 值为: {}",phone,randomStr);

    }


    private String encodeUtf(String str){
        try {
            return URLEncoder.encode(str,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
