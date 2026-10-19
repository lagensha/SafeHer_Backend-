package org.government.Authentication.Service;

import org.government.Authentication.DTO.LoginDTO;

import java.util.List;

public interface Login_Impl {
    boolean loginUser(LoginDTO loginDTO);
    void loginUpdate(LoginDTO loginDTO);
    void loginDelete(String id);
    void getLoginUser(LoginDTO loginDTO);
    LoginDTO getUserByEmail(String email);
    List<LoginDTO> getAllUsers();

    }
