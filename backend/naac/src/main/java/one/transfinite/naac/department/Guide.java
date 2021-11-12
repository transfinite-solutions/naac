package one.transfinite.naac.department;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "guide")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String guideName;

    private String letterOn;

    private Date letterDate;

    private String document;
}
