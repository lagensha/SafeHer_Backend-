package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.Admin_LoginDTO;
import org.government.Authentication.Service.Impl.Admin_LoginService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/v1/adminLogin")
@RestController
public class Admin_LoginController  {
     final private Admin_LoginService admin_loginService;

     @PostMapping("/adminLogin")
    public void adminLogin(@PathVariable Admin_LoginDTO admin_loginDTO) {
        admin_loginService.adminLogin(admin_loginDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdminLogin(@PathVariable Long id) {

    }

    @GetMapping("/SearchById/{id}")
    public Admin_LoginDTO getAdminLogin(@PathVariable Long id) {
        return admin_loginService.getAdminLogin(id);
    }

    @GetMapping("/getAll")
    public List<Admin_LoginDTO> getAllAdminLogins() {
         return admin_loginService.getAllAdminLogins();
    }
}
