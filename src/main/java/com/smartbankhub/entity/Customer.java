package com.smartbankhub.entity;


import jakarta.persistence.*;


@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String phone;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }


    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}