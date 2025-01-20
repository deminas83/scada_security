package ru.demin.security.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "person_security_scada")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    @NotEmpty
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов!")
    private String username;

    @Column(name = "password")
    @NotEmpty
    @Size(min = 3, max=50, message = "Длина пароля должная быть от 3 до 50 символов!")
    private String password;

    @Column(name = "email")
    @NotEmpty
    @Email
    String email;

    @Column(name = "role")
    @NotEmpty
    private Role role;

    @Column(name = "date_registration")
    private Date date_registration;

    @Column(name = "last_login_time")
    private Date last_login_time;


}
