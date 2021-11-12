package one.transfinite.naac.teaching_plan;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "attainment_level")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AttainmentLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private InternalAssessment internalAssessment;

    private Long level;

    private Double startRange;

    private Double endRange;
}