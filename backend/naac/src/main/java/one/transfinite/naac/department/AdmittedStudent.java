package one.transfinite.naac.department;

import lombok.*;
import one.transfinite.naac.user.User;

import javax.persistence.*;

@Entity
@Table(name = "admitted_student")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AdmittedStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Program program;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

    private String studentClass;

    private String category;
}