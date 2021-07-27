package mx.gluo.management.userservices.repository;

import mx.gluo.management.userservices.entity.SiggUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SiggUser, Long> {

    @Query("SELECT u FROM #{#entityName} u WHERE u.username = :username")
    SiggUser findByUsername(@Param("username") String username);
}
