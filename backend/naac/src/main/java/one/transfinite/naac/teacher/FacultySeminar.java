package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "faculty_program")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class FacultySeminar {

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

    private String place;

    private Date startDate;

    private Date endDate;

    private String role;    // need to confirm for type is enum or string

    private String document;
}
