package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.loginDTO;
import org.government.Authentication.Entity.loginEntity;
import org.government.Authentication.Repository.login_Repository;
import org.government.Authentication.Service.login_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class loginService implements login_Impl {
    @Autowired
    private login_Repository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean loginUser(loginDTO loginDTO) {
        loginEntity user = loginRepository.findByEmail(loginDTO.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found with email: " + loginDTO.getEmail()));
         if (!passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())){
            throw new RuntimeException("Invalid password");
         }
         return true;
    }
}
