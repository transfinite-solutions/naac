package one.transfinite.naac.document;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "participants")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String participant;
}
