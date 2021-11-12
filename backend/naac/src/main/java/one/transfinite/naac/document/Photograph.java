package one.transfinite.naac.document;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "photograph")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Photograph {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photo;
}
