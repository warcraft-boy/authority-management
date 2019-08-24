package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.po.SysDept;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}