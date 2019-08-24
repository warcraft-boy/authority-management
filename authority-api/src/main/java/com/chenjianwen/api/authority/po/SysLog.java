package com.chenjianwen.api.authority.po;

import java.util.Date;

public class SysLog {
    /**
     *主键
     */
    private Integer id;

    /**
     *权限更新类型（1部门，2用户，3权限模块，4权限，5角色，6角色用户关系，7角色权限关系）
     */
    private Integer type;

    /**
     *基于type后指定的对象id，比如用户，权限，角色表的等的主键
     */
    private Integer targetId;

    /**
     *旧值
     */
    private String oldValue;

    /**
     *新值
     */
    private String newValue;

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

    /**
     *当前是否复原过（0没有，1有）
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}