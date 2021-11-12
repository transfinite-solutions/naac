package one.transfinite.naac.office;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roll_call")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class RollCall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private StudentData studentData;

    private String rcClass;

    private String division;

    private String subject;

    private String rollCallList;
}