package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "person")
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

    @Column(name = "roles")
    @NotEmpty
    private Role role;

    private Date date_registration;

    private Date last_login_time;


}
