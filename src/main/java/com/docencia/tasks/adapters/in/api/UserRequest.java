package com.docencia.tasks.adapters.in.api;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class UserRequest {
    private String username;
    private String password;
    
    /**
    * Constructor vacio
    */
    public UserRequest() {
    }
    
    /**
     * Constructor con los atributos de la clase
     * @param username nombre de usuario
     * @param password contrasenia del usuario
     */
    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
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
    
    
}
