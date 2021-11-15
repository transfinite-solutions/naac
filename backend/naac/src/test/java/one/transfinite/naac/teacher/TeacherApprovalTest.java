package one.transfinite.naac.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TeacherApprovalTest {
    @Test
    void testConstructor() {
        TeacherApproval actualTeacherApproval = new TeacherApproval();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherApproval.setApprovalDate(fromResult);
        actualTeacherApproval.setApprovalType(AppointmentType.Full_time);
        actualTeacherApproval.setDesignation(Designation.Professor);
        actualTeacherApproval.setDocument("Document");
        actualTeacherApproval.setId(123L);
        actualTeacherApproval.setLetterNumber("42");
        assertSame(fromResult, actualTeacherApproval.getApprovalDate());
        assertEquals(AppointmentType.Full_time, actualTeacherApproval.getApprovalType());
        assertEquals(Designation.Professor, actualTeacherApproval.getDesignation());
        assertEquals("Document", actualTeacherApproval.getDocument());
        assertEquals(123L, actualTeacherApproval.getId().longValue());
        assertEquals("42", actualTeacherApproval.getLetterNumber());
    }

    @Test
    void testConstructor2() {
        TeacherApproval actualTeacherApproval = new TeacherApproval(123L, new Date(1L), "42", AppointmentType.Full_time,
                Designation.Professor, "Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherApproval.setApprovalDate(fromResult);
        actualTeacherApproval.setApprovalType(AppointmentType.Full_time);
        actualTeacherApproval.setDesignation(Designation.Professor);
        actualTeacherApproval.setDocument("Document");
        actualTeacherApproval.setId(123L);
        actualTeacherApproval.setLetterNumber("42");
        assertSame(fromResult, actualTeacherApproval.getApprovalDate());
        assertEquals(AppointmentType.Full_time, actualTeacherApproval.getApprovalType());
        assertEquals(Designation.Professor, actualTeacherApproval.getDesignation());
        assertEquals("Document", actualTeacherApproval.getDocument());
        assertEquals(123L, actualTeacherApproval.getId().longValue());
        assertEquals("42", actualTeacherApproval.getLetterNumber());
    }
}

