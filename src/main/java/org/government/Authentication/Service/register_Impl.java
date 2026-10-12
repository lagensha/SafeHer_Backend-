package org.government.Authentication.Service;

import org.government.Authentication.DTO.registerDTO;

import java.util.List;

public interface register_Impl {
        void registerUser(registerDTO registerDTO);
        void registerUpdate(registerDTO registerDTO);
        void deleteUser(Long id);
        registerDTO getUserById(Long id);
        List<registerDTO> getAllUsers();

}
