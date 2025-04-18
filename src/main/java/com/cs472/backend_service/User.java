package com.cs472.backend_service;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(length = 100)
    private String major;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType type;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public User() {

    }

    public User(String email, String nickname, String password, String major, UserType type) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.major = major;
        this.type = type;
    }
}

enum UserType {
    STUDENT, ORG
}