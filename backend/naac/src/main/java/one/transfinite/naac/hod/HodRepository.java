package one.transfinite.naac.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HodRepository extends JpaRepository<Hod, Long> {
}
