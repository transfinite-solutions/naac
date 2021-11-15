package one.transfinite.naac.qualification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EntranceQualificationTest {
    @Test
    void testConstructor() {
        EntranceQualification actualEntranceQualification = new EntranceQualification();
        actualEntranceQualification.setId(123L);
        actualEntranceQualification.setName("Name");
        actualEntranceQualification.setSubject("Hello from the Dreaming Spires");
        actualEntranceQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualEntranceQualification.setYearOfPassing(fromResult);
        assertEquals(123L, actualEntranceQualification.getId().longValue());
        assertEquals("Name", actualEntranceQualification.getName());
        assertEquals("Hello from the Dreaming Spires", actualEntranceQualification.getSubject());
        assertEquals("University", actualEntranceQualification.getUniversity());
        assertSame(fromResult, actualEntranceQualification.getYearOfPassing());
    }

    @Test
    void testConstructor2() {
        EntranceQualification actualEntranceQualification = new EntranceQualification(123L, "Name", new Date(1L),
                "Hello from the Dreaming Spires", "University");
        actualEntranceQualification.setId(123L);
        actualEntranceQualification.setName("Name");
        actualEntranceQualification.setSubject("Hello from the Dreaming Spires");
        actualEntranceQualification.setUniversity("University");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualEntranceQualification.setYearOfPassing(fromResult);
        assertEquals(123L, actualEntranceQualification.getId().longValue());
        assertEquals("Name", actualEntranceQualification.getName());
        assertEquals("Hello from the Dreaming Spires", actualEntranceQualification.getSubject());
        assertEquals("University", actualEntranceQualification.getUniversity());
        assertSame(fromResult, actualEntranceQualification.getYearOfPassing());
    }
}

