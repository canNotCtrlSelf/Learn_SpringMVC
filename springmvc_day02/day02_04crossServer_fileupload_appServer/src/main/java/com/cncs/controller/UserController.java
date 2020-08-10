package com.cncs.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testUpload")
    public String testUpload(MultipartFile upload) throws Exception {
        System.out.println("testUpload executing...");
        String path="http://localhost:8090/picServer/uploads/";

        //获取文件名
        String filename = upload.getOriginalFilename();
        //获取文件
        Client client = Client.create();

        WebResource webResource = client.resource(path + filename);

        webResource.put(String.class,upload.getBytes());

        return "success";
    }
}
