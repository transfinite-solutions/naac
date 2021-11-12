package one.transfinite.naac.office;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "scholarship")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    private String scholarshipScheme;

    private String awardingAgency;

    private Long noOfStudent;

    private Long amount;

    private String sanctionLetter;      //document

    private String studentList;     //document

    private String otherDetail = null;
}
