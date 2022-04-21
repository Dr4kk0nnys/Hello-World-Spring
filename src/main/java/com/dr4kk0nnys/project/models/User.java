package com.dr4kk0nnys.project.models;

public class User {

    private String name;
    private String email;
    private String password;

    public User(User user) {
        this.name = user.name;
        this.email = user.email;
        this.password = user.password;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
