package org.government.Authentication.Service;

import org.government.Authentication.DTO.Admin_LoginDTO;

import java.util.List;

public interface Admin_Login_impl {
    void adminLogin(Admin_LoginDTO admin_loginDTO);
    void deleteAdminLogin(Long id);
    Admin_LoginDTO getAdminLogin(Long id);
    List<Admin_LoginDTO> getAllAdminLogins();
}
