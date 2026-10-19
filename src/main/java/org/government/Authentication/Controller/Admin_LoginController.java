package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.Admin_LoginDTO;
import org.government.Authentication.Service.Impl.Admin_LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/v1/adminLogin")
@RestController
public class Admin_LoginController  {
     final private Admin_LoginService admin_loginService;

     @PostMapping("/adminLogin")
    public void adminLogin(Admin_LoginDTO admin_loginDTO) {
        admin_loginService.adminLogin(admin_loginDTO);
    }


    public void deleteAdminLogin(Long id) {

    }


    public Admin_LoginDTO getAdminLogin(Long id) {
        return null;
    }


    public List<Admin_LoginDTO> getAllAdminLogins() {
        return List.of();
    }
}
