package com.chenjianwen.api.authority.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * @Description: 部门类入参
 * @Author chenjianwen
 * @Date 2019/08/24
 **/
@Setter
@Getter
@ToString
public class DeptParam {

    /**
     *部门id
     */
    private Integer id;

    /**
     *部门名称
     */
    @NotBlank(message = "部门名称不能为空")
    @Length(max = 15,min = 2,message = "部门名称必须在2到15个字之间")
    private String name;

    /**
     *上级部门的id
     */
    private Integer parentId;

    /**
     *部门在当前层级中的顺序，有小到大
     */
    @NotBlank(message = "展示顺序不能为空")
    private Integer seq;

    /**
     *备注
     */
    @Length(max = 150,message = "备注的长度须在150个字之间")
    private String remark;
}
