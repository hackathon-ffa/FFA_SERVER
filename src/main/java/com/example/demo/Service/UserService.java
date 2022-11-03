package com.example.demo.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public abstract class UserService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    public UserEntity loadUserByUsername(String UserId) throws UsernameNotFoundException {
        return userRepository.findByUserId(UserId)
                .orElseThrow(() -> new UsernameNotFoundException((UserId)));
    }
}



