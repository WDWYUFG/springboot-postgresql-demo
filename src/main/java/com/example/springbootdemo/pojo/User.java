package com.example.springbootdemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Table(name = "tb_user")
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    @JsonProperty("userName")
    private String userName;
    @Column(name = "password")
    @JsonProperty("password")
    private String password;
    @Column(name = "email")
    @JsonProperty("email")
    private String email;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userId=" + userId +
                '}';
    }
}
