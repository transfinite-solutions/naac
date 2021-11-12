package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paper_presented")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class PaperPresented {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    @Enumerated(EnumType.STRING)
    private FacultySeminarLevel facultySeminarLevel;

    @Enumerated(EnumType.STRING)
    private FacultySeminarType facultySeminarType;

    private String title;

    private String titleOfPaper;

    private Date startDate;

    private Date endDate;

    private String role;

    private String document;
}
