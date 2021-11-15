package one.transfinite.naac.department;

import lombok.*;
import one.transfinite.naac.program.Program;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String departmentName;

    private String establishmentYear;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
    private List<Program> programs;
}
