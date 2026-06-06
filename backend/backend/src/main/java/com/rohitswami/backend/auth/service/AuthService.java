package com.rohitswami.backend.auth.service;

import com.rohitswami.backend.auth.dto.AuthResponse;
import com.rohitswami.backend.auth.dto.LoginRequest;
import com.rohitswami.backend.auth.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}