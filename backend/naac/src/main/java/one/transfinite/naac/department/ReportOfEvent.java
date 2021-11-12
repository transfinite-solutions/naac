package one.transfinite.naac.department;

import lombok.*;
import one.transfinite.naac.document.NewsReport;
import one.transfinite.naac.document.Participants;
import one.transfinite.naac.document.Photograph;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ReportOfEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Date fromDate;

    private Date toDate;

    private Long noOfTeacher;

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
