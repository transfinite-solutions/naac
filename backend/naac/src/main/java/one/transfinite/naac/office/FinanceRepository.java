package one.transfinite.naac.office;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {
}
