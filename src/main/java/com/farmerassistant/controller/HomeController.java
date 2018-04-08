package com.farmerassistant.controller;

import com.farmerassistant.mapper.SysUserMapper;
import com.farmerassistant.model.Msg;
import com.farmerassistant.model.SysUser;
import com.farmerassistant.security.CustomUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wang.donga on 2018/2/24.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private CustomUserService userService;
    @Autowired
    private SysUserMapper sysUserMapper;
    @RequestMapping("/index")
    public String index(ModelMap model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("msg",msg);
        return "test";
    }
    @GetMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        //逻辑处理
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        request.setAttribute("msg",msg);
        return "/index";
    }
    @ApiOperation(value="根据用户工号查询用户信息", notes="")
    @RequestMapping(value="/{userjobNumber}",method = RequestMethod.GET)
    public SysUser userInfo(@PathVariable String userjobNumber){
        try {
            SysUser user = sysUserMapper.findByJobNumber(userjobNumber);
            return user;
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
}
