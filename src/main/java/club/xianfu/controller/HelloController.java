package club.xianfu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class HelloController {
    /**
     * 以GET方式请求 /hello 会执行当前的方法
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello");
        return "hello";

    }


    /**
     *json返回形式
     */

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    //返回方法可以多种多样
    public @ResponseBody
    Map<String,String> hi(){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("name","tom");
        map.put("age","22");
        return map;
    }

}
