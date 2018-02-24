package com.farmerassistant.mapper;

import com.farmerassistant.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer sysRoleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer sysRoleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}