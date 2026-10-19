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
        RegisterEntity user = registerRepository.findByEmail(loginDTO.getEmail().trim())
                .orElse(null);

        return user != null
                && passwordEncoder.matches(loginDTO.getPassword(), user.getPassword());
    }

    @Override
    public void loginUpdate(LoginDTO loginDTO) {
        LoginEntity loginEntity=modelMapper.map(loginDTO,LoginEntity.class);
        loginRepository.save(loginEntity);

     }

    @Override
    public void loginDelete(String id) {
        loginRepository.deleteById(id);
    }

    @Override
    public void getLoginUser(LoginDTO loginDTO) {
        LoginEntity loginEntity = modelMapper.map(loginDTO, LoginEntity.class);
        loginEntity.setUsername(loginDTO.getUsername());
        loginEntity.setPassword(loginDTO.getPassword());
        loginEntity.setEmail(loginDTO.getEmail());
        loginRepository.save(loginEntity);

    }

    @Override
    public LoginDTO getUserByEmail(String email) {

        return null;
    }

    @Override
    public List<LoginDTO> getAllUsers() {
        return List.of();
    }

}
