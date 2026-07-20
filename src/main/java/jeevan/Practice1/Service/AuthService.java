package jeevan.Practice1.Service;

import jeevan.Practice1.Dto.AuthResponse;
import jeevan.Practice1.Dto.LoginRequest;
import jeevan.Practice1.Dto.RegisterRequest;
import jeevan.Practice1.Entity.User;
import jeevan.Practice1.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AuthResponse register(RegisterRequest request) {
        if (repository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        User users = new User();
        users.setEmail(request.getEmail());
        users.setUsername(request.getUsername());
        users.setPassword(passwordEncoder.encode(request.getPassword()));

        users.setRole("USER");

        repository.save(users);

        return new AuthResponse(
                "Registration Successfully "
        );
    }

    public AuthResponse login(LoginRequest request) {

        User users = repository.findByEmail(request.getEmail()).orElseThrow(() -> new RuntimeException(
                "User not found"));
        boolean match = passwordEncoder.matches(
                request.getPassword(),
                users.getPassword()
        );
        if (!match){
            throw new RuntimeException(
                    "Invalid password"
            );
        }

        return new AuthResponse(
                "Login Successfully"
        );
    }

    public AuthResponse logout(String massage) {
        return new AuthResponse(
                "logout Successfully "
        );
    }
}
