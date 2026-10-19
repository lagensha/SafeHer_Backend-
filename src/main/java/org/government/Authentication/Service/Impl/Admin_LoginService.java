package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.Admin_LoginDTO;
import org.government.Authentication.Entity.Admin_LoginEntity;
import org.government.Authentication.Repository.Admin_Login_Repository;
import org.government.Authentication.Service.Admin_Login_impl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;

@RequiredArgsConstructor
@Service
public class Admin_LoginService implements Admin_Login_impl {
    private final Admin_Login_Repository admin_login_repository;
    private final ModelMapper modelMapper;


    @Override
    public void adminLogin(Admin_LoginDTO admin_loginDTO) {
        Admin_LoginEntity adminLoginEntity = modelMapper.map(admin_loginDTO, Admin_LoginEntity.class);
        admin_login_repository.save(adminLoginEntity);
    }

    @Override
    public void deleteAdminLogin(Long id) {

    }

    @Override
    public Admin_LoginDTO getAdminLogin(Long id) {
        return null;
    }

    @Override
    public List<Admin_LoginDTO> getAllAdminLogins() {
        return List.of();
    }
}
