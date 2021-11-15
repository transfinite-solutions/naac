package one.transfinite.naac.qualification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PGQualificationTest {
    @Test
    void testConstructor() {
        PGQualification actualPgQualification = new PGQualification();
        actualPgQualification.setDegree("Degree");
        actualPgQualification.setDocument("Document");
        actualPgQualification.setGrade("Grade");
        actualPgQualification.setId(123L);
        actualPgQualification.setSpecialization("Specialization");
        actualPgQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualPgQualification.setYearOfPassing(fromResult);
        assertEquals("Degree", actualPgQualification.getDegree());
        assertEquals("Document", actualPgQualification.getDocument());
        assertEquals("Grade", actualPgQualification.getGrade());
        assertEquals(123L, actualPgQualification.getId().longValue());
        assertEquals("Specialization", actualPgQualification.getSpecialization());
        assertEquals("University", actualPgQualification.getUniversity());
        assertSame(fromResult, actualPgQualification.getYearOfPassing());
    }

    @Test
    void testConstructor2() {
        PGQualification actualPgQualification = new PGQualification(123L, "Degree", "University", new Date(1L),
                "Specialization", "Grade", "Document");
        actualPgQualification.setDegree("Degree");
        actualPgQualification.setDocument("Document");
        actualPgQualification.setGrade("Grade");
        actualPgQualification.setId(123L);
        actualPgQualification.setSpecialization("Specialization");
        actualPgQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualPgQualification.setYearOfPassing(fromResult);
        assertEquals("Degree", actualPgQualification.getDegree());
        assertEquals("Document", actualPgQualification.getDocument());
        assertEquals("Grade", actualPgQualification.getGrade());
        assertEquals(123L, actualPgQualification.getId().longValue());
        assertEquals("Specialization", actualPgQualification.getSpecialization());
        assertEquals("University", actualPgQualification.getUniversity());
        assertSame(fromResult, actualPgQualification.getYearOfPassing());
    }
}

