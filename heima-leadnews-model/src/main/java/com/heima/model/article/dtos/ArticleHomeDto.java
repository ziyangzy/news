package com.heima.model.article.dtos;

import io.swagger.models.auth.In;
import lombok.Data;

import java.util.Date;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-03-09
 */
@Data
public class ArticleHomeDto {
    //最大时间
    Date maxBehotTime;
    //最小时间
    Date minBehotTime;
    //分页size
    Integer size;
    
    //频道id
    String tag;
    
}
