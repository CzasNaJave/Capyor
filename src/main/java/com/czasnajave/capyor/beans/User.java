package com.czasnajave.capyor.beans;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name="username", nullable=false)
    private String username;

    @NotEmpty
    @Column(name="email", nullable=false)
    private String emailAddress;

    @NotEmpty
    @Column(name="password", nullable=false)
    private String password;



    public User() { }

    public User(String username, String emailAddress, String password) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {return emailAddress;}

    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}
}
