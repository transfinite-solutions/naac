package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_course_mapping")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentCourseMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private InternalAssessment internalAssessment;

    @OneToOne
    @JoinColumn(name = "student_student_id")
    private Student student;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "studentCourseMapping")
    private List<AllottedMark> allottedMarks;
}