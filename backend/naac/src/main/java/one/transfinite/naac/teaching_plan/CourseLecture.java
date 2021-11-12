package one.transfinite.naac.teaching_plan;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course_lecture")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseLecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TeachingPlan teachingPlan;

    private Date month;     /// Need to verify type of field

    private Long week;

    private Long noOfLectures;

    private Long nofOfTutorials;

    private String topic;

    private String assignment;

    private String modeOfTeaching;
}