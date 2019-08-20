package com.chenjianwen.api.authority;

import java.util.Date;

public class SysRole {
    /**
     *角色id
     */
    private Long id;

    /**
     *角色名称
     */
    private String name;

    /**
     *角色类型（1管理员，2其他）
     */
    private Integer type;

    /**
     *状态（1可用，2冻结）
     */
    private Integer status;

    /**
     *备注
     */
    private String remark;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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