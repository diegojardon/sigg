package mx.gluo.management.userservices.repository;

import mx.gluo.management.userservices.entity.SiggUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<SiggUser, Long> {

    @Query("SELECT u FROM #{#entityName} u WHERE u.username = :username")
    SiggUser findByUsername(@Param("username") String username);

    @Query(value = "SELECT U.* FROM USER_PROJECT UP INNER JOIN USER U ON UP.userId = U.id WHERE UP.userId = :id", nativeQuery = true)
    List<SiggUser> findUsersByProject(@Param("id") Long id);
}
