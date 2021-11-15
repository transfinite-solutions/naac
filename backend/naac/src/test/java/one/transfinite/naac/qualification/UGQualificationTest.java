package one.transfinite.naac.qualification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class UGQualificationTest {
    @Test
    void testConstructor() {
        UGQualification actualUgQualification = new UGQualification();
        actualUgQualification.setDegree("Degree");
        actualUgQualification.setDocument("Document");
        actualUgQualification.setGrade("Grade");
        actualUgQualification.setId(123L);
        actualUgQualification.setSpecialization("Specialization");
        actualUgQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualUgQualification.setYearOfPassing(fromResult);
        assertEquals("Degree", actualUgQualification.getDegree());
        assertEquals("Document", actualUgQualification.getDocument());
        assertEquals("Grade", actualUgQualification.getGrade());
        assertEquals(123L, actualUgQualification.getId().longValue());
        assertEquals("Specialization", actualUgQualification.getSpecialization());
        assertEquals("University", actualUgQualification.getUniversity());
        assertSame(fromResult, actualUgQualification.getYearOfPassing());
    }

    @Test
    void testConstructor2() {
        UGQualification actualUgQualification = new UGQualification(123L, "Degree", "University", new Date(1L),
                "Specialization", "Grade", "Document");
        actualUgQualification.setDegree("Degree");
        actualUgQualification.setDocument("Document");
        actualUgQualification.setGrade("Grade");
        actualUgQualification.setId(123L);
        actualUgQualification.setSpecialization("Specialization");
        actualUgQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualUgQualification.setYearOfPassing(fromResult);
        assertEquals("Degree", actualUgQualification.getDegree());
        assertEquals("Document", actualUgQualification.getDocument());
        assertEquals("Grade", actualUgQualification.getGrade());
        assertEquals(123L, actualUgQualification.getId().longValue());
        assertEquals("Specialization", actualUgQualification.getSpecialization());
        assertEquals("University", actualUgQualification.getUniversity());
        assertSame(fromResult, actualUgQualification.getYearOfPassing());
    }
}

