package com.heima.apis.schedule.fallback;

import com.heima.apis.article.IArticleClient;
import com.heima.apis.schedule.IScheduleClient;
import com.heima.model.article.dtos.ArticleDto;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.schedule.dtos.Task;
import org.springframework.stereotype.Component;

/**
 * feign失败配置
 * @author itheima
 */
@Component
public class IScheduleClientFallback implements IScheduleClient {
    
    /**
     * 添加任务
     *
     * @param task 任务对象
     * @return 任务id
     */
    @Override
    public ResponseResult addTask(Task task) {
        
            return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"添加任务失败");
       
    
    }
    
    /**
     * 取消任务
     *
     * @param taskId 任务id
     * @return 取消结果
     */
    @Override
    public ResponseResult cancelTask(long taskId) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"取消任务失败");
    }
    
    /**
     * 按照类型和优先级来拉取任务
     *
     * @param type
     * @param priority
     * @return
     */
    @Override
    public ResponseResult poll(int type, int priority) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"拉取任务失败");
    }
}