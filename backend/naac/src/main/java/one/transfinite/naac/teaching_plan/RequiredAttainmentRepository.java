package one.transfinite.naac.teaching_plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequiredAttainmentRepository extends JpaRepository<RequiredAttainment, Long> {
}
