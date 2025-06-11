package com.backend.tapronto.user.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email",  unique = true, nullable = false,  length = 100, updatable = true)
    private String email;

    @Column(name = "username", unique = true,  nullable = false,  length = 50, updatable = false)
    private String username;

    @Column(name = "password", nullable = false,  updatable = true)
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name = "profile",  nullable = false,  updatable = true)
    private String profile;

    // Construtor vazio pro JPA
    public User () {}

    //Construtores
    public User(String username, String password, String confirmPassword, String email, String profile) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.profile = profile;
    }


    //Getters e Setters
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}