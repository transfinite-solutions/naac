package one.transfinite.naac.program;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import one.transfinite.naac.student.AdmittedResearchStudent;
import org.junit.jupiter.api.Test;

class ResearchProgramTest {
    @Test
    void testConstructor() {
        ResearchProgram actualResearchProgram = new ResearchProgram();
        ArrayList<AdmittedResearchStudent> admittedResearchStudentList = new ArrayList<AdmittedResearchStudent>();
        actualResearchProgram.setAdmittedResearchStudents(admittedResearchStudentList);
        actualResearchProgram.setId(123L);
        actualResearchProgram.setProgramClass("Program Class");
        actualResearchProgram.setProgramName("Program Name");
        actualResearchProgram.setProgramType("Program Type");
        actualResearchProgram.setProgramYear("Program Year");
        assertSame(admittedResearchStudentList, actualResearchProgram.getAdmittedResearchStudents());
        assertEquals(123L, actualResearchProgram.getId().longValue());
        assertEquals("Program Class", actualResearchProgram.getProgramClass());
        assertEquals("Program Name", actualResearchProgram.getProgramName());
        assertEquals("Program Type", actualResearchProgram.getProgramType());
        assertEquals("Program Year", actualResearchProgram.getProgramYear());
        assertEquals("ResearchProgram(id=123, programType=Program Type, programName=Program Name, programYear=Program Year,"
                + " programClass=Program Class, admittedResearchStudents=[])", actualResearchProgram.toString());
    }

    @Test
    void testConstructor2() {
        ArrayList<AdmittedResearchStudent> admittedResearchStudentList = new ArrayList<AdmittedResearchStudent>();
        ResearchProgram actualResearchProgram = new ResearchProgram(123L, "Program Type", "Program Name", "Program Year",
                "Program Class", admittedResearchStudentList);
        ArrayList<AdmittedResearchStudent> admittedResearchStudentList1 = new ArrayList<AdmittedResearchStudent>();
        actualResearchProgram.setAdmittedResearchStudents(admittedResearchStudentList1);
        actualResearchProgram.setId(123L);
        actualResearchProgram.setProgramClass("Program Class");
        actualResearchProgram.setProgramName("Program Name");
        actualResearchProgram.setProgramType("Program Type");
        actualResearchProgram.setProgramYear("Program Year");
        List<AdmittedResearchStudent> admittedResearchStudents = actualResearchProgram.getAdmittedResearchStudents();
        assertSame(admittedResearchStudentList1, admittedResearchStudents);
        assertEquals(admittedResearchStudentList, admittedResearchStudents);
        assertEquals(123L, actualResearchProgram.getId().longValue());
        assertEquals("Program Class", actualResearchProgram.getProgramClass());
        assertEquals("Program Name", actualResearchProgram.getProgramName());
        assertEquals("Program Type", actualResearchProgram.getProgramType());
        assertEquals("Program Year", actualResearchProgram.getProgramYear());
        assertEquals("ResearchProgram(id=123, programType=Program Type, programName=Program Name, programYear=Program Year,"
                + " programClass=Program Class, admittedResearchStudents=[])", actualResearchProgram.toString());
    }
}

