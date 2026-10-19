package org.government.Authentication.Service;

import org.government.Authentication.DTO.loginDTO;
import org.government.Authentication.DTO.registerDTO;

import java.util.List;

public interface login_Impl {
    boolean loginUser(loginDTO loginDTO);
    void loginUpdate(loginDTO loginDTO);
    void loginDelete(String email);
    void getLoginUser(loginDTO loginDTO);
    loginDTO getUserByEmail(String email);
    List<loginDTO> getAllUsers();

    }
