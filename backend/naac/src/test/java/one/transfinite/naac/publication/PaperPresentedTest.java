package one.transfinite.naac.publication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import one.transfinite.naac.program.FacultySeminarLevel;
import one.transfinite.naac.program.FacultySeminarType;
import org.junit.jupiter.api.Test;

class PaperPresentedTest {
    @Test
    void testConstructor() {
        PaperPresented actualPaperPresented = new PaperPresented();
        actualPaperPresented.setAcademicYear("Academic Year");
        actualPaperPresented.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualPaperPresented.setEndDate(fromResult);
        actualPaperPresented.setFacultySeminarLevel(FacultySeminarLevel.University);
        actualPaperPresented.setFacultySeminarType(FacultySeminarType.conference);
        actualPaperPresented.setId(123L);
        actualPaperPresented.setRole("Role");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualPaperPresented.setStartDate(fromResult1);
        actualPaperPresented.setTitle("Dr");
        actualPaperPresented.setTitleOfPaper("Dr");
        assertEquals("Academic Year", actualPaperPresented.getAcademicYear());
        assertEquals("Document", actualPaperPresented.getDocument());
        assertSame(fromResult, actualPaperPresented.getEndDate());
        assertEquals(FacultySeminarLevel.University, actualPaperPresented.getFacultySeminarLevel());
        assertEquals(FacultySeminarType.conference, actualPaperPresented.getFacultySeminarType());
        assertEquals(123L, actualPaperPresented.getId().longValue());
        assertEquals("Role", actualPaperPresented.getRole());
        assertSame(fromResult1, actualPaperPresented.getStartDate());
        assertEquals("Dr", actualPaperPresented.getTitle());
        assertEquals("Dr", actualPaperPresented.getTitleOfPaper());
    }

    @Test
    void testConstructor2() {
        Date startDate = new Date(1L);
        PaperPresented actualPaperPresented = new PaperPresented(123L, "Academic Year", FacultySeminarLevel.University,
                FacultySeminarType.conference, "Dr", "Dr", startDate, new Date(1L), "Role", "Document");
        actualPaperPresented.setAcademicYear("Academic Year");
        actualPaperPresented.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualPaperPresented.setEndDate(fromResult);
        actualPaperPresented.setFacultySeminarLevel(FacultySeminarLevel.University);
        actualPaperPresented.setFacultySeminarType(FacultySeminarType.conference);
        actualPaperPresented.setId(123L);
        actualPaperPresented.setRole("Role");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualPaperPresented.setStartDate(fromResult1);
        actualPaperPresented.setTitle("Dr");
        actualPaperPresented.setTitleOfPaper("Dr");
        assertEquals("Academic Year", actualPaperPresented.getAcademicYear());
        assertEquals("Document", actualPaperPresented.getDocument());
        assertSame(fromResult, actualPaperPresented.getEndDate());
        assertEquals(FacultySeminarLevel.University, actualPaperPresented.getFacultySeminarLevel());
        assertEquals(FacultySeminarType.conference, actualPaperPresented.getFacultySeminarType());
        assertEquals(123L, actualPaperPresented.getId().longValue());
        assertEquals("Role", actualPaperPresented.getRole());
        assertSame(fromResult1, actualPaperPresented.getStartDate());
        assertEquals("Dr", actualPaperPresented.getTitle());
        assertEquals("Dr", actualPaperPresented.getTitleOfPaper());
    }
}

