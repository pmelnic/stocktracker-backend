package com.stocktracker.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email",  nullable = false, unique = true, length = 254)
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
}
