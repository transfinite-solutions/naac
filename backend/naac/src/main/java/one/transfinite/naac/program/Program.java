package one.transfinite.naac.program;

import lombok.*;
import one.transfinite.naac.course.Course;
import one.transfinite.naac.student.AdmittedStudent;
import one.transfinite.naac.department.Department;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "program")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long programId;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Department department;

    private String programType;

    private String programName;

    private String programCode;

    private String startYear;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "program")
    @Fetch(FetchMode.SUBSELECT)
    private List<Course> courses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "program")
    @Fetch(FetchMode.SUBSELECT)
    private List<AdmittedStudent> admittedStudents;
}