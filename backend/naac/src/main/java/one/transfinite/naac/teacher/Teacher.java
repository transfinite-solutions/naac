package one.transfinite.naac.teacher;

import lombok.*;
import one.transfinite.naac.program.FacultyProgram;
import one.transfinite.naac.program.FacultySeminar;
import one.transfinite.naac.publication.BookPublication;
import one.transfinite.naac.publication.PaperPresented;
import one.transfinite.naac.publication.ResearchPublication;
import one.transfinite.naac.qualification.EntranceQualification;
import one.transfinite.naac.qualification.PGQualification;
import one.transfinite.naac.qualification.ResearchQualification;
import one.transfinite.naac.qualification.UGQualification;
import one.transfinite.naac.user.User;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", nullable = false)
    private Long teacherId;

    @JoinColumn(name = "fk_user_id")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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
    private List<FacultyProgram> facultyPrograms;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<FacultySeminar> facultySeminars;

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