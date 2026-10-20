package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.Admin_LoginDTO;
import org.government.Authentication.Entity.Admin_LoginEntity;
import org.government.Authentication.Repository.Admin_Login_Repository;
import org.government.Authentication.Service.Admin_Login_impl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class Admin_LoginService implements Admin_Login_impl {
    private final Admin_Login_Repository admin_login_repository;
    private final ModelMapper modelMapper;


    @Override
    public void adminLogin(Admin_LoginDTO admin_loginDTO) {
      Admin_LoginEntity adminLoginEntity = modelMapper.map(admin_loginDTO, Admin_LoginEntity.class);
      String email= adminLoginEntity.getEmail();
      if(email== null || !email.trim().toLowerCase().startsWith("admin")){
            throw new RuntimeException("Invalid email address. Only admin emails are allowed.");
      }
      admin_login_repository.save(adminLoginEntity);
    }

    @Override
    public void deleteAdminLogin(Long id) {
        admin_login_repository.deleteById(id);
    }

    @Override
    public Admin_LoginDTO getAdminLogin(Long id) {
        Admin_LoginEntity adminLoginEntity= admin_login_repository.findById(id).get();
        Admin_LoginDTO adminLoginDTO=modelMapper.map(adminLoginEntity,Admin_LoginDTO.class);
        return adminLoginDTO;
    }

    @Override
    public List<Admin_LoginDTO> getAllAdminLogins() {
        List<Admin_LoginEntity>adminLoginEntities=admin_login_repository.findAll();
        ArrayList<Admin_LoginDTO>adminLoginDTOS=new ArrayList<>();
        adminLoginEntities.forEach(adminLoginEntity -> {
            Admin_LoginDTO adminLoginDTO = modelMapper.map(adminLoginEntity, Admin_LoginDTO.class);
            adminLoginDTOS.add(adminLoginDTO);
        });
        return adminLoginDTOS;
    }
}
