package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.po.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}