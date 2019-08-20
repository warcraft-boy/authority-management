package com.chenjianwen.api.authority;

import java.util.Date;

public class SysAclModule {
    /**
     * 权限模块主键
     */
    private Long id;

    /**
     *权限名称
     */
    private String name;

    /**
     *上级权限模块id
     */
    private Integer parentId;

    /**
     *权限模块层级
     */
    private String level;

    /**
     *状态（1正常，0冻结，2删除）
     */
    private Integer status;

    /**
     *权限模块在当前层级下的顺序，由小到大
     */
    private Integer seq;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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