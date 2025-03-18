package com.koenig.springSecurity3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	  @Bean
	    public UserDetailsService userDetailsService(DataSource dataSource) {
	        return new JdbcUserDetailsManager(dataSource);
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	 
	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/home", "/contact").permitAll()  // Public URLs
	                .anyRequest().authenticated()
	            )
	            .formLogin(login -> login
	                .defaultSuccessUrl("/dashboard", true)  // Redirect after login
	                .permitAll()
	            )
	            .logout(logout -> logout
	                .logoutUrl("/logout")
	                .logoutSuccessUrl("/home")
	                .permitAll()
	            );

	        return http.build();
	    }
}
