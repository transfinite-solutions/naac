package one.transfinite.naac.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsReportRepository extends JpaRepository<NewsReport, Long> {
}
