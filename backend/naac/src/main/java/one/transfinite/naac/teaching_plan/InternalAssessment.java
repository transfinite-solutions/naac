package one.transfinite.naac.teaching_plan;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "internal_assessment")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class InternalAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "teaching_plan_id")
    private TeachingPlan teachingPlan;

    private String internalTest;

    private String testType;

    private Long totalMarks;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<DistributedMark> distributedMarks;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<StudentCourseMapping> studentCourseMappings;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<AttainmentLevel> attainmentsLevels;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<RequiredAttainment> requiredAttainment;
}
