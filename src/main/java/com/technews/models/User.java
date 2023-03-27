package com.technews.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer id;
    private String username;
    @Column(unique = true)
    private String email;
    @Transient
    private String password;
    boolean loggedIn;

    private List<Post> posts;
    private List<Vote> votes;
    private List<Comment> comments;
}
