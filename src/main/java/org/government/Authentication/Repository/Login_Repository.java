package org.government.Authentication.Repository;

import org.government.Authentication.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Login_Repository extends JpaRepository<LoginEntity, String> {

    Optional<LoginEntity> findByEmail(String email);
}
