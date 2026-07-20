package jeevan.Practice1.Controller;

import jakarta.validation.Valid;
import jeevan.Practice1.Dto.AuthResponse;
import jeevan.Practice1.Dto.LoginRequest;
import jeevan.Practice1.Dto.RegisterRequest;
import jeevan.Practice1.Entity.User;
import jeevan.Practice1.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest request){
        return ResponseEntity.ok(
                service.register(request)
        );
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest request){
        return ResponseEntity.ok(
                service.login(request)
        );
    }

    @PostMapping("/logout")
    public  ResponseEntity<AuthResponse>  logout(String massage){
        return ResponseEntity.ok(
                service.logout(massage)
        );
    }
}
