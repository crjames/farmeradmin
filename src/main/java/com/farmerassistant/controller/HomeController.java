package com.farmerassistant.controller;

import com.farmerassistant.model.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wang.donga on 2018/2/24.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}
