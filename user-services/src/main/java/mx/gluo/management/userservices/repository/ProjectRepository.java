package mx.gluo.management.userservices.repository;

import mx.gluo.management.userservices.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query(value = "SELECT P.* FROM USER_PROJECT UP INNER JOIN PROJECT P ON UP.projectId = P.id WHERE UP.userId = :id", nativeQuery = true)
    List<Project> findProjectsByUserId(@Param("id") Long id);
}
