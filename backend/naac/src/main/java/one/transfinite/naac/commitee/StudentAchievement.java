package one.transfinite.naac.commitee;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student_achievement")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentAchievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private YearDetail yearDetail;

    private String nameOfStudent;

    private String awardingAgency;

    private String achievementNature;

    @Enumerated(EnumType.STRING)
    private AchievementLevel achievementLevel;

    private String studentCertificate;  //document
}