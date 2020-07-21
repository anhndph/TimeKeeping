package com.timekeep.timekeeping.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private Long code;

    @Column
    private String name;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<UserLog> userLogs;


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<UserLog> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(List<UserLog> userLogs) {
        this.userLogs = userLogs;
    }
}
