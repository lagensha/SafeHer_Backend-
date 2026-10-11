package org.government.Authentication.Resitory;

import org.government.Authentication.Entity.registerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface register extends JpaRepository<registerEntity, Integer> {
}
