package one.transfinite.naac.report;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportOfSchoolRepository extends JpaRepository<ReportOfSchool, Long> {
}