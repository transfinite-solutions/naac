package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.department.Course;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendance_record")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class AttendanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String attendClass;

    private String division;

    @OneToOne
    @JoinColumn(name = "course_program_id")
    private Course course;

    private Date month;     /// Need to verify type of field

    private String attendance;      //document
}
