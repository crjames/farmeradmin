package com.farmerassistant.mapper;

import com.farmerassistant.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "sysUserMapper")
public interface SysUserMapper {
    int deleteByPrimaryKey(Long sysUserid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long sysUserid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser findByJobNumber(String sysUserjobnumber);
}