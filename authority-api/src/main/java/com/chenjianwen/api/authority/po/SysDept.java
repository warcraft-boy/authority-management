package com.chenjianwen.api.authority.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysDept {
    /**
     *部门id
     */
    private Integer id;

    /**
     *部门名称
     */
    private String name;

    /**
     *上级部门的id
     */
    private Integer parentId;

    /**
     *部门层级
     */
    private String level;

    /**
     *部门在当前层级中的顺序，有小到大
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
     *操作的ip
     */
    private String operateIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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