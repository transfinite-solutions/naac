package one.transfinite.naac.office;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "expenditure")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Expenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Finance finance;

    private String item;

    private Long amount;
}