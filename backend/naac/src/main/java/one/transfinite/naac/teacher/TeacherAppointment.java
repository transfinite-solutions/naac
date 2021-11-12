package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "teacher_appointment")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeacherAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "Appointment date is required")
    @Column(nullable = false)
    private Date appointmentDate;

    @NotNull(message = "Order number is required")
    @Column(nullable = false)
    private String orderNumber;

    @NotNull(message = "Appointment type is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentType appointmentType;

    @NotNull(message = "Designation is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Designation designation;

    private String document;
}
