package com.example.cafebackend.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
    
    @Column(name = "is_logged_in")
    private boolean loggedIn;

    public User(String username, String password, String role,boolean loggedIn) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.loggedIn = loggedIn;
    }

}
