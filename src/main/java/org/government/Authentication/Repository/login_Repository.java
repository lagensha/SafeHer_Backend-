package org.government.Authentication.Repository;

import org.government.Authentication.Entity.loginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface login_Repository extends JpaRepository<loginEntity, String> {
    @Override
    Optional<loginEntity> findById(String email);
}
