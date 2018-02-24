package main.java.com.farmerassistant.mapper;

import main.java.com.farmerassistant.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long sysUserid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long sysUserid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}