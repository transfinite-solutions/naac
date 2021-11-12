package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.department.Course;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "project_work")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ProjectWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pwClass;

    private String division;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "projectWork")
    private List<StudentProject> studentProjects;
}
