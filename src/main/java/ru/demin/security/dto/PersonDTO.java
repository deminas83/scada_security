package ru.demin.security.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class PersonDTO {
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
}
