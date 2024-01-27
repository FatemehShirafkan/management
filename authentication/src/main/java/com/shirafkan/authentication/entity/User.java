package com.shirafkan.authentication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "Email")
    private String email;

    @Size(max = 255)
    @Column(name = "Password")
    private String password;

    @Size(max = 255)
    @Column(name = "Role")
    private String role;
}