package one.transfinite.naac.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherApprovalRepository extends JpaRepository<TeacherApproval, Long> {
}
