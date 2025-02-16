package com.heima.article.controller.v1;

import com.heima.article.service.ApArticleService;
import com.heima.common.constants.ArticleConstants;
import com.heima.model.article.dtos.ArticleDto;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleHomeController {
    
    
    @Autowired
    private ApArticleService apArticleService;
    
    /**
     * 加载首页
     * @param dto
     * @return
     */
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto) {
//        return apArticleService.load(ArticleConstants.LOADTYPE_LOAD_MORE,dto);
        return apArticleService.load2(dto, ArticleConstants.LOADTYPE_LOAD_MORE,true);
    
    }
    
    /**
     * 加载更多
     * @param dto
     * @return
     */
    @PostMapping("/loadmore")
    public ResponseResult loadMore(@RequestBody ArticleHomeDto dto) {
        return apArticleService.load(dto,ArticleConstants.LOADTYPE_LOAD_MORE);
    }
    
    /**
     * 加载更新
     * @param dto
     * @return
     */
    @PostMapping("/loadnew")
    public ResponseResult loadNew(@RequestBody ArticleHomeDto dto) {
        return apArticleService.load(dto,ArticleConstants.LOADTYPE_LOAD_NEW);
    }
//    @PostMapping("/save")
//    public ResponseResult saveArticle(@RequestBody ArticleDto dto) {
//        return apArticleService.saveArticle(dto);
//    }
    
}