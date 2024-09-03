package com.heima.admin.controller.v1;


import com.heima.model.admin.dto.AdLoginDto;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.admin.service.AdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private AdUserService adUserService;
//    http://localhost:8802/wemedia/MEDIA/wemedia/login/in
    @PostMapping("/in")
    public ResponseResult login(@RequestBody AdLoginDto dto){
        return adUserService.login(dto);
    }
}
