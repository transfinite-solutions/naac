package one.transfinite.naac.commitee;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "academic_calender")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AcademicCalender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @ToString.Exclude
//    private YearDetail yearDetail;

    private String titleOfActivity;

    private Date proposedDate;
}