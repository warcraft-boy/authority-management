package com.chenjianwen.api.authority.po;

import java.util.Date;

public class SysUser {
    /**
     *主键
     */
    private Integer id;

    /**
     *用户名
     */
    private String userName;

    /**
     *手机号
     */
    private String telphone;

    /**
     *邮箱
     */
    private String mail;

    /**
     *密码
     */
    private String password;

    /**
     *部门id
     */
    private Integer deptId;

    /**
     *状态（1正常，0冻结，2删除）
     */
    private Integer status;

    /**
     *备注
     */
    private String remark;

    /**
     *操作者
     */
    private String operator;

    /**
     *操作时间
     */
    private Date operateTime;

    /**
     *操作ip
     */
    private String operateIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}