package main.java.com.farmerassistant.model;

import java.util.Date;

public class SysRole {
    private Integer sysRoleid;

    private String sysRolename;

    private String sysRoledesc;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    public Integer getSysRoleid() {
        return sysRoleid;
    }

    public void setSysRoleid(Integer sysRoleid) {
        this.sysRoleid = sysRoleid;
    }

    public String getSysRolename() {
        return sysRolename;
    }

    public void setSysRolename(String sysRolename) {
        this.sysRolename = sysRolename == null ? null : sysRolename.trim();
    }

    public String getSysRoledesc() {
        return sysRoledesc;
    }

    public void setSysRoledesc(String sysRoledesc) {
        this.sysRoledesc = sysRoledesc == null ? null : sysRoledesc.trim();
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
}