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

class ReportOfSchoolTest {
    @Test
    void testConstructor() {
        ReportOfSchool actualReportOfSchool = new ReportOfSchool();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfSchool.setFromDate(fromResult);
        actualReportOfSchool.setId(123L);
        ArrayList<Participants> participantsList = new ArrayList<Participants>();
        actualReportOfSchool.setListOfParticipants(participantsList);
        ArrayList<NewsReport> newsReportList = new ArrayList<NewsReport>();
        actualReportOfSchool.setNewsReports(newsReportList);
        actualReportOfSchool.setNoOfStudent(1L);
        actualReportOfSchool.setNoOfTeacher(1L);
        ArrayList<Photograph> photographList = new ArrayList<Photograph>();
        actualReportOfSchool.setPhotographs(photographList);
        actualReportOfSchool.setReportBrief("Report Brief");
        actualReportOfSchool.setSupportingAgency("Supporting Agency");
        actualReportOfSchool.setTitle("Dr");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfSchool.setToDate(fromResult1);
        assertSame(fromResult, actualReportOfSchool.getFromDate());
        assertEquals(123L, actualReportOfSchool.getId().longValue());
        List<Participants> listOfParticipants = actualReportOfSchool.getListOfParticipants();
        assertSame(participantsList, listOfParticipants);
        List<NewsReport> newsReports = actualReportOfSchool.getNewsReports();
        assertEquals(newsReports, listOfParticipants);
        List<Photograph> photographs = actualReportOfSchool.getPhotographs();
        assertEquals(photographs, listOfParticipants);
        assertSame(newsReportList, newsReports);
        assertEquals(participantsList, newsReports);
        assertEquals(photographs, newsReports);
        assertEquals(1L, actualReportOfSchool.getNoOfStudent().longValue());
        assertEquals(1L, actualReportOfSchool.getNoOfTeacher().longValue());
        assertSame(photographList, photographs);
        assertEquals(participantsList, photographs);
        assertEquals(newsReportList, photographs);
        assertEquals("Report Brief", actualReportOfSchool.getReportBrief());
        assertEquals("Supporting Agency", actualReportOfSchool.getSupportingAgency());
        assertEquals("Dr", actualReportOfSchool.getTitle());
        assertSame(fromResult1, actualReportOfSchool.getToDate());
    }

    @Test
    void testConstructor2() {
        Date fromDate = new Date(1L);
        Date toDate = new Date(1L);
        ArrayList<Photograph> photographList = new ArrayList<Photograph>();
        ArrayList<NewsReport> newsReportList = new ArrayList<NewsReport>();
        ArrayList<Participants> participantsList = new ArrayList<Participants>();
        ReportOfSchool actualReportOfSchool = new ReportOfSchool(123L, "Dr", fromDate, toDate, 1L, 1L, "Report Brief",
                "Supporting Agency", photographList, newsReportList, participantsList);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfSchool.setFromDate(fromResult);
        actualReportOfSchool.setId(123L);
        ArrayList<Participants> participantsList1 = new ArrayList<Participants>();
        actualReportOfSchool.setListOfParticipants(participantsList1);
        ArrayList<NewsReport> newsReportList1 = new ArrayList<NewsReport>();
        actualReportOfSchool.setNewsReports(newsReportList1);
        actualReportOfSchool.setNoOfStudent(1L);
        actualReportOfSchool.setNoOfTeacher(1L);
        ArrayList<Photograph> photographList1 = new ArrayList<Photograph>();
        actualReportOfSchool.setPhotographs(photographList1);
        actualReportOfSchool.setReportBrief("Report Brief");
        actualReportOfSchool.setSupportingAgency("Supporting Agency");
        actualReportOfSchool.setTitle("Dr");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualReportOfSchool.setToDate(fromResult1);
        assertSame(fromResult, actualReportOfSchool.getFromDate());
        assertEquals(123L, actualReportOfSchool.getId().longValue());
        List<Participants> listOfParticipants = actualReportOfSchool.getListOfParticipants();
        assertSame(participantsList1, listOfParticipants);
        assertEquals(photographList, listOfParticipants);
        assertEquals(newsReportList, listOfParticipants);
        assertEquals(participantsList, listOfParticipants);
        List<NewsReport> newsReports = actualReportOfSchool.getNewsReports();
        assertEquals(newsReports, listOfParticipants);
        List<Photograph> photographs = actualReportOfSchool.getPhotographs();
        assertEquals(photographs, listOfParticipants);
        assertSame(newsReportList1, newsReports);
        assertEquals(photographList, newsReports);
        assertEquals(newsReportList, newsReports);
        assertEquals(participantsList, newsReports);
        assertEquals(participantsList1, newsReports);
        assertEquals(photographs, newsReports);
        assertEquals(1L, actualReportOfSchool.getNoOfStudent().longValue());
        assertEquals(1L, actualReportOfSchool.getNoOfTeacher().longValue());
        assertSame(photographList1, photographs);
        assertEquals(photographList, photographs);
        assertEquals(newsReportList, photographs);
        assertEquals(participantsList, photographs);
        assertEquals(participantsList1, photographs);
        assertEquals(newsReportList1, photographs);
        assertEquals("Report Brief", actualReportOfSchool.getReportBrief());
        assertEquals("Supporting Agency", actualReportOfSchool.getSupportingAgency());
        assertEquals("Dr", actualReportOfSchool.getTitle());
        assertSame(fromResult1, actualReportOfSchool.getToDate());
    }
}

