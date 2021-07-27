package mx.gluo.management.authorizationservice.repository;

import mx.gluo.management.authorizationservice.entity.SiggUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SiggUser, Long> {

    @Query("SELECT U FROM #{#entityName} U WHERE U.username = :username AND U.password = :password")
    SiggUser findByUserAndPassword(@Param("username") String username, @Param("password") String password);

}
