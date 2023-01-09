package com.example.loginRSA.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class Security {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Solution 403 for POST request
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/v1/login").permitAll()
                .anyRequest().authenticated();
        return http.build();
    }
}
