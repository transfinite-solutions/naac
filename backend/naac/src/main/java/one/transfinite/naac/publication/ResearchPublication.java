package one.transfinite.naac.publication;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "research_publication")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ResearchPublication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    @Enumerated(EnumType.STRING)
    private ResearchPublicationType researchPublicationType;

    private String titleOfPaper;

    private String author;

    private String journalName;

    private String volume;

    private String issue;

    private String pageNo;

    private String year;

    private String issnNo;

    private Boolean approvedByUGS;

    private String role;

    private String linkOfResearchPaper;
}
