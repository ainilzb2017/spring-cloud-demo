package com.ainilzb.springcloud;

import com.ainilzb.springcloud.Friend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: Controller
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/4
 * @Version 1.0
 */
@RestController
@Slf4j
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHi")
    public String sayHi(){
        return "This is " + port;
    }

    @PostMapping("/sayHi")
    public Friend sayHiPost(@RequestBody Friend friend){
        log.info("You are " + friend.getName());
        friend.setPort(port);
        return friend;
    }

}
