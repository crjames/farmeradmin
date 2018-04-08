package com.farmerassistant.controller;

import com.farmerassistant.model.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang.donga on 2018/4/8.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/page")
    public String toPage(ModelMap model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
        return "test";
    }
}
