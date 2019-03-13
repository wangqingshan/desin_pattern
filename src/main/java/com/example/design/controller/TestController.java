package com.example.design.controller;




import com.example.design.utils.Tool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by hudong on 2018/9/20.
 */

@RestController
public class TestController {




    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    String getIp(HttpServletRequest request){
        return Tool.getIpAddr(request);
    }



}
