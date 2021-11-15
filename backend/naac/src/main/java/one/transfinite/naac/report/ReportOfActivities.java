package one.transfinite.naac.report;

import lombok.*;
import one.transfinite.naac.commitee.YearDetail;
import one.transfinite.naac.document.NewsReport;
import one.transfinite.naac.document.Participants;
import one.transfinite.naac.document.Photograph;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "report_of_activities")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ReportOfActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private YearDetail yearDetail;

    private String titleOfActivity;

    private Date fromDate;

    private Date toDate;

    private Long noOfTeachers;

    private Long noOfStudent;

    private String reportBrief;

    private String supportingAgency;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<Photograph> photographs;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<NewsReport> newsReports;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<Participants> listOfParticipants; //document
}