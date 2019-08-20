package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.SysAcl;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAclMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}