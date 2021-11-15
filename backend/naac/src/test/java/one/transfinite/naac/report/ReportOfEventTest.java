package one.transfinite.naac.report;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import one.transfinite.naac.document.NewsReport;
import one.transfinite.naac.document.Participants;
import one.transfinite.naac.document.Photograph;
import org.junit.jupiter.api.Test;

class ReportOfEventTest {
    @Test
    void testConstructor() {
        ReportOfEvent actualReportOfEvent = new ReportOfEvent();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfEvent.setFromDate(fromResult);
        actualReportOfEvent.setId(123L);
        ArrayList<Participants> participantsList = new ArrayList<Participants>();
        actualReportOfEvent.setListOfParticipants(participantsList);
        ArrayList<NewsReport> newsReportList = new ArrayList<NewsReport>();
        actualReportOfEvent.setNewsReports(newsReportList);
        actualReportOfEvent.setNoOfStudent(1L);
        actualReportOfEvent.setNoOfTeacher(1L);
        ArrayList<Photograph> photographList = new ArrayList<Photograph>();
        actualReportOfEvent.setPhotographs(photographList);
        actualReportOfEvent.setReportBrief("Report Brief");
        actualReportOfEvent.setSupportingAgency("Supporting Agency");
        actualReportOfEvent.setTitle("Dr");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfEvent.setToDate(fromResult1);
        assertSame(fromResult, actualReportOfEvent.getFromDate());
        assertEquals(123L, actualReportOfEvent.getId().longValue());
        List<Participants> listOfParticipants = actualReportOfEvent.getListOfParticipants();
        assertSame(participantsList, listOfParticipants);
        List<NewsReport> newsReports = actualReportOfEvent.getNewsReports();
        assertEquals(newsReports, listOfParticipants);
        List<Photograph> photographs = actualReportOfEvent.getPhotographs();
        assertEquals(photographs, listOfParticipants);
        assertSame(newsReportList, newsReports);
        assertEquals(participantsList, newsReports);
        assertEquals(photographs, newsReports);
        assertEquals(1L, actualReportOfEvent.getNoOfStudent().longValue());
        assertEquals(1L, actualReportOfEvent.getNoOfTeacher().longValue());
        assertSame(photographList, photographs);
        assertEquals(participantsList, photographs);
        assertEquals(newsReportList, photographs);
        assertEquals("Report Brief", actualReportOfEvent.getReportBrief());
        assertEquals("Supporting Agency", actualReportOfEvent.getSupportingAgency());
        assertEquals("Dr", actualReportOfEvent.getTitle());
        assertSame(fromResult1, actualReportOfEvent.getToDate());
    }

    @Test
    void testConstructor2() {
        Date fromDate = new Date(1L);
        Date toDate = new Date(1L);
        ArrayList<Photograph> photographList = new ArrayList<Photograph>();
        ArrayList<NewsReport> newsReportList = new ArrayList<NewsReport>();
        ArrayList<Participants> participantsList = new ArrayList<Participants>();
        ReportOfEvent actualReportOfEvent = new ReportOfEvent(123L, "Dr", fromDate, toDate, 1L, 1L, "Report Brief",
                "Supporting Agency", photographList, newsReportList, participantsList);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfEvent.setFromDate(fromResult);
        actualReportOfEvent.setId(123L);
        ArrayList<Participants> participantsList1 = new ArrayList<Participants>();
        actualReportOfEvent.setListOfParticipants(participantsList1);
        ArrayList<NewsReport> newsReportList1 = new ArrayList<NewsReport>();
        actualReportOfEvent.setNewsReports(newsReportList1);
        actualReportOfEvent.setNoOfStudent(1L);
        actualReportOfEvent.setNoOfTeacher(1L);
        ArrayList<Photograph> photographList1 = new ArrayList<Photograph>();
        actualReportOfEvent.setPhotographs(photographList1);
        actualReportOfEvent.setReportBrief("Report Brief");
        actualReportOfEvent.setSupportingAgency("Supporting Agency");
        actualReportOfEvent.setTitle("Dr");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfEvent.setToDate(fromResult1);
        assertSame(fromResult, actualReportOfEvent.getFromDate());
        assertEquals(123L, actualReportOfEvent.getId().longValue());
        List<Participants> listOfParticipants = actualReportOfEvent.getListOfParticipants();
        assertSame(participantsList1, listOfParticipants);
        assertEquals(photographList, listOfParticipants);
        assertEquals(newsReportList, listOfParticipants);
        assertEquals(participantsList, listOfParticipants);
        List<NewsReport> newsReports = actualReportOfEvent.getNewsReports();
        assertEquals(newsReports, listOfParticipants);
        List<Photograph> photographs = actualReportOfEvent.getPhotographs();
        assertEquals(photographs, listOfParticipants);
        assertSame(newsReportList1, newsReports);
        assertEquals(photographList, newsReports);
        assertEquals(newsReportList, newsReports);
        assertEquals(participantsList, newsReports);
        assertEquals(participantsList1, newsReports);
        assertEquals(photographs, newsReports);
        assertEquals(1L, actualReportOfEvent.getNoOfStudent().longValue());
        assertEquals(1L, actualReportOfEvent.getNoOfTeacher().longValue());
        assertSame(photographList1, photographs);
        assertEquals(photographList, photographs);
        assertEquals(newsReportList, photographs);
        assertEquals(participantsList, photographs);
        assertEquals(participantsList1, photographs);
        assertEquals(newsReportList1, photographs);
        assertEquals("Report Brief", actualReportOfEvent.getReportBrief());
        assertEquals("Supporting Agency", actualReportOfEvent.getSupportingAgency());
        assertEquals("Dr", actualReportOfEvent.getTitle());
        assertSame(fromResult1, actualReportOfEvent.getToDate());
    }
}

