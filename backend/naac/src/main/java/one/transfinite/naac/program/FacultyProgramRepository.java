package one.transfinite.naac.program;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyProgramRepository extends JpaRepository<FacultyProgram, Long> {
}