package com.chenjianwen.service.authority.impl;

import com.chenjianwen.api.authority.param.DeptParam;
import com.chenjianwen.api.authority.po.SysDept;
import com.chenjianwen.dal.authority.SysDeptMapper;
import com.chenjianwen.exceptions.ParamException;
import com.chenjianwen.service.authority.SysDeptService;
import com.chenjianwen.utils.BeanValidator;
import com.chenjianwen.utils.LevelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description: 部门service接口实现类
 * @Author chenjianwen
 * @Date 2019-08-24
 **/
@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public void save(DeptParam param){
        BeanValidator.check(param);
        if(checkExist(param.getParentId(),param.getName(),param.getId())){
            throw new ParamException("同一层级下存在相同名称的部门");
        }
        SysDept dept = SysDept.builder().name(param.getName()).parentId(param.getParentId())
                                        .seq(param.getSeq()).remark(param.getRemark()).build();

        dept.setLevel(LevelUtil.calculateLevel(getLevel(param.getParentId()),param.getParentId()));
        dept.setOperator("system"); //TODO
        dept.setOperateIp("127.0.0.1"); //TODO
        dept.setOperateTime(new Date());
        sysDeptMapper.insertSelective(dept);
    }

    private boolean checkExist(Integer parentId,String deptName,Integer deptId){
        //TODO;
        return true;
    }

    private String getLevel(Integer deptId){
        SysDept sysDept = sysDeptMapper.selectByPrimaryKey(deptId);
        if(sysDept == null){
            return null;
        }
        return sysDept.getLevel();
    }
}
