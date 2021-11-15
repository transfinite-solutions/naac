package one.transfinite.naac.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TeacherTransferTest {
    @Test
    void testConstructor() {
        TeacherTransfer actualTeacherTransfer = new TeacherTransfer();
        actualTeacherTransfer.setDocument("Document");
        actualTeacherTransfer.setId(123L);
        actualTeacherTransfer.setOrderNumber("42");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherTransfer.setTransferDate(fromResult);
        actualTeacherTransfer.setTransferFrom("jane.doe@example.org");
        assertEquals("Document", actualTeacherTransfer.getDocument());
        assertEquals(123L, actualTeacherTransfer.getId().longValue());
        assertEquals("42", actualTeacherTransfer.getOrderNumber());
        assertSame(fromResult, actualTeacherTransfer.getTransferDate());
        assertEquals("jane.doe@example.org", actualTeacherTransfer.getTransferFrom());
    }

    @Test
    void testConstructor2() {
        TeacherTransfer actualTeacherTransfer = new TeacherTransfer(123L, new Date(1L), "42", "jane.doe@example.org",
                "Document");
        actualTeacherTransfer.setDocument("Document");
        actualTeacherTransfer.setId(123L);
        actualTeacherTransfer.setOrderNumber("42");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTeacherTransfer.setTransferDate(fromResult);
        actualTeacherTransfer.setTransferFrom("jane.doe@example.org");
        assertEquals("Document", actualTeacherTransfer.getDocument());
        assertEquals(123L, actualTeacherTransfer.getId().longValue());
        assertEquals("42", actualTeacherTransfer.getOrderNumber());
        assertSame(fromResult, actualTeacherTransfer.getTransferDate());
        assertEquals("jane.doe@example.org", actualTeacherTransfer.getTransferFrom());
    }
}

