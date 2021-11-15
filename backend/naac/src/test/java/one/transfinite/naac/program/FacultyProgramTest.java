package one.transfinite.naac.program;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class FacultyProgramTest {
    @Test
    void testConstructor() {
        FacultyProgram actualFacultyProgram = new FacultyProgram();
        actualFacultyProgram.setAcademicYear("Academic Year");
        actualFacultyProgram.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultyProgram.setEndDate(fromResult);
        actualFacultyProgram.setFacultyProgramType(FacultyProgramType.Refresher_Course);
        actualFacultyProgram.setId(123L);
        actualFacultyProgram.setPlaceOfCourse("Place Of Course");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultyProgram.setStartDate(fromResult1);
        actualFacultyProgram.setTitleOfCourse("Dr");
        assertEquals("Academic Year", actualFacultyProgram.getAcademicYear());
        assertEquals("Document", actualFacultyProgram.getDocument());
        assertSame(fromResult, actualFacultyProgram.getEndDate());
        assertEquals(FacultyProgramType.Refresher_Course, actualFacultyProgram.getFacultyProgramType());
        assertEquals(123L, actualFacultyProgram.getId().longValue());
        assertEquals("Place Of Course", actualFacultyProgram.getPlaceOfCourse());
        assertSame(fromResult1, actualFacultyProgram.getStartDate());
        assertEquals("Dr", actualFacultyProgram.getTitleOfCourse());
    }

    @Test
    void testConstructor2() {
        Date startDate = new Date(1L);
        FacultyProgram actualFacultyProgram = new FacultyProgram(123L, "Academic Year", FacultyProgramType.Refresher_Course,
                "Dr", "Place Of Course", startDate, new Date(1L), "Document");
        actualFacultyProgram.setAcademicYear("Academic Year");
        actualFacultyProgram.setDocument("Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultyProgram.setEndDate(fromResult);
        actualFacultyProgram.setFacultyProgramType(FacultyProgramType.Refresher_Course);
        actualFacultyProgram.setId(123L);
        actualFacultyProgram.setPlaceOfCourse("Place Of Course");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualFacultyProgram.setStartDate(fromResult1);
        actualFacultyProgram.setTitleOfCourse("Dr");
        assertEquals("Academic Year", actualFacultyProgram.getAcademicYear());
        assertEquals("Document", actualFacultyProgram.getDocument());
        assertSame(fromResult, actualFacultyProgram.getEndDate());
        assertEquals(FacultyProgramType.Refresher_Course, actualFacultyProgram.getFacultyProgramType());
        assertEquals(123L, actualFacultyProgram.getId().longValue());
        assertEquals("Place Of Course", actualFacultyProgram.getPlaceOfCourse());
        assertSame(fromResult1, actualFacultyProgram.getStartDate());
        assertEquals("Dr", actualFacultyProgram.getTitleOfCourse());
    }
}

