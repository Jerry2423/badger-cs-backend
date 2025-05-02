package com.cs472.backend_service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BackendService {
    @Autowired
    private UserRepository userRepository;


    public User validateCredentials(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public boolean userExists(String email) {
        if (userRepository.findByEmail(email) != null) {
            return true;
        }
        return false;
    }
}
