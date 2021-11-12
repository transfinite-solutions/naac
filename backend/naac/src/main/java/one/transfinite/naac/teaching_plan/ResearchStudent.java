package one.transfinite.naac.teaching_plan;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "research_student")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ResearchStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String academicYear;

    @OneToOne
    @JoinColumn(name = "phd_registered_student_ID")
    private PHDRegisteredStudent phdRegisteredStudent;

    @OneToOne
    @JoinColumn(name = "phd_declaration_ID")
    private PHDDeclaration phdDeclaration;
}
