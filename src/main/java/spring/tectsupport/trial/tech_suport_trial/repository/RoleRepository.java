package spring.tectsupport.trial.tech_suport_trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.tectsupport.trial.tech_suport_trial.entity.ERole;
import spring.tectsupport.trial.tech_suport_trial.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}