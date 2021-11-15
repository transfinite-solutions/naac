package one.transfinite.naac.office;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceExpenditureRepository extends JpaRepository<MaintenanceExpenditure, Long> {
}
