package com.mail.mapper;

import com.mail.pojo.TbSysMail;
import com.mail.pojo.TbSysMailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysMailMapper {
    int countByExample(TbSysMailExample example);

    int deleteByExample(TbSysMailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysMail record);

    int insertSelective(TbSysMail record);

    List<TbSysMail> selectByExample(TbSysMailExample example);

    TbSysMail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysMail record, @Param("example") TbSysMailExample example);

    int updateByExample(@Param("record") TbSysMail record, @Param("example") TbSysMailExample example);

    int updateByPrimaryKeySelective(TbSysMail record);

    int updateByPrimaryKey(TbSysMail record);
}