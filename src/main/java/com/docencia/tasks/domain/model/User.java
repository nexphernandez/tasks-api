package com.docencia.tasks.domain.model;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class User {

    private Long id;
    private String username;
    private String password;
    private String rol;

    /**
     * Constructor vacio
     */
    public User() {
    }

    /**
     * Consturctor con el identificador de la clase
     *
     * @param id identificador del usuario
     */
    public User(Long id) {
        this.id = id;
    }

    /**
     * Constructor con los atributos de la clase
     *
     * @param id identificador del usuario
     * @param username nombre de usuario
     * @param password contrasenia del usuario
     * @param rol rol del usuario
     */
    public User(Long id, String username, String password, String rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
