package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "faculty_program")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class FacultyProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "Academic Year is required")
    @Column(nullable = false)
    private String academicYear;

    @Enumerated(EnumType.STRING)
    private FacultyProgramType facultyProgramType;

    private String titleOfCourse;

    private String placeOfCourse;

    private Date startDate;

    private Date endDate;

    private String document;
}
