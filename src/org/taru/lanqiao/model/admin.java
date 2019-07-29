package org.taru.lanqiao.model;

public class admin {
    private String username;
    private String password;
    private String id;
    private String telphone;
    private String email;
    private String realname;
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getRealname() {
        return realname;
    }
    public String getTelphone() {
        return telphone;
    }
    public String getUsername() {
        return username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
