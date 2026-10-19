package org.government.Authentication.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.registerDTO;
import org.government.Authentication.Entity.registerEntity;
import org.government.Authentication.Repository.register_Repository;
import org.government.Authentication.Service.register_Impl;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class registerService implements register_Impl {
         final register_Repository registerRepository;
         final ModelMapper modelMapper;
    final private PasswordEncoder passwordEncoder;

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
    public void deleteUser(Long id) {
        registerRepository.deleteById(id);
    }

    @Override
    public registerDTO getUserById(Long id) {
        if (!registerRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        registerEntity registerEntity=registerRepository.findById(id).get();
        registerDTO registerDTO=modelMapper.map(registerEntity,registerDTO.class);
        return registerDTO;
    }

    @Override
    public List<registerDTO> getAllUsers() {
        List<registerEntity>registerEntities=registerRepository.findAll();
        ArrayList<registerDTO> registerDTOS=new ArrayList<>();
        registerEntities.forEach(registerEntity -> {
            registerDTO registerDTO=modelMapper.map(registerEntity,registerDTO.class);
            registerDTOS.add(registerDTO);
        });
        return registerDTOS;
    }

     public void Register(registerDTO registerDTO){
         registerEntity registerEntity = new registerEntity();
         registerEntity.setName(registerDTO.getName());
         registerEntity.setEmail(registerDTO.getEmail());
            registerEntity.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
            registerRepository.save(registerEntity);
     }
}
