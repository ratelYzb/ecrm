package com.hx.ecrm.controller;

import com.hx.ecrm.service.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ratel
 * @create 2018/12/24
 */
@Controller
public class RootController {

    @Autowired
    RootService rootService;

    @RequestMapping(name = "/")
    @ResponseBody
    public String root(){
        return rootService.getAppName();
    }
}
