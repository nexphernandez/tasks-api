package com.docencia.tasks.adapters.out.persistence.jpa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * @author nexphernandez
 * @version 1.0.0 Clase entity de usuario
 */
@Entity
@Table(name = "users")
public class UserJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",nullable=false,unique=true)
    private String username;

    @Column(name = "password",nullable=false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RolJpaEntity> roles;

    /**
     * Constructor vacio
     */
    public UserJpaEntity() {
        this.roles = new HashSet<>();
    }

    /**
     * Constructor con el identificador del usuario
     *
     * @param id identificador del usuario
     */
    public UserJpaEntity(Long id) {
        this.id = id;
        this.roles = new HashSet<>();
    }

    /**
     * Constructor con los atributos del usuario
     *
     * @param id identificador del usuario
     * @param username nombre de usuario
     * @param password contraseña
     */
    public UserJpaEntity(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = new HashSet<>();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<RolJpaEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolJpaEntity> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserJpaEntity)) {
            return false;
        }
        UserJpaEntity userJpaEntity = (UserJpaEntity) o;
        return Objects.equals(id, userJpaEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
