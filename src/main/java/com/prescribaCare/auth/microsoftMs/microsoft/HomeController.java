package com.prescribaCare.auth.microsoftMs.microsoft;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getHome() {
        return ResponseEntity.ok("You Are An Anonymous User");
    }

    @GetMapping("/secured")
    public ResponseEntity<String> getHomeSecured() {
        return ResponseEntity.ok("You Are An Authorized User");
    }
}
