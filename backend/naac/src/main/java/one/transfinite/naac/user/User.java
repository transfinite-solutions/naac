package one.transfinite.naac.user;

import lombok.*;
import one.transfinite.naac.hod.Hod;
import one.transfinite.naac.role.Role;
import one.transfinite.naac.student.Student;
import one.transfinite.naac.teacher.Teacher;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @NotBlank(message = "First name is required")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Middle name is required")
    @Column(nullable = false)
    private String middleName;

    @NotBlank(message = "Last name is required")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "Date of birth is required")
    @Column(nullable = false)
    private Date dob;

    @Email(message = "Please provide valid a email address", regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
    @NotBlank(message = "Email is required")
    @Column(nullable = false, unique = true)
    private String email;

    private String gender;

    @NotBlank(message = "Contact detail is required")
    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    private Date createdAt = new Date();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "hod_id")
    private Hod hod;
}
