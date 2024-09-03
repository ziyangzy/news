package com.heima.minio.test;


import com.heima.file.service.FileStorageService;
import com.heima.minio.MinioApplication;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest(classes = MinioApplication.class)
@RunWith(SpringRunner.class)
public class MinioTest {
    
    @Autowired
    private FileStorageService fileStorageService;
    
    @Test
    public void testUpdateImgFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\tmp\\ak47.jpg");
            String filePath = fileStorageService
                    .uploadImgFile("", "ak47.jpg", fileInputStream);
            System.out.println(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testuploadHtmlFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\list.html");
            String filePath = fileStorageService
                    .uploadHtmlFile("", "list.html", fileInputStream);
            System.out.println(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 文件上传到文件系统
     * @param args
     */
    public static void main(String[] args) {
        
        FileInputStream fileInputStream = null;
        try {
            
            fileInputStream =  new FileInputStream("D:\\tt\\index.js");
            //"D:\tt\index.js"
            //1.创建minio链接客户端
            MinioClient minioClient = MinioClient.builder().
                    credentials("admin", "admin123")
                    .endpoint("http://192.168.150.130:9000").build(); 
            //2.上传
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/index.js")//文件名
                    .contentType("text/javascript")//文件类型
                    .bucket("leadnews")//桶名词  与minio创建的名词一致
                    .stream(fileInputStream, fileInputStream.available(), -1) //文件流
                    .build();
            minioClient.putObject(putObjectArgs);
            
            System.out.println("http://192.168.150.130:9000/leadnews/list.html");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}