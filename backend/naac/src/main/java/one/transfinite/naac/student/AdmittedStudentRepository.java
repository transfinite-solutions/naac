package one.transfinite.naac.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmittedStudentRepository extends JpaRepository<AdmittedStudent, Long> {
}