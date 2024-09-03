package com.heima.model.wemedia.dtos;

import com.baomidou.mybatisplus.annotation.TableField;
import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-08-14
 */
@Data
public class ChannelPageReqDto extends PageRequestDto {
    private String name;
    
    
}
