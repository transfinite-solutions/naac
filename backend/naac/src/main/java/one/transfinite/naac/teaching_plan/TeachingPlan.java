package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.department.Course;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teaching_plan")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeachingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String academicYear;

    private String semester;

    private String tpClass;

    private String division;

    @OneToOne
    @JoinColumn(name = "fk_course_id")
    private Course course;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<CourseLecture> courseLecture;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TeachingOutcome> teachingOutcomes;
}
