package com.farmerassistant.model;

import java.util.Date;

public class SysUserRole {
    private Long id;

    private Long sysUserid;

    private Long sysRoleid;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysUserid() {
        return sysUserid;
    }

    public void setSysUserid(Long sysUserid) {
        this.sysUserid = sysUserid;
    }

    public Long getSysRoleid() {
        return sysRoleid;
    }

    public void setSysRoleid(Long sysRoleid) {
        this.sysRoleid = sysRoleid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
                "id=" + id +
                ", sysUserid=" + sysUserid +
                ", sysRoleid=" + sysRoleid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}