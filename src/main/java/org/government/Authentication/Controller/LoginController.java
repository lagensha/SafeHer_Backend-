package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.LoginDTO;
import org.government.Authentication.Service.Impl.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/login")
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> loginUser(@RequestBody LoginDTO loginDTO) {
        if (loginService.loginUser(loginDTO)) {
            return ResponseEntity.ok(Map.of("message", "Login successful"));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Map.of("message", "Invalid email or password"));
    }
    @PutMapping("/update")
    public void loginUpdate(@RequestBody LoginDTO loginDTO) {
        loginService.loginUpdate(loginDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void loginDelete(@PathVariable Long id) {
        loginService.loginDelete(id);
    }
    @GetMapping("/SearchById/{id}")
    public LoginDTO getUserById(@PathVariable Long id) {
        return loginService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<LoginDTO> getAllUsers() {
        return loginService.getAllUsers();
    }

}
