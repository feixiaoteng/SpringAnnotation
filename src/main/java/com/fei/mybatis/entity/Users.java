package com.fei.mybatis.entity;

import org.apache.ibatis.type.Alias;

/**
 * @author feixiaoteng
 * @create 2019-06-25 10:36
 */
//在需要别名的类上添加@Alias名指定别名名称
@Alias("users")
public class Users {
    private Long id;
    private String mobile;
    private String name;
    private String email;
    private String password;

    public Users() {
    }

    public Users(String mobile, String name, String email, String password) {
        this.mobile = mobile;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users:{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
