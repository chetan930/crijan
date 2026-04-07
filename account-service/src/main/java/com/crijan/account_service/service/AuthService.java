package com.crijan.account_service.service;

import com.crijan.account_service.dto.auth.AuthResponse;
import com.crijan.account_service.dto.auth.LoginRequest;
import com.crijan.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
