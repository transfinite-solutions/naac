package one.transfinite.naac.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class GuideTest {
    @Test
    void testConstructor() {
        Guide actualGuide = new Guide();
        actualGuide.setDocument("Document");
        actualGuide.setGuideName("1234");
        actualGuide.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualGuide.setLetterDate(fromResult);
        actualGuide.setLetterOn("Letter On");
        assertEquals("Document", actualGuide.getDocument());
        assertEquals("1234", actualGuide.getGuideName());
        assertEquals(123L, actualGuide.getId().longValue());
        assertSame(fromResult, actualGuide.getLetterDate());
        assertEquals("Letter On", actualGuide.getLetterOn());
    }

    @Test
    void testConstructor2() {
        Guide actualGuide = new Guide(123L, "1234", "Letter On", new Date(1L), "Document");
        actualGuide.setDocument("Document");
        actualGuide.setGuideName("1234");
        actualGuide.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualGuide.setLetterDate(fromResult);
        actualGuide.setLetterOn("Letter On");
        assertEquals("Document", actualGuide.getDocument());
        assertEquals("1234", actualGuide.getGuideName());
        assertEquals(123L, actualGuide.getId().longValue());
        assertSame(fromResult, actualGuide.getLetterDate());
        assertEquals("Letter On", actualGuide.getLetterOn());
    }
}

