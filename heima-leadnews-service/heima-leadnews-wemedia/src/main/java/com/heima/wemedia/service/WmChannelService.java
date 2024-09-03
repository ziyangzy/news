package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.ChannelPageReqDto;
import com.heima.model.wemedia.pojos.WmChannel;

public interface WmChannelService extends IService<WmChannel> {

    /**
     * 查询所有频道
     * @return
     */
    public ResponseResult findAll();
    
    
    ResponseResult listAll(ChannelPageReqDto channelDto);
    
    ResponseResult insert(WmChannel adChannel);
    
    ResponseResult update(WmChannel wmChannel);
    
    ResponseResult delete(Integer id);
}