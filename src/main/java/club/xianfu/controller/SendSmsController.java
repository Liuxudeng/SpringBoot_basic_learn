package club.xianfu.controller;

import club.xianfu.service.SendSmsService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SendSmsController {
    @Autowired
    private SendSmsService sendSmsService;


    @PostMapping("/commons/verify_code")
    public String sendVeifyCode(String phone){

        sendSmsService.sendVerifyCode(phone);

        return "success";





    }
}
