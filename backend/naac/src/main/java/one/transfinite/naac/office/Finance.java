package one.transfinite.naac.office;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "finance")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Finance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String financialYear;

    private String budget;      //document

    private Long expenditureWithSalary;

    private Long expenditureWithoutSalary;

    private String auditReport;     //document

    private Long physicalFacilityBudget;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "finance")
    @Fetch(FetchMode.SUBSELECT)
    private List<Expenditure> physicalFacilityExpenditure;

    private Long academicFacilityBudget;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "finance")
    @Fetch(FetchMode.SUBSELECT)
    private List<Expenditure> academicFacilityExpenditure;

    private Long libraryFacilityBudget;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "finance")
    @Fetch(FetchMode.SUBSELECT)
    private List<Expenditure> libraryFacilityExpenditure;

    private Long MaintenanceFacilityBudget;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "finance", cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<MaintenanceExpenditure> maintenanceExpenditure;
}
