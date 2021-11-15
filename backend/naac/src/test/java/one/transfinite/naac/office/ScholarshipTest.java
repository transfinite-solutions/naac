package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ScholarshipTest {
    @Test
    void testConstructor() {
        Scholarship actualScholarship = new Scholarship();
        actualScholarship.setAcademicYear("Academic Year");
        actualScholarship.setAmount(10L);
        actualScholarship.setAwardingAgency("Awarding Agency");
        actualScholarship.setId(123L);
        actualScholarship.setNoOfStudent(1L);
        actualScholarship.setOtherDetail("Other Detail");
        actualScholarship.setSanctionLetter("Sanction Letter");
        actualScholarship.setScholarshipScheme("Scholarship Scheme");
        actualScholarship.setStudentList("Student List");
        assertEquals("Academic Year", actualScholarship.getAcademicYear());
        assertEquals(10L, actualScholarship.getAmount().longValue());
        assertEquals("Awarding Agency", actualScholarship.getAwardingAgency());
        assertEquals(123L, actualScholarship.getId().longValue());
        assertEquals(1L, actualScholarship.getNoOfStudent().longValue());
        assertEquals("Other Detail", actualScholarship.getOtherDetail());
        assertEquals("Sanction Letter", actualScholarship.getSanctionLetter());
        assertEquals("Scholarship Scheme", actualScholarship.getScholarshipScheme());
        assertEquals("Student List", actualScholarship.getStudentList());
        assertEquals(
                "Scholarship(id=123, academicYear=Academic Year, scholarshipScheme=Scholarship Scheme, awardingAgency=Awarding"
                        + " Agency, noOfStudent=1, amount=10, sanctionLetter=Sanction Letter, studentList=Student List,"
                        + " otherDetail=Other Detail)",
                actualScholarship.toString());
    }

    @Test
    void testConstructor2() {
        Scholarship actualScholarship = new Scholarship(123L, "Academic Year", "Scholarship Scheme", "Awarding Agency", 1L,
                10L, "Sanction Letter", "Student List", "Other Detail");
        actualScholarship.setAcademicYear("Academic Year");
        actualScholarship.setAmount(10L);
        actualScholarship.setAwardingAgency("Awarding Agency");
        actualScholarship.setId(123L);
        actualScholarship.setNoOfStudent(1L);
        actualScholarship.setOtherDetail("Other Detail");
        actualScholarship.setSanctionLetter("Sanction Letter");
        actualScholarship.setScholarshipScheme("Scholarship Scheme");
        actualScholarship.setStudentList("Student List");
        assertEquals("Academic Year", actualScholarship.getAcademicYear());
        assertEquals(10L, actualScholarship.getAmount().longValue());
        assertEquals("Awarding Agency", actualScholarship.getAwardingAgency());
        assertEquals(123L, actualScholarship.getId().longValue());
        assertEquals(1L, actualScholarship.getNoOfStudent().longValue());
        assertEquals("Other Detail", actualScholarship.getOtherDetail());
        assertEquals("Sanction Letter", actualScholarship.getSanctionLetter());
        assertEquals("Scholarship Scheme", actualScholarship.getScholarshipScheme());
        assertEquals("Student List", actualScholarship.getStudentList());
        assertEquals(
                "Scholarship(id=123, academicYear=Academic Year, scholarshipScheme=Scholarship Scheme, awardingAgency=Awarding"
                        + " Agency, noOfStudent=1, amount=10, sanctionLetter=Sanction Letter, studentList=Student List,"
                        + " otherDetail=Other Detail)",
                actualScholarship.toString());
    }
}

