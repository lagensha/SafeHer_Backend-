package org.government.Authentication.Repository;

import org.government.Authentication.Entity.registerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface register_Repository extends JpaRepository<registerEntity, Integer> {
}
