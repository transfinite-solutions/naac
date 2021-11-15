package one.transfinite.naac.commitee;

import one.transfinite.naac.commitee.AcademicCalender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicCalenderRepository extends JpaRepository<AcademicCalender, Long> {
}