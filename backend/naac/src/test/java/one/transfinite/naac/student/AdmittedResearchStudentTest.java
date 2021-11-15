package one.transfinite.naac.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import one.transfinite.naac.department.Guide;
import one.transfinite.naac.program.ResearchProgram;
import org.junit.jupiter.api.Test;

class AdmittedResearchStudentTest {
    @Test
    void testConstructor() {
        AdmittedResearchStudent actualAdmittedResearchStudent = new AdmittedResearchStudent();
        actualAdmittedResearchStudent.setCategory("Category");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAdmittedResearchStudent.setDeclarationDate(fromResult);
        actualAdmittedResearchStudent.setDocument("Document");
        Guide guide = new Guide();
        guide.setDocument("Document");
        guide.setGuideName("1234");
        guide.setId(123L);
        guide.setLetterOn("Letter On");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        guide.setLetterDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        actualAdmittedResearchStudent.setGuide(guide);
        actualAdmittedResearchStudent.setId(123L);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant());
        actualAdmittedResearchStudent.setRegistrationDate(fromResult1);
        ResearchProgram researchProgram = new ResearchProgram();
        researchProgram.setId(123L);
        researchProgram.setProgramName("Program Name");
        researchProgram.setProgramYear("Program Year");
        researchProgram.setAdmittedResearchStudents(new ArrayList<AdmittedResearchStudent>());
        researchProgram.setProgramType("Program Type");
        researchProgram.setProgramClass("Program Class");
        actualAdmittedResearchStudent.setResearchProgram(researchProgram);
        actualAdmittedResearchStudent.setTopicTitle("Dr");
        assertEquals("Category", actualAdmittedResearchStudent.getCategory());
        assertSame(fromResult, actualAdmittedResearchStudent.getDeclarationDate());
        assertEquals("Document", actualAdmittedResearchStudent.getDocument());
        assertSame(guide, actualAdmittedResearchStudent.getGuide());
        assertEquals(123L, actualAdmittedResearchStudent.getId().longValue());
        assertSame(fromResult1, actualAdmittedResearchStudent.getRegistrationDate());
        assertSame(researchProgram, actualAdmittedResearchStudent.getResearchProgram());
        assertEquals("Dr", actualAdmittedResearchStudent.getTopicTitle());
    }

    @Test
    void testConstructor2() {
        ResearchProgram researchProgram = new ResearchProgram();
        Guide guide = new Guide();
        Date registrationDate = new Date(1L);
        AdmittedResearchStudent actualAdmittedResearchStudent = new AdmittedResearchStudent(123L, researchProgram,
                "Category", guide, registrationDate, "Dr", new Date(1L), "Document");
        actualAdmittedResearchStudent.setCategory("Category");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAdmittedResearchStudent.setDeclarationDate(fromResult);
        actualAdmittedResearchStudent.setDocument("Document");
        Guide guide1 = new Guide();
        guide1.setDocument("Document");
        guide1.setGuideName("1234");
        guide1.setId(123L);
        guide1.setLetterOn("Letter On");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        guide1.setLetterDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        actualAdmittedResearchStudent.setGuide(guide1);
        actualAdmittedResearchStudent.setId(123L);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant());
        actualAdmittedResearchStudent.setRegistrationDate(fromResult1);
        ResearchProgram researchProgram1 = new ResearchProgram();
        researchProgram1.setId(123L);
        researchProgram1.setProgramName("Program Name");
        researchProgram1.setProgramYear("Program Year");
        researchProgram1.setAdmittedResearchStudents(new ArrayList<AdmittedResearchStudent>());
        researchProgram1.setProgramType("Program Type");
        researchProgram1.setProgramClass("Program Class");
        actualAdmittedResearchStudent.setResearchProgram(researchProgram1);
        actualAdmittedResearchStudent.setTopicTitle("Dr");
        assertEquals("Category", actualAdmittedResearchStudent.getCategory());
        assertSame(fromResult, actualAdmittedResearchStudent.getDeclarationDate());
        assertEquals("Document", actualAdmittedResearchStudent.getDocument());
        assertSame(guide1, actualAdmittedResearchStudent.getGuide());
        assertEquals(123L, actualAdmittedResearchStudent.getId().longValue());
        assertSame(fromResult1, actualAdmittedResearchStudent.getRegistrationDate());
        assertSame(researchProgram1, actualAdmittedResearchStudent.getResearchProgram());
        assertEquals("Dr", actualAdmittedResearchStudent.getTopicTitle());
    }
}

