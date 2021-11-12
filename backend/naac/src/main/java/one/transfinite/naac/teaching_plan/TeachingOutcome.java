package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.department.Course;
import one.transfinite.naac.department.Program;

import javax.persistence.*;

@Entity
@Table(name = "teaching_outcome")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeachingOutcome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teaching_plan_id")
    private TeachingPlan teachingPlan;

    @OneToOne
    @JoinColumn(name = "program_program_id")
    private Program program;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    private Long correlationValue;
}