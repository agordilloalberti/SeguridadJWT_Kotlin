package com.es.jwtSecurityKotlin.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity) : SecurityFilterChain {

        return http
            .csrf { csrf -> csrf.disable() }
            .authorizeHttpRequests { auth -> auth
                .requestMatchers("/rutas_protegidas/**").authenticated()
                .requestMatchers("/secretos/secreto2").permitAll()
                .requestMatchers("/secretos/secreto1").authenticated()
                .requestMatchers("/rutas_publicas/**").permitAll()
                .anyRequest().authenticated()
            }
            .sessionManagement { session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            }
            .httpBasic(Customizer.withDefaults())
            .build()
    }

    @Bean
    fun passwordEncode():PasswordEncoder{
        return BCryptPasswordEncoder()
    }
}