package com.farmerassistant.controller;

import com.farmerassistant.mapper.SysUserMapper;
import com.farmerassistant.model.Msg;
import com.farmerassistant.model.SysUser;
import com.farmerassistant.security.CustomUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wang.donga on 2018/2/24.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private CustomUserService userService;
    @Autowired
    private SysUserMapper sysUserMapper;
    @ApiOperation(value="首页", notes="")
    @RequestMapping("/index")
    public String index(ModelMap model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("msg",msg);
        return "index";
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
