package one.transfinite.naac.teacher;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "teacher_transfer")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TeacherTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "Transfer date is required")
    @Column(nullable = false)
    private Date TransferDate;

    @NotNull(message = "Order number is required")
    @Column(nullable = false)
    private String orderNumber;

    @NotNull(message = "Transfer detail is required")
    @Column(nullable = false)
    private String TransferFrom;

    private String document;
}
