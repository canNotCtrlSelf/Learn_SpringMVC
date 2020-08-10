package com.cncs.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        System.out.println("converter 执行了。。。");
        //创建一个格式转换器
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (source == null) {
                throw new RuntimeException("输入的日期为空");
            }
            return format.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("输入的格式错误");
        }
    }
}
