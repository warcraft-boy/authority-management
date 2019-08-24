package com.chenjianwen.api.authority.po;

import java.util.Date;

public class SysRoleUser {
    /**
     *主键
     */
    private Integer id;

    /**
     *角色id
     */
    private Integer roleId;

    /**
     *用户id
     */
    private Integer userId;

    /**
     *操作员
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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