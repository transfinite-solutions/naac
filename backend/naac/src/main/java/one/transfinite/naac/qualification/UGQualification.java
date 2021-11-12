package one.transfinite.naac.qualification;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "ug_qualification")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class UGQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotBlank(message = "Degree detail is required")
    @Column(nullable = false)
    private String degree;

    @NotBlank(message = "University detail is required")
    @Column(nullable = false)
    private String university;

    @NotBlank(message = "Year of passing is required")
    @Column(nullable = false)
    private Date yearOfPassing;

    @NotBlank(message = "Specialization is required")
    @Column(nullable = false)
    private String specialization;

    @NotBlank(message = "Grade is required")
    @Column(nullable = false)
    private String grade;

    private String document;
}