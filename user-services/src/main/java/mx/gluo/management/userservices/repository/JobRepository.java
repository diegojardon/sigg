package mx.gluo.management.userservices.repository;

import mx.gluo.management.userservices.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
