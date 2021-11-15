package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AcademicCalenderTest {
    @Test
    void testConstructor() {
        AcademicCalender actualAcademicCalender = new AcademicCalender();
        actualAcademicCalender.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAcademicCalender.setProposedDate(fromResult);
        actualAcademicCalender.setTitleOfActivity("Dr");
        assertEquals(123L, actualAcademicCalender.getId().longValue());
        assertSame(fromResult, actualAcademicCalender.getProposedDate());
        assertEquals("Dr", actualAcademicCalender.getTitleOfActivity());
    }

    @Test
    void testConstructor2() {
        AcademicCalender actualAcademicCalender = new AcademicCalender(123L, "Dr", new Date(1L));
        actualAcademicCalender.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAcademicCalender.setProposedDate(fromResult);
        actualAcademicCalender.setTitleOfActivity("Dr");
        assertEquals(123L, actualAcademicCalender.getId().longValue());
        assertSame(fromResult, actualAcademicCalender.getProposedDate());
        assertEquals("Dr", actualAcademicCalender.getTitleOfActivity());
    }
}

