package com.dr4kk0nnys.project.models;

public class User {

    private String fullName;
    private String email;
    private String password;

    public User(User user) {
        this.fullName = user.fullName;
        this.email = user.email;
        this.password = user.password;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
