package one.transfinite.naac.commitee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearDetailRepository extends JpaRepository<YearDetail, Long> {
}
