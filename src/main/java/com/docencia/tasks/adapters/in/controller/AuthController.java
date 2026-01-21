package com.docencia.tasks.adapters.in.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.docencia.tasks.adapters.in.api.UserRequest;
import com.docencia.tasks.infrastructure.security.AuthService;
import com.docencia.tasks.infrastructure.security.JwtService;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;
    private final JwtService jwtService;

    public AuthController(AuthService authService, JwtService jwtService) {
        this.authService = authService;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserRequest user) {
        try {
            String token = authService.login(user.getUsername(), user.getPassword());
            System.out.println("Roles en el token: " + jwtService.extractRoles(token));
            return ResponseEntity.ok(Map.of("token", token));
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
    }
}
