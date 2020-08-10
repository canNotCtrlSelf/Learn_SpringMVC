package com.cncs.controller;

import com.cncs.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testUpload")
    public String testUpload(HttpServletRequest request, MultipartFile upload, User user) throws Exception {
        System.out.println("testUpload executing...");
        System.out.println("user:"+user);
        //从上传文件中获取文件名
        String filename = upload.getOriginalFilename();
        System.out.println(filename);
        //取一个名称唯一的文件名
        String replace = UUID.randomUUID().toString().replace("-", "");
        filename = replace + filename;
        //获取文件路径
        String path = request.getSession().getServletContext().getRealPath("/img/uploads");
        //获取文件操作类
        File file = new File(path);
        //判断文件是否存在
        if (!file.exists()) {
            //文件不存在，递归创建路径
            file.mkdirs();
        }
        //从旧文件创建新文件
        upload.transferTo(new File(file, filename));
        return "success";
    }
}
