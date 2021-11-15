package one.transfinite.naac.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherAppointmentRepository extends JpaRepository<TeacherAppointment, Long> {
}
