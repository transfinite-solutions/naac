package one.transfinite.naac.commitee;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "committee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Committee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String name;

    private Date createdAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "committee")
    @Fetch(FetchMode.SUBSELECT)
    private List<YearDetail> yearDetails;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "committee")
    @Fetch(FetchMode.SUBSELECT)
    private List<Achievement> achievements;
}
