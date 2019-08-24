package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.po.SysRoleAcl;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}