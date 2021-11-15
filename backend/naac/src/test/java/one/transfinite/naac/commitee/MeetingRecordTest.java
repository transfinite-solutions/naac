package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class MeetingRecordTest {
    @Test
    void testConstructor() {
        MeetingRecord actualMeetingRecord = new MeetingRecord();
        actualMeetingRecord.setAgenda("Agenda");
        actualMeetingRecord.setDocument("Document");
        actualMeetingRecord.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualMeetingRecord.setMeetingDate(fromResult);
        assertEquals("Agenda", actualMeetingRecord.getAgenda());
        assertEquals("Document", actualMeetingRecord.getDocument());
        assertEquals(123L, actualMeetingRecord.getId().longValue());
        assertSame(fromResult, actualMeetingRecord.getMeetingDate());
    }

    @Test
    void testConstructor2() {
        MeetingRecord actualMeetingRecord = new MeetingRecord(123L, "Agenda", new Date(1L), "Document");
        actualMeetingRecord.setAgenda("Agenda");
        actualMeetingRecord.setDocument("Document");
        actualMeetingRecord.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualMeetingRecord.setMeetingDate(fromResult);
        assertEquals("Agenda", actualMeetingRecord.getAgenda());
        assertEquals("Document", actualMeetingRecord.getDocument());
        assertEquals(123L, actualMeetingRecord.getId().longValue());
        assertSame(fromResult, actualMeetingRecord.getMeetingDate());
    }
}

