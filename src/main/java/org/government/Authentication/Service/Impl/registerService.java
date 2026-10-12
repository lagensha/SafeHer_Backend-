package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Entity.registerEntity;
import org.government.Authentication.Repository.register_Repository;
import org.government.Authentication.Service.register_Impl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class registerService implements register_Impl {
         final register_Repository registerRepository;
         final ModelMapper modelMapper;

    @Override
    public void registerUser(registerDTO registerDTO) {
        registerEntity registerEntity = modelMapper.map(registerDTO, registerEntity.class);
        registerRepository.save(registerEntity);
    }

    @Override
    public void registerUpdate(registerDTO registerDTO) {
        registerEntity registerEntity = modelMapper.map(registerDTO, registerEntity.class);
        registerRepository.save(registerEntity);
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
