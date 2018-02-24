package main.java.com.farmerassistant.model;

import java.util.Date;

public class SysUser {
    private Long sysUserid;

    private String sysUsername;

    private String sysUserpwd;

    private String sysUsersex;

    private String sysUserresumeurl;

    private Date sysUserentrytime;

    private Date sysUserleavetime;

    private String sysUserrank;

    private String sysUserjobnumber;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    private String sysUserstatus;

    public Long getSysUserid() {
        return sysUserid;
    }

    public void setSysUserid(Long sysUserid) {
        this.sysUserid = sysUserid;
    }

    public String getSysUsername() {
        return sysUsername;
    }

    public void setSysUsername(String sysUsername) {
        this.sysUsername = sysUsername == null ? null : sysUsername.trim();
    }

    public String getSysUserpwd() {
        return sysUserpwd;
    }

    public void setSysUserpwd(String sysUserpwd) {
        this.sysUserpwd = sysUserpwd == null ? null : sysUserpwd.trim();
    }

    public String getSysUsersex() {
        return sysUsersex;
    }

    public void setSysUsersex(String sysUsersex) {
        this.sysUsersex = sysUsersex == null ? null : sysUsersex.trim();
    }

    public String getSysUserresumeurl() {
        return sysUserresumeurl;
    }

    public void setSysUserresumeurl(String sysUserresumeurl) {
        this.sysUserresumeurl = sysUserresumeurl == null ? null : sysUserresumeurl.trim();
    }

    public Date getSysUserentrytime() {
        return sysUserentrytime;
    }

    public void setSysUserentrytime(Date sysUserentrytime) {
        this.sysUserentrytime = sysUserentrytime;
    }

    public Date getSysUserleavetime() {
        return sysUserleavetime;
    }

    public void setSysUserleavetime(Date sysUserleavetime) {
        this.sysUserleavetime = sysUserleavetime;
    }

    public String getSysUserrank() {
        return sysUserrank;
    }

    public void setSysUserrank(String sysUserrank) {
        this.sysUserrank = sysUserrank == null ? null : sysUserrank.trim();
    }

    public String getSysUserjobnumber() {
        return sysUserjobnumber;
    }

    public void setSysUserjobnumber(String sysUserjobnumber) {
        this.sysUserjobnumber = sysUserjobnumber == null ? null : sysUserjobnumber.trim();
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

    public String getSysUserstatus() {
        return sysUserstatus;
    }

    public void setSysUserstatus(String sysUserstatus) {
        this.sysUserstatus = sysUserstatus == null ? null : sysUserstatus.trim();
    }
}