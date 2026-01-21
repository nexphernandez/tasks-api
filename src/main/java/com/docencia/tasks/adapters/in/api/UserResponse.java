package com.docencia.tasks.adapters.in.api;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class UserResponse {
    private Long id;
    private String username;
    private String password;

    /**
    * Constructor vacio
    */
    public UserResponse() {
    }
    
    /**
     * Consturctor con el identificador de la clase
     * @param id identificador del usuario
     */
    public UserResponse(Long id) {
        this.id = id;
    }

    /**
     * Constructor con los atributos de la clase
     * @param id identificador del usuario
     * @param username nombre de usuario
     * @param password contrasenia del usuario
     */
    public UserResponse(Long id,String username, String password) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) o;
        return Objects.equals(id, userResponse.id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
