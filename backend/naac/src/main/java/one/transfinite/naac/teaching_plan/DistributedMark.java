package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.course.Course;

import javax.persistence.*;

@Entity
@Table(name = "distributed_mark")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class DistributedMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ToString.Exclude
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private InternalAssessment internalAssessment;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    private Long totalMark;
}