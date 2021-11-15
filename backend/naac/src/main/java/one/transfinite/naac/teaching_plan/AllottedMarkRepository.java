package one.transfinite.naac.teaching_plan;

import one.transfinite.naac.teaching_plan.AllottedMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllottedMarkRepository extends JpaRepository<AllottedMark, Long> {
}