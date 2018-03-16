package com.farmerassistant.security;

/*import com.farmerassistant.mapper.SysUserMapper;
import com.farmerassistant.model.SysRole;
import com.farmerassistant.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang.donga on 2018/2/24.
 */
@Service(value="userService")
public class CustomUserService {//implements UserDetailsService {
    /*@Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public UserDetails loadUserByUsername(String userjobNumber) throws UsernameNotFoundException {
        SysUser sysUser = sysUserMapper.findByJobNumber(userjobNumber);
        if(sysUser == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        if(sysUser.getSysRoles()!=null && sysUser.getSysRoles().size()>0){
            for(SysRole role : sysUser.getSysRoles()){
                authorities.add(new SimpleGrantedAuthority(role.getSysRolename()));
                System.out.println(role.getSysRolename());
            }
        }
        return new org.springframework.security.core.userdetails.User(sysUser.getSysUserjobnumber(),
                sysUser.getSysUserpwd(), authorities);
    }*/
}
