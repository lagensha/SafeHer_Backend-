package org.government.Authentication.Service;

import org.government.Authentication.DTO.registerDTO;

import java.util.List;

public interface register_Impl {
        void registerUser(registerDTO registerDTO);
        void registerAdmin(registerDTO registerDTO);
        void deleteUser(String username);
        registerDTO getUserById(String username);
        List<registerDTO> getAllUsers();

}
