package one.transfinite.naac.publication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ResearchPublicationTest {
    @Test
    void testConstructor() {
        ResearchPublication actualResearchPublication = new ResearchPublication();
        actualResearchPublication.setAcademicYear("Academic Year");
        actualResearchPublication.setApprovedByUGS(true);
        actualResearchPublication.setAuthor("JaneDoe");
        actualResearchPublication.setId(123L);
        actualResearchPublication.setIssnNo("Issn No");
        actualResearchPublication.setIssue("Issue");
        actualResearchPublication.setJournalName("Journal Name");
        actualResearchPublication.setLinkOfResearchPaper("Link Of Research Paper");
        actualResearchPublication.setPageNo("Page No");
        actualResearchPublication.setResearchPublicationType(ResearchPublicationType.Research_Article);
        actualResearchPublication.setRole("Role");
        actualResearchPublication.setTitleOfPaper("Dr");
        actualResearchPublication.setVolume("Volume");
        actualResearchPublication.setYear("Year");
        assertEquals("Academic Year", actualResearchPublication.getAcademicYear());
        assertTrue(actualResearchPublication.getApprovedByUGS());
        assertEquals("JaneDoe", actualResearchPublication.getAuthor());
        assertEquals(123L, actualResearchPublication.getId().longValue());
        assertEquals("Issn No", actualResearchPublication.getIssnNo());
        assertEquals("Issue", actualResearchPublication.getIssue());
        assertEquals("Journal Name", actualResearchPublication.getJournalName());
        assertEquals("Link Of Research Paper", actualResearchPublication.getLinkOfResearchPaper());
        assertEquals("Page No", actualResearchPublication.getPageNo());
        assertEquals(ResearchPublicationType.Research_Article, actualResearchPublication.getResearchPublicationType());
        assertEquals("Role", actualResearchPublication.getRole());
        assertEquals("Dr", actualResearchPublication.getTitleOfPaper());
        assertEquals("Volume", actualResearchPublication.getVolume());
        assertEquals("Year", actualResearchPublication.getYear());
        assertEquals("ResearchPublication(id=123, academicYear=Academic Year, researchPublicationType=Research_Article,"
                + " titleOfPaper=Dr, author=JaneDoe, journalName=Journal Name, volume=Volume, issue=Issue, pageNo=Page"
                + " No, year=Year, issnNo=Issn No, approvedByUGS=true, role=Role, linkOfResearchPaper=Link Of Research"
                + " Paper)", actualResearchPublication.toString());
    }

    @Test
    void testConstructor2() {
        ResearchPublication actualResearchPublication = new ResearchPublication(123L, "Academic Year",
                ResearchPublicationType.Research_Article, "Dr", "JaneDoe", "Journal Name", "Volume", "Issue", "Page No", "Year",
                "Issn No", true, "Role", "Link Of Research Paper");
        actualResearchPublication.setAcademicYear("Academic Year");
        actualResearchPublication.setApprovedByUGS(true);
        actualResearchPublication.setAuthor("JaneDoe");
        actualResearchPublication.setId(123L);
        actualResearchPublication.setIssnNo("Issn No");
        actualResearchPublication.setIssue("Issue");
        actualResearchPublication.setJournalName("Journal Name");
        actualResearchPublication.setLinkOfResearchPaper("Link Of Research Paper");
        actualResearchPublication.setPageNo("Page No");
        actualResearchPublication.setResearchPublicationType(ResearchPublicationType.Research_Article);
        actualResearchPublication.setRole("Role");
        actualResearchPublication.setTitleOfPaper("Dr");
        actualResearchPublication.setVolume("Volume");
        actualResearchPublication.setYear("Year");
        assertEquals("Academic Year", actualResearchPublication.getAcademicYear());
        assertTrue(actualResearchPublication.getApprovedByUGS());
        assertEquals("JaneDoe", actualResearchPublication.getAuthor());
        assertEquals(123L, actualResearchPublication.getId().longValue());
        assertEquals("Issn No", actualResearchPublication.getIssnNo());
        assertEquals("Issue", actualResearchPublication.getIssue());
        assertEquals("Journal Name", actualResearchPublication.getJournalName());
        assertEquals("Link Of Research Paper", actualResearchPublication.getLinkOfResearchPaper());
        assertEquals("Page No", actualResearchPublication.getPageNo());
        assertEquals(ResearchPublicationType.Research_Article, actualResearchPublication.getResearchPublicationType());
        assertEquals("Role", actualResearchPublication.getRole());
        assertEquals("Dr", actualResearchPublication.getTitleOfPaper());
        assertEquals("Volume", actualResearchPublication.getVolume());
        assertEquals("Year", actualResearchPublication.getYear());
        assertEquals("ResearchPublication(id=123, academicYear=Academic Year, researchPublicationType=Research_Article,"
                + " titleOfPaper=Dr, author=JaneDoe, journalName=Journal Name, volume=Volume, issue=Issue, pageNo=Page"
                + " No, year=Year, issnNo=Issn No, approvedByUGS=true, role=Role, linkOfResearchPaper=Link Of Research"
                + " Paper)", actualResearchPublication.toString());
    }
}

