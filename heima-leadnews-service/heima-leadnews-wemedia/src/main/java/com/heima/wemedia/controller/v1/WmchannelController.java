package com.heima.wemedia.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.ChannelPageReqDto;
import com.heima.model.wemedia.pojos.WmChannel;
import com.heima.wemedia.service.WmChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/channel")
public class WmchannelController {
    
    @Autowired
    private WmChannelService wmChannelService;
    
    @GetMapping("/channels")
    public ResponseResult findAll(){
        return wmChannelService.findAll();
    }
    @PostMapping("/list")
    public ResponseResult listAll(@RequestBody ChannelPageReqDto channelDto){
        return wmChannelService.listAll(channelDto);
    }
    @PostMapping("/save")
    public ResponseResult insert(@RequestBody WmChannel adChannel){
        return wmChannelService.insert(adChannel);
    }
    
    @PostMapping("/update")
    public ResponseResult update(@RequestBody WmChannel adChannel){
        return wmChannelService.update(adChannel);
    }
    
    @GetMapping("/del/{id}")
    public ResponseResult delete(@PathVariable("id") Integer id){
        return wmChannelService.delete(id);
    }
    
}