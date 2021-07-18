package club.xianfu.controller;

import club.xianfu.model.dto.SaveDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoCotroller {
    /**
     * 日志信息生成
     * @return
     */




    @GetMapping("/demo/hello")
    public String hello(){
        return "hello,demo";
    }



    @PostMapping("/demo/save")
    public String save(@RequestBody SaveDto dto){
      //  System.out.println("name: "+dto.getName()+", age"+dto.getAge());
        log.info("dto:{}",dto);
        return "success";
    }
}



