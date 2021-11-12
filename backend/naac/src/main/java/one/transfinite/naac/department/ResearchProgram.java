package one.transfinite.naac.department;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "research_program")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ResearchProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String programType;

    private String programName;

    private String programYear;

    private String programClass;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "researchProgram")
    private List<AdmittedResearchStudent> admittedResearchStudents;
}
