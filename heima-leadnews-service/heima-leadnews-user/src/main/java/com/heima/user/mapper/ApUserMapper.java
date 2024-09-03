package com.heima.user.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.user.pojos.ApUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * APP用户信息表(User)表数据库访问层
 *
 * @author makejava
 * @since 2024-03-08 20:48:04
 */
@Mapper
public interface ApUserMapper extends BaseMapper<ApUser> {
    
}
