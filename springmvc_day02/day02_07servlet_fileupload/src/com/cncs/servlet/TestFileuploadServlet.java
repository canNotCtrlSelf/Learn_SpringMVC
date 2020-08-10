package com.cncs.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

//@WebServlet(name = "TestFileuploadServlet")
public class TestFileuploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println("testFileUpload executing...");
        //获取上传的路径
        String path = request.getSession().getServletContext().getRealPath("/uploads");
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
        List<FileItem> fileItems = null;
        try {
            fileItems = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        //便利fileItems
        for (FileItem fileItem : fileItems) {
            if (fileItem.isFormField()) {
                //普通项
            } else {
                //上传项
                //获取上传的文件名称
                String filename = fileItem.getName();
//                filename = new String(filename.getBytes("ISO-8859-1"),"UTF-8");
                //通过UUID获取唯一标识码
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid + filename;
                //写入上传的文件到本地
                try {
                    fileItem.write(new File(file, filename));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //删除临时文件
                fileItem.delete();
            }
        }
        System.out.println("文件上传成功！！！");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
