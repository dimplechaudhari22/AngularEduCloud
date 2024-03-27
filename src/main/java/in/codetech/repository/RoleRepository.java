package in.codetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.codetech.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
