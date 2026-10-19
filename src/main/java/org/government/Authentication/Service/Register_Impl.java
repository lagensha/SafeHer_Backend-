package org.government.Authentication.Service;

import org.government.Authentication.DTO.RegisterDTO;

import java.util.List;

public interface Register_Impl {
        void registerUser(RegisterDTO registerDTO);
        void registerUpdate(RegisterDTO registerDTO);
        void deleteUser(Long id);
        RegisterDTO getUserById(Long id);
        List<RegisterDTO> getAllUsers();

}
