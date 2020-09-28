package com.itdan.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestProviderController {

    //暴露RESTful接口
    @GetMapping(value = "/service")
    public String service(){
        System.out.println("provider invoke");
        return "provider invoke";
    }
}
