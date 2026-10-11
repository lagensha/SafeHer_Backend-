package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Service.Impl.registerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/register")
public class registerController  {

    final registerService registerService;

    @PostMapping("/register")
    public void registerUser(registerDTO registerDTO) {
        registerService.registerUser(registerDTO);
    }


    public void registerAdmin(registerDTO registerDTO) {

    }


    public void deleteUser(String username) {

    }


    public registerDTO getUserById(String username) {
        return null;
    }


    public List<registerDTO> getAllUsers() {
        return List.of();
    }
}
