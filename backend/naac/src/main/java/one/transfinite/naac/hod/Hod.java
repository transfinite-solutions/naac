package one.transfinite.naac.hod;

import lombok.*;
import one.transfinite.naac.qualification.EntranceQualification;
import one.transfinite.naac.qualification.PGQualification;
import one.transfinite.naac.qualification.ResearchQualification;
import one.transfinite.naac.qualification.UGQualification;
import one.transfinite.naac.teacher.*;
import one.transfinite.naac.user.User;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "hod")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Hod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

    @NotBlank(message = "Aadhar card detail required")
    @Column(nullable = false)
    private String aadharNumber;

    @Column(nullable = false)
    private String aadharDocument;      //document

    @NotBlank(message = "Pan card detail required")
    @Column(nullable = false)
    private String panNumber;

    @Column(nullable = false)
    private String panDocument;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UGQualification ugQualification;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PGQualification pgQualification;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EntranceQualification entranceQualification;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ResearchQualification researchQualification;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<TeacherAppointment> teacherAppointments;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<TeacherApproval> teacherApprovals;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<TeacherTransfer> teacherTransfers;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<PaperPresented> paperPresentedList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ResearchPublication> researchPublications;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<BookPublication> bookPublications;
}