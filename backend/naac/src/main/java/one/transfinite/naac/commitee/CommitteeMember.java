package one.transfinite.naac.commitee;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "committee_member")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class CommitteeMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @ToString.Exclude
//    private YearDetail yearDetail;

    private String memberName;

    @Enumerated(EnumType.STRING)
    private CommitteeMemberRole committeeMemberRole;

    private String mobileNo;

    private String emailId;
}