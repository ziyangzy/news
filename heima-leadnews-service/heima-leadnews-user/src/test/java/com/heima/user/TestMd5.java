package com.heima.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-08-09
 */
@SpringBootTest
public class TestMd5 {
    @Test
    public void testMd5(){
            //1.2 比对密码
            String salt = "abc";
            String pswd = "123";
            System.out.println(DigestUtils.md5DigestAsHex((pswd + salt).getBytes()));
        
    
    }
}
