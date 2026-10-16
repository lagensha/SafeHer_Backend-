package org.government.Authentication.Service.Impl;

import org.government.Authentication.DTO.loginDTO;
import org.government.Authentication.Repository.login_Repository;
import org.government.Authentication.Service.login_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class loginService implements login_Impl {
    @Autowired
    private login_Repository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean loginUser(loginDTO loginDTO) {
        return false;
    }
}
