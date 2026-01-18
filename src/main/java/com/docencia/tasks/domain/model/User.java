package com.docencia.tasks.domain.model;

public class User {
    private Long id;
    private String userName;
    private String password;
    private String rol;
    
    public User() {
    }
    
    public User(Long id) {
        this.id = id;
    }

    public User(Long id,String userName, String password, String rol) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
