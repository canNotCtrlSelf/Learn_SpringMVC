package com.cncs.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String uname;
    private Integer age;
    private String birthday;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
