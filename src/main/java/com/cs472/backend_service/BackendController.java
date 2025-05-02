package com.cs472.backend_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = {
        "https://cs272-s25.github.io",
        "http://127.0.0.1"
})
public class BackendController {

    @Autowired
    private BackendService backendService;

    @PostMapping("/signin")
    public ResponseEntity<Map<String, Object>> simpleSignIn(
            @RequestBody Map<String, String> credentials) {

        String email = credentials.get("email");
        String password = credentials.get("password");

        User user = backendService.validateCredentials(email, password);

        if (user != null) {
            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "userId", user.getId(),
                    "message", "Authenticated",
                        "nickname", user.getNickname(),
                    "email", user.getEmail()
            ));
        } else {
            return ResponseEntity.status(401).body(Map.of(
                    "status", "error",
                    "message", "Invalid credentials"
            ));
        }
    }
}
