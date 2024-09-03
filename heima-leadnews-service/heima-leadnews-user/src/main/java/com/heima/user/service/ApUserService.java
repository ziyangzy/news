package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.LoginDto;
import com.heima.model.user.pojos.ApUser;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-03-08
 */
public interface ApUserService extends IService<ApUser> {
    
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    ResponseResult login(LoginDto dto);
}
