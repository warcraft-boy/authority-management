package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.po.SysAcl;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAclMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}