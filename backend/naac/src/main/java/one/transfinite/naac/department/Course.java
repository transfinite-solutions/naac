package one.transfinite.naac.department;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long programId;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Program program;

    private String year;

    private String semester;

    private String code;

    private String name;

    private String yoi;

    private Boolean elective;

    private Boolean cbcs;
}