package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.loginDTO;
import org.government.Authentication.Entity.registerEntity;
import org.government.Authentication.Repository.register_Repository;
import org.government.Authentication.Service.login_Impl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class loginService implements login_Impl {
    private final register_Repository registerRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean loginUser(loginDTO loginDTO) {
        registerEntity user = registerRepository.findByEmail(loginDTO.getEmail().trim())
                .orElse(null);

        return user != null
                && passwordEncoder.matches(loginDTO.getPassword(), user.getPassword());
    }

    @Override
    public void loginUpdate(loginDTO loginDTO) {

    }

    @Override
    public void loginDelete(String email) {

    }

    @Override
    public void getLoginUser(loginDTO loginDTO) {

    }

    @Override
    public loginDTO getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<loginDTO> getAllUsers() {
        return List.of();
    }

}
