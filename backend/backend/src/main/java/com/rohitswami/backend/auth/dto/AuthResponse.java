package com.rohitswami.backend.auth.dto;

import com.rohitswami.backend.user.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private String token;

    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private Role role;
}