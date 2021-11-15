package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.course.Course;

import javax.persistence.*;

@Entity
@Table(name = "required_attainment")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class RequiredAttainment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private InternalAssessment internalAssessment;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    @OneToOne
    @JoinColumn(name = "attainment_level_id")
    private AttainmentLevel attainmentLevel;
}