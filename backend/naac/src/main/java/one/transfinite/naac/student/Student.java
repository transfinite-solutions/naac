package one.transfinite.naac.student;

import lombok.*;
import one.transfinite.naac.department.Program;
import one.transfinite.naac.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "student")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @JoinColumn(name = "fk_user_id")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

    private String cast;

    private String religion;

    @NotBlank(message = "Aadhar card detail required")
    @Column(nullable = false)
    private String aadharNumber;

    @Column(nullable = false)
    private String aadharDocument;      //document

    private String panNumber;

    private String panDocument;

    @NotNull(message = "Tenth mark is required")
    @Column(nullable = false)
    private Double tenthMarks;

    @NotNull(message = "Twelth mark is required")
    @Column(nullable = false)
    private Double twelthMarks;

    @NotNull(message = "student start date is required")
    @Column(nullable = false)
    private Date startDate;

    private Date completionDate;

    @NotBlank(message = "Father name is required")
    @Column(nullable = false)
    private String fatherName;

    @NotBlank(message = "Mother name is required")
    @Column(nullable = false)
    private String motherName;

    @NotBlank(message = "Father contact detail is required")
    @Column(nullable = false)
    private String fatherPhoneNumber;

    @NotBlank(message = "Mother contact detail is required")
    @Column(nullable = false)
    private String motherPhoneNumber;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Program program;
}
