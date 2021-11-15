package one.transfinite.naac.qualification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class ResearchQualificationTest {
    @Test
    void testConstructor() {
        ResearchQualification actualResearchQualification = new ResearchQualification();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualResearchQualification.setDateOfDeclaration(fromResult);
        actualResearchQualification.setDegree("Degree");
        actualResearchQualification.setId(123L);
        actualResearchQualification.setSubject("Hello from the Dreaming Spires");
        actualResearchQualification.setUniversity("University");
        assertSame(fromResult, actualResearchQualification.getDateOfDeclaration());
        assertEquals("Degree", actualResearchQualification.getDegree());
        assertEquals(123L, actualResearchQualification.getId().longValue());
        assertEquals("Hello from the Dreaming Spires", actualResearchQualification.getSubject());
        assertEquals("University", actualResearchQualification.getUniversity());
    }

    @Test
    void testConstructor2() {
        ResearchQualification actualResearchQualification = new ResearchQualification(123L, "Degree", new Date(1L),
                "Hello from the Dreaming Spires", "University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualResearchQualification.setDateOfDeclaration(fromResult);
        actualResearchQualification.setDegree("Degree");
        actualResearchQualification.setId(123L);
        actualResearchQualification.setSubject("Hello from the Dreaming Spires");
        actualResearchQualification.setUniversity("University");
        assertSame(fromResult, actualResearchQualification.getDateOfDeclaration());
        assertEquals("Degree", actualResearchQualification.getDegree());
        assertEquals(123L, actualResearchQualification.getId().longValue());
        assertEquals("Hello from the Dreaming Spires", actualResearchQualification.getSubject());
        assertEquals("University", actualResearchQualification.getUniversity());
    }
}

