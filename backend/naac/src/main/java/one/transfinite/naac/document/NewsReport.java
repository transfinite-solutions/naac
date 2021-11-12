package one.transfinite.naac.document;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "news_report")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class NewsReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String news;
}
