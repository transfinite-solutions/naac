package one.transfinite.naac.program;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class FacultySeminarTest {
    @Test
    void testConstructor() {
        FacultySeminar actualFacultySeminar = new FacultySeminar();
        actualFacultySeminar.setAcademicYear("Academic Year");
        actualFacultySeminar.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultySeminar.setEndDate(fromResult);
        actualFacultySeminar.setFacultySeminarLevel(FacultySeminarLevel.University);
        actualFacultySeminar.setFacultySeminarType(FacultySeminarType.conference);
        actualFacultySeminar.setId(123L);
        actualFacultySeminar.setPlace("Place");
        actualFacultySeminar.setRole("Role");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultySeminar.setStartDate(fromResult1);
        actualFacultySeminar.setTitle("Dr");
        assertEquals("Academic Year", actualFacultySeminar.getAcademicYear());
        assertEquals("Document", actualFacultySeminar.getDocument());
        assertSame(fromResult, actualFacultySeminar.getEndDate());
        assertEquals(FacultySeminarLevel.University, actualFacultySeminar.getFacultySeminarLevel());
        assertEquals(FacultySeminarType.conference, actualFacultySeminar.getFacultySeminarType());
        assertEquals(123L, actualFacultySeminar.getId().longValue());
        assertEquals("Place", actualFacultySeminar.getPlace());
        assertEquals("Role", actualFacultySeminar.getRole());
        assertSame(fromResult1, actualFacultySeminar.getStartDate());
        assertEquals("Dr", actualFacultySeminar.getTitle());
    }

    @Test
    void testConstructor2() {
        Date startDate = new Date(1L);
        FacultySeminar actualFacultySeminar = new FacultySeminar(123L, "Academic Year", FacultySeminarLevel.University,
                FacultySeminarType.conference, "Dr", "Place", startDate, new Date(1L), "Role", "Document");
        actualFacultySeminar.setAcademicYear("Academic Year");
        actualFacultySeminar.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultySeminar.setEndDate(fromResult);
        actualFacultySeminar.setFacultySeminarLevel(FacultySeminarLevel.University);
        actualFacultySeminar.setFacultySeminarType(FacultySeminarType.conference);
        actualFacultySeminar.setId(123L);
        actualFacultySeminar.setPlace("Place");
        actualFacultySeminar.setRole("Role");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultySeminar.setStartDate(fromResult1);
        actualFacultySeminar.setTitle("Dr");
        assertEquals("Academic Year", actualFacultySeminar.getAcademicYear());
        assertEquals("Document", actualFacultySeminar.getDocument());
        assertSame(fromResult, actualFacultySeminar.getEndDate());
        assertEquals(FacultySeminarLevel.University, actualFacultySeminar.getFacultySeminarLevel());
        assertEquals(FacultySeminarType.conference, actualFacultySeminar.getFacultySeminarType());
        assertEquals(123L, actualFacultySeminar.getId().longValue());
        assertEquals("Place", actualFacultySeminar.getPlace());
        assertEquals("Role", actualFacultySeminar.getRole());
        assertSame(fromResult1, actualFacultySeminar.getStartDate());
        assertEquals("Dr", actualFacultySeminar.getTitle());
    }
}

