package com.heima.model.admin.dto;

import lombok.Data;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-08-14
 */
@Data
public class AdLoginDto {
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    
}
