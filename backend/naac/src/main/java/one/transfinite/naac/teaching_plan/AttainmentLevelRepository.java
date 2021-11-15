package one.transfinite.naac.teaching_plan;

import one.transfinite.naac.teaching_plan.AttainmentLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttainmentLevelRepository extends JpaRepository<AttainmentLevel, Long> {
}