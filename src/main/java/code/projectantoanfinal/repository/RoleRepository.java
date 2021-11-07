package code.projectantoanfinal.repository;

import code.projectantoanfinal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.projectantoanfinal.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
