package one.transfinite.naac.publication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookPublicationTest {
    @Test
    void testConstructor() {
        BookPublication actualBookPublication = new BookPublication();
        actualBookPublication.setAcademicYear("Academic Year");
        actualBookPublication.setAuthor("JaneDoe");
        actualBookPublication.setBookType(BookType.Research_Article);
        actualBookPublication.setDocument("Document");
        actualBookPublication.setEdition("Edition");
        actualBookPublication.setId(123L);
        actualBookPublication.setPublicationType(PublicationType.Local);
        actualBookPublication.setPublishers("Publishers");
        actualBookPublication.setRole("Role");
        actualBookPublication.setTitleOfBook("Dr");
        actualBookPublication.setYearOfPublication("Year Of Publication");
        assertEquals("Academic Year", actualBookPublication.getAcademicYear());
        assertEquals("JaneDoe", actualBookPublication.getAuthor());
        assertEquals(BookType.Research_Article, actualBookPublication.getBookType());
        assertEquals("Document", actualBookPublication.getDocument());
        assertEquals("Edition", actualBookPublication.getEdition());
        assertEquals(123L, actualBookPublication.getId().longValue());
        assertEquals(PublicationType.Local, actualBookPublication.getPublicationType());
        assertEquals("Publishers", actualBookPublication.getPublishers());
        assertEquals("Role", actualBookPublication.getRole());
        assertEquals("Dr", actualBookPublication.getTitleOfBook());
        assertEquals("Year Of Publication", actualBookPublication.getYearOfPublication());
        assertEquals("BookPublication(id=123, academicYear=Academic Year, bookType=Research_Article, titleOfBook=Dr,"
                + " author=JaneDoe, publishers=Publishers, yearOfPublication=Year Of Publication, edition=Edition,"
                + " role=Role, publicationType=Local, document=Document)", actualBookPublication.toString());
    }

    @Test
    void testConstructor2() {
        BookPublication actualBookPublication = new BookPublication(123L, "Academic Year", BookType.Research_Article, "Dr",
                "JaneDoe", "Publishers", "Year Of Publication", "Edition", "Role", PublicationType.Local, "Document");
        actualBookPublication.setAcademicYear("Academic Year");
        actualBookPublication.setAuthor("JaneDoe");
        actualBookPublication.setBookType(BookType.Research_Article);
        actualBookPublication.setDocument("Document");
        actualBookPublication.setEdition("Edition");
        actualBookPublication.setId(123L);
        actualBookPublication.setPublicationType(PublicationType.Local);
        actualBookPublication.setPublishers("Publishers");
        actualBookPublication.setRole("Role");
        actualBookPublication.setTitleOfBook("Dr");
        actualBookPublication.setYearOfPublication("Year Of Publication");
        assertEquals("Academic Year", actualBookPublication.getAcademicYear());
        assertEquals("JaneDoe", actualBookPublication.getAuthor());
        assertEquals(BookType.Research_Article, actualBookPublication.getBookType());
        assertEquals("Document", actualBookPublication.getDocument());
        assertEquals("Edition", actualBookPublication.getEdition());
        assertEquals(123L, actualBookPublication.getId().longValue());
        assertEquals(PublicationType.Local, actualBookPublication.getPublicationType());
        assertEquals("Publishers", actualBookPublication.getPublishers());
        assertEquals("Role", actualBookPublication.getRole());
        assertEquals("Dr", actualBookPublication.getTitleOfBook());
        assertEquals("Year Of Publication", actualBookPublication.getYearOfPublication());
        assertEquals("BookPublication(id=123, academicYear=Academic Year, bookType=Research_Article, titleOfBook=Dr,"
                + " author=JaneDoe, publishers=Publishers, yearOfPublication=Year Of Publication, edition=Edition,"
                + " role=Role, publicationType=Local, document=Document)", actualBookPublication.toString());
    }
}

