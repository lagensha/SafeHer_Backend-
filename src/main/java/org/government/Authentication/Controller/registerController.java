package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Service.Impl.registerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/register")
public class registerController  {

    final registerService registerService;

    @PostMapping("/register")
    public void registerUser(@RequestBody registerDTO registerDTO) {
        registerService.registerUser(registerDTO);
    }

    @PutMapping("/update")
    public void registerUpdate(registerDTO registerDTO) {
        registerService.registerUpdate(registerDTO);
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
