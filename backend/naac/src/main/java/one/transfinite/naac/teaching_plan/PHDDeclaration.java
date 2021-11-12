package one.transfinite.naac.teaching_plan;

import lombok.*;
import one.transfinite.naac.student.Student;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "phd_declaration")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class PHDDeclaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_student_id")
    private Student student;

    private String title;

    private Date registrationDate;

    private Date dateOfDeclaration;

    private String researchCentre;

    private String certificate;
}