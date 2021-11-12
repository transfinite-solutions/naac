package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.user.User;

import javax.persistence.*;

@Entity
@Table(name = "student_project")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProjectWork projectWork;

    private Long rollNumber;

    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;

    private String projectTitle;

    private String certificate;
}