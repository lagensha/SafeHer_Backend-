package org.government.Authentication.Repository;

import org.government.Authentication.Entity.registerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface register_Repository extends JpaRepository<registerEntity, Long> {

    Optional<registerEntity> findByEmail(String email);
}
