package one.transfinite.naac.qualification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UGQualificationRepository extends JpaRepository<UGQualification, Long> {
}