package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.po.SysLog;
import org.springframework.stereotype.Repository;

@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}