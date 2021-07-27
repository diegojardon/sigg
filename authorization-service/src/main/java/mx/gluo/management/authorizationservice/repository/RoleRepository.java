package mx.gluo.management.authorizationservice.repository;

import mx.gluo.management.authorizationservice.entity.SiggRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<SiggRole, Long> {

    @Query(value = "SELECT R.* FROM USER_ROLE UR INNER JOIN ROLE R ON UR.roleId = R.id WHERE UR.userId = :id", nativeQuery = true)
    List<SiggRole> findUserRoles(@Param("id") Long id);

}
