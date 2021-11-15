package one.transfinite.naac.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TeacherAppointmentTest {
    @Test
    void testConstructor() {
        TeacherAppointment actualTeacherAppointment = new TeacherAppointment();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherAppointment.setAppointmentDate(fromResult);
        actualTeacherAppointment.setAppointmentType(AppointmentType.Full_time);
        actualTeacherAppointment.setDesignation(Designation.Professor);
        actualTeacherAppointment.setDocument("Document");
        actualTeacherAppointment.setId(123L);
        actualTeacherAppointment.setOrderNumber("42");
        assertSame(fromResult, actualTeacherAppointment.getAppointmentDate());
        assertEquals(AppointmentType.Full_time, actualTeacherAppointment.getAppointmentType());
        assertEquals(Designation.Professor, actualTeacherAppointment.getDesignation());
        assertEquals("Document", actualTeacherAppointment.getDocument());
        assertEquals(123L, actualTeacherAppointment.getId().longValue());
        assertEquals("42", actualTeacherAppointment.getOrderNumber());
    }

    @Test
    void testConstructor2() {
        TeacherAppointment actualTeacherAppointment = new TeacherAppointment(123L, new Date(1L), "42",
                AppointmentType.Full_time, Designation.Professor, "Document");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherAppointment.setAppointmentDate(fromResult);
        actualTeacherAppointment.setAppointmentType(AppointmentType.Full_time);
        actualTeacherAppointment.setDesignation(Designation.Professor);
        actualTeacherAppointment.setDocument("Document");
        actualTeacherAppointment.setId(123L);
        actualTeacherAppointment.setOrderNumber("42");
        assertSame(fromResult, actualTeacherAppointment.getAppointmentDate());
        assertEquals(AppointmentType.Full_time, actualTeacherAppointment.getAppointmentType());
        assertEquals(Designation.Professor, actualTeacherAppointment.getDesignation());
        assertEquals("Document", actualTeacherAppointment.getDocument());
        assertEquals(123L, actualTeacherAppointment.getId().longValue());
        assertEquals("42", actualTeacherAppointment.getOrderNumber());
    }
}

