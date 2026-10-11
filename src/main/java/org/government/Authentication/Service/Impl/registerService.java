package org.government.Authentication.Service.Impl;

import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Service.register_Impl;

import java.util.List;

public class registerService implements register_Impl {


    @Override
    public void registerUser(registerDTO registerDTO) {

    }

    @Override
    public void registerAdmin(registerDTO registerDTO) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public registerDTO getUserById(String username) {
        return null;
    }

    @Override
    public List<registerDTO> getAllUsers() {
        return List.of();
    }
}
