package com.example.user_management.dto;

public class LoginRequest {
    private String user;
    private String pasword;
    public LoginRequest(){
    }

    public LoginRequest(String user, String pasword) {
        this.user = user;
        this.pasword = pasword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
