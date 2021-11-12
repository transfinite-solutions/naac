package one.transfinite.naac.qualification;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "entrance_qualification")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class EntranceQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotBlank(message = "Name field is required")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Year of passing is required")
    @Column(nullable = false)
    private Date yearOfPassing;

    @NotBlank(message = "Subject is required")
    @Column(nullable = false)
    private String subject;

    @NotBlank(message = "University detail is required")
    @Column(nullable = false)
    private String university;
}
