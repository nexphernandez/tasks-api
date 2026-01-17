package com.docencia.tasks.infrastructure.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JpaUserDetailsService userDetailsService;
    private final JwtService jwtService;

    public AuthService(JpaUserDetailsService uds, JwtService jwtService) {
        this.userDetailsService = uds;
        this.jwtService = jwtService;
    }

    public String login(String username, String password) {
        UserDetails user = userDetailsService.loadUserByUsername(username);
        if (!new BCryptPasswordEncoder().matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        // Genera JWT con roles
        return jwtService.generateToken(user.getUsername(), user.getAuthorities());
    }
}
