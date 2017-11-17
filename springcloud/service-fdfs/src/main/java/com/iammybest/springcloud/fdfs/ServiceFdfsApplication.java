package com.iammybest.springcloud.fdfs;

import com.github.tobato.fastdfs.FdfsClientConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

@SpringBootApplication
@Import(FdfsClientConfig.class)
//@RestController
public class ServiceFdfsApplication {

//    @Autowired
//    FastFileStorageClient fastFileStorageClient;

    public static void main(String[] args) {
        SpringApplication.run(ServiceFdfsApplication.class, args);
    }

//    @RequestMapping("/img/upload")
//    public String testIamge() {
//        // * @param groupName
//        // * @param inputStream
//        // * @param fileSize
//        // * @param fileExtName
//        try {
//            File ifile = new File("D:\\timg.jpg");
//            ifile.length();
//            FileInputStream fis = new FileInputStream(new File(""));
//            fastFileStorageClient.uploadFile("deng", fis, ifile.length(), "jpg");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return "FileNotFoundException " + new Date();
//        }
//        return "SUCCESS " + new Date();
//    }
}
