package com.fitness.userservice.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.UUID;
@Data
public class UserResponse {

    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String dob;
    private Boolean mfaEnabled = false;
}
