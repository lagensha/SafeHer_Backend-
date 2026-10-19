package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.LoginDTO;
import org.government.Authentication.Entity.LoginEntity;
import org.government.Authentication.Entity.RegisterEntity;
import org.government.Authentication.Repository.Login_Repository;
import org.government.Authentication.Repository.Register_Repository;
import org.government.Authentication.Service.Login_Impl;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class LoginService implements Login_Impl {
    private final Register_Repository registerRepository;
    private final Login_Repository loginRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean loginUser(LoginDTO loginDTO) {
        LoginEntity log = new LoginEntity();
        log.setEmail(loginDTO.getEmail());
        log.setUsername(loginDTO.getUsername());
        loginRepository.save(log);
        RegisterEntity user = registerRepository.findByEmail(loginDTO.getEmail().trim())
                .orElse(null);

        return user != null
                && passwordEncoder.matches(loginDTO.getPassword(), user.getPassword());

    }

    @Override
    public void loginUpdate(LoginDTO loginDTO) {
        LoginEntity loginEntity = modelMapper.map(loginDTO, LoginEntity.class);
        loginRepository.save(loginEntity);
             }

    @Override
    public void loginDelete(Long id) {
        loginRepository.deleteById(id);
    }

    @Override
    public LoginDTO getUserById(Long id) {
     LoginEntity loginEntity = loginRepository.findById(id).get();
     LoginDTO loginDTO=modelMapper.map(loginEntity,LoginDTO.class);
     return loginDTO;
    }

    @Override
    public List<LoginDTO> getAllUsers() {
       List<LoginEntity>loginEntities=loginRepository.findAll();
        ArrayList<LoginDTO>loginDTOS=new ArrayList<>();
        loginEntities.forEach(loginEntity -> {
            LoginDTO loginDTO=modelMapper.map(loginEntity,LoginDTO.class);
            loginDTOS.add(loginDTO);
        });
        return loginDTOS;
    }

}
