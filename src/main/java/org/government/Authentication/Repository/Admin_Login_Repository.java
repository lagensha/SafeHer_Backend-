package org.government.Authentication.Repository;

import org.government.Authentication.Entity.Admin_LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Admin_Login_Repository extends JpaRepository<Admin_LoginEntity, Long> {
}
