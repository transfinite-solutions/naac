package one.transfinite.naac.commitee;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "achievement")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Committee committee;

    private String year;

    private String nameOfAward;

    private String awardingAgency;

    @Enumerated(EnumType.STRING)
    private AchievementLevel achievementLevel;

    private String achievementCertificate;
}