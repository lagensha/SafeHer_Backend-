package org.government.Authentication.Repository;

import org.government.Authentication.Entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Register_Repository extends JpaRepository<RegisterEntity, Long> {

    Optional<RegisterEntity> findByEmail(String email);
}
