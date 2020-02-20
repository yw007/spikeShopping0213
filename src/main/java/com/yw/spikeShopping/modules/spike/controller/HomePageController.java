package com.yw.spikeShopping.modules.spike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author yue
 * @Date 2020/2/17 16:51
 */
@Controller
public class HomePageController {
    @RequestMapping("/index")
    public String home(){
        return "/ceshi";
    }
}
