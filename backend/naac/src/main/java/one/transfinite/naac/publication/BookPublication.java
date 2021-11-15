package one.transfinite.naac.publication;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_publication")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class BookPublication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String academicYear;

    private BookType bookType;

    private String titleOfBook;

    private String author;

    private String publishers;

    private String yearOfPublication;

    private String edition;

    private String role;    // need to confirm for type is enum or string

    private PublicationType publicationType;

    private String document;
}
