package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "teacher_approval")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeacherApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "Approval date is required")
    @Column(nullable = false)
    private Date approvalDate;

    @NotNull(message = "Letter number is required")
    @Column(nullable = false)
    private String letterNumber;

    @NotNull(message = "Appointment type is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentType approvalType;

    @NotNull(message = "Designation is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Designation designation;

    private String document;
}
