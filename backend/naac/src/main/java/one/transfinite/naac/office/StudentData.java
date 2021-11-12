package one.transfinite.naac.office;

import lombok.*;
import one.transfinite.naac.user.User;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_data")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<User> studentList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "studentData", cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<RollCall> roleCallList;
}
