package com.hulu.pojo;

/**
 * Description: new java files header..
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/29 21:17
 */

public class user {
    private Integer id;
    private String username;
    private String number;
    private String password;
    private Integer admin;
    private Integer sid;

    public user(){}

    public user(Integer id,String username,String number,String password,Integer admin,Integer sid){

        this.id=id;
        this.username=username;
        this.number=number;
        this.password=password;
        this.admin=admin;
        this.sid=sid;

    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                ", sid=" + sid +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }

    public Integer getSid() {
        return sid;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }
}
