package com.dr4kk0nnys.project.models;

import java.util.List;

public class Contract {

    private String id;
    private String description;
    private List<String> users;

    public Contract(Contract contract) {
        this.id = contract.id;
        this.description = contract.description;
        this.users = contract.users;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
