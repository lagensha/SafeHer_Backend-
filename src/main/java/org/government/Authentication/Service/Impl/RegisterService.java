package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.RegisterDTO;
import org.government.Authentication.Entity.RegisterEntity;
import org.government.Authentication.Repository.Register_Repository;
import org.government.Authentication.Service.Register_Impl;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class RegisterService implements Register_Impl {
         final Register_Repository registerRepository;
         final ModelMapper modelMapper;
    final private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(RegisterDTO registerDTO) {
        RegisterEntity registerEntity = new RegisterEntity();
        registerEntity.setName(registerDTO.getName());
        registerEntity.setEmail(registerDTO.getEmail());
        registerEntity.setPhoneNumber(registerDTO.getPhoneNumber());
        registerEntity.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        registerRepository.save(registerEntity);
    }

    @Override
    public void registerUpdate(RegisterDTO registerDTO) {
        RegisterEntity registerEntity = modelMapper.map(registerDTO, RegisterEntity.class);
        registerRepository.save(registerEntity);
    }

    @Override
    public void deleteUser(Long id) {
        registerRepository.deleteById(id);
    }

    @Override
    public RegisterDTO getUserById(Long id) {
        if (!registerRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        RegisterEntity registerEntity=registerRepository.findById(id).get();
        RegisterDTO registerDTO=modelMapper.map(registerEntity, RegisterDTO.class);
        return registerDTO;
    }

    @Override
    public List<RegisterDTO> getAllUsers() {
        List<RegisterEntity>registerEntities=registerRepository.findAll();
        ArrayList<RegisterDTO> registerDTOS=new ArrayList<>();
        registerEntities.forEach(registerEntity -> {
            RegisterDTO registerDTO=modelMapper.map(registerEntity, RegisterDTO.class);
            registerDTOS.add(registerDTO);
        });
        return registerDTOS;
    }
}
