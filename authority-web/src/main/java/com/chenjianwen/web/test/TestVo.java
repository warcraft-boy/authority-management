package com.chenjianwen.web.test;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description: <br>
 * @Date: Created in 2019/8/23 <br>
 * @Author: chenjianwen
 */

@Getter
@Setter
public class TestVo {

    @NotBlank
    private String msg;

    @NotNull
    private Integer id;

    @NotEmpty
    private List<String> list;
}
