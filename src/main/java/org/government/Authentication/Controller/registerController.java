package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Repository.register_Repository;
import org.government.Authentication.Service.Impl.registerService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/register")
public class registerController  {

    final registerService registerService;
    private final register_Repository register_Repository;
    private final ModelMapper modelMapper;

    @PostMapping("/register")
    public void registerUser(@RequestBody registerDTO registerDTO) {

        registerService.registerUser(registerDTO);
    }

    @PutMapping("/update")
    public void registerUpdate(@RequestBody registerDTO registerDTO) {

        registerService.registerUpdate(registerDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {

        registerService.deleteUser(id);
    }

    @GetMapping("/SearchById/{id}")
    public registerDTO getUserById(@PathVariable Long id) {
        return registerService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<registerDTO> getAllUsers() {

        return registerService.getAllUsers();
    }
}
