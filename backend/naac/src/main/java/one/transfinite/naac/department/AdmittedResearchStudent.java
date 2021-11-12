package one.transfinite.naac.department;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "admitted_research_student")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AdmittedResearchStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ResearchProgram researchProgram;

    private String category;

    @OneToOne
    @JoinColumn(name = "guide_id")
    private Guide guide;

    private Date registrationDate;

    private String topicTitle;

    private Date declarationDate;

    private String document;
}