package com.springboot.jpa.entity;

import javax.persistence.*;

@Entity(name = "t_sys_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
   // @Column(name="name")
    private String userName;
    private String address;

}
