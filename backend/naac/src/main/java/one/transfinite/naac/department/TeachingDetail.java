package one.transfinite.naac.department;

import lombok.*;
import one.transfinite.naac.teacher.Teacher;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeachingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    @OneToOne
    @JoinColumn(name = "teacher_teacher_id")
    private Teacher teacher;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Course> courses;

    @Enumerated(EnumType.STRING)
    private CourseType courseType;
}
