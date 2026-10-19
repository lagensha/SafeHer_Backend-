package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.RegisterDTO;
import org.government.Authentication.Repository.Register_Repository;
import org.government.Authentication.Service.Impl.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/register")
public class RegisterController {

    final RegisterService registerService;
    private final Register_Repository register_Repository;
    private final ModelMapper modelMapper;

    @PostMapping("/register")
    public void registerUser(@RequestBody RegisterDTO registerDTO) {

        registerService.registerUser(registerDTO);
    }

    @PutMapping("/update")
    public void registerUpdate(@RequestBody RegisterDTO registerDTO) {

        registerService.registerUpdate(registerDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {

        registerService.deleteUser(id);
    }

    @GetMapping("/SearchById/{id}")
    public RegisterDTO getUserById(@PathVariable Long id) {
        return registerService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<RegisterDTO> getAllUsers() {

        return registerService.getAllUsers();
    }
}
