package one.transfinite.naac.qualification;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "research_qualification")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ResearchQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotBlank(message = "Degree is required")
    @Column(nullable = false)
    private String degree;

    @NotBlank(message = "Date of declaration is required")
    @Column(nullable = false)
    private Date dateOfDeclaration;

    @NotBlank(message = "Subject is required")
    @Column(nullable = false)
    private String subject;

    @NotBlank(message = "University is required")
    @Column(nullable = false)
    private String university;
}
