package com.cncs.controller;


import com.cncs.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(path = "/user")
public class UserController {


    /**
     * 测试原生方式文件上传
     *
     * @return
     */
    @RequestMapping(path = "/testFileUpload")
    public String testFileUpload(HttpServletRequest request) throws Exception {
        System.out.println("testFileUpload executing...");
        //获取上传的路径
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        //用户名
        String username = null;
        //年龄
        int age = 0;
//用户类
        User user = new User();
        File file = new File(path);
        if (!file.exists()) {
            //文件夹不存在，创建路径
            file.mkdirs();
        }
        //创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建servlet文件上传对象
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request对象
        List<FileItem> fileItems = upload.parseRequest(request);
        //便利fileItems
        for (FileItem fileItem : fileItems) {
            if (fileItem.isFormField()) {
                System.out.println(fileItem.getName());
                //普通项
//                if (fileItem.getName().equals("username")) {
//                    username = fileItem.getString();
//                    user.setUsername(username);
//                } else if (fileItem.getName().equals("age")) {
//                    age = Integer.parseInt(fileItem.getString());
//                    user.setAge(age);
//                }
            } else {
                //上传项
                //获取上传的文件名称
                String filename = fileItem.getName();
                //通过UUID获取唯一标识码
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid + filename;
                //写入上传的文件到本地
                fileItem.write(new File(file, filename));
                //删除临时文件
                fileItem.delete();
                //打印图片路径
                System.out.println(path + filename);
            }
        }
        System.out.println("user:"+user);
        return "success";

    }
}
