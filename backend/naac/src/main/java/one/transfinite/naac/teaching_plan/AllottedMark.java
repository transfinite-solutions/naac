package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.department.Course;

import javax.persistence.*;

@Entity
@Table(name = "allotted_mark")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AllottedMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_course_mapping_id")
    private StudentCourseMapping studentCourseMapping;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    private Long mark;
}