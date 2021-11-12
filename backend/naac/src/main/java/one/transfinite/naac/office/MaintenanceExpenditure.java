package one.transfinite.naac.office;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "maintenance_expenditure")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class MaintenanceExpenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Finance finance;

    private String item;

    private Long amount;

    private String Facility;
}