package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import one.transfinite.naac.report.ReportOfActivities;

import org.junit.jupiter.api.Test;

class CommitteeTest {
    @Test
    void testCanEqual() {
        assertFalse((new Committee()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        Committee committee = new Committee();

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        assertTrue(committee.canEqual(committee1));
    }

    @Test
    void testConstructor() {
        Committee actualCommittee = new Committee();
        ArrayList<Achievement> achievementList = new ArrayList<Achievement>();
        actualCommittee.setAchievements(achievementList);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualCommittee.setCreatedAt(fromResult);
        actualCommittee.setId(123L);
        actualCommittee.setName("Name");
        ArrayList<YearDetail> yearDetailList = new ArrayList<YearDetail>();
        actualCommittee.setYearDetails(yearDetailList);
        List<Achievement> achievements = actualCommittee.getAchievements();
        assertSame(achievementList, achievements);
        assertEquals(yearDetailList, achievements);
        assertSame(fromResult, actualCommittee.getCreatedAt());
        assertEquals(123L, actualCommittee.getId().longValue());
        assertEquals("Name", actualCommittee.getName());
        List<YearDetail> yearDetails = actualCommittee.getYearDetails();
        assertSame(yearDetailList, yearDetails);
        assertEquals(achievements, yearDetails);
    }

    @Test
    void testConstructor2() {
        Date createdAt = new Date(1L);
        ArrayList<YearDetail> yearDetailList = new ArrayList<YearDetail>();
        ArrayList<Achievement> achievementList = new ArrayList<Achievement>();
        Committee actualCommittee = new Committee(123L, "Name", createdAt, yearDetailList, achievementList);
        ArrayList<Achievement> achievementList1 = new ArrayList<Achievement>();
        actualCommittee.setAchievements(achievementList1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualCommittee.setCreatedAt(fromResult);
        actualCommittee.setId(123L);
        actualCommittee.setName("Name");
        ArrayList<YearDetail> yearDetailList1 = new ArrayList<YearDetail>();
        actualCommittee.setYearDetails(yearDetailList1);
        List<Achievement> achievements = actualCommittee.getAchievements();
        assertSame(achievementList1, achievements);
        assertEquals(yearDetailList, achievements);
        assertEquals(achievementList, achievements);
        assertEquals(yearDetailList1, achievements);
        assertSame(fromResult, actualCommittee.getCreatedAt());
        assertEquals(123L, actualCommittee.getId().longValue());
        assertEquals("Name", actualCommittee.getName());
        List<YearDetail> yearDetails = actualCommittee.getYearDetails();
        assertSame(yearDetailList1, yearDetails);
        assertEquals(yearDetailList, yearDetails);
        assertEquals(achievementList, yearDetails);
        assertEquals(achievements, yearDetails);
    }

    @Test
    void testEquals() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(null));
    }

    @Test
    void testEquals2() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals("Different type to Committee"));
    }

    @Test
    void testEquals3() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        assertTrue(committee.equals(committee));
        int expectedHashCodeResult = committee.hashCode();
        assertEquals(expectedHashCodeResult, committee.hashCode());
    }

    @Test
    void testEquals4() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertTrue(committee.equals(committee1));
        int expectedHashCodeResult = committee.hashCode();
        assertEquals(expectedHashCodeResult, committee1.hashCode());
    }

    @Test
    void testEquals5() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        YearDetail yearDetail = new YearDetail();
        yearDetail.setStudentAchievement(new ArrayList<StudentAchievement>());
        yearDetail.setReportOfActivities(new ArrayList<ReportOfActivities>());
        yearDetail.setMeetingRecords(new ArrayList<MeetingRecord>());
        yearDetail.setCommittee(committee);
        yearDetail.setCommitteeMembers(new ArrayList<CommitteeMember>());
        yearDetail.setId(123L);
        yearDetail.setAcademicYear("Name");
        yearDetail.setAcademicCalenders(new ArrayList<AcademicCalender>());

        ArrayList<YearDetail> yearDetailList = new ArrayList<YearDetail>();
        yearDetailList.add(yearDetail);

        Committee committee1 = new Committee();
        committee1.setYearDetails(yearDetailList);
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee2 = new Committee();
        committee2.setYearDetails(new ArrayList<YearDetail>());
        committee2.setAchievements(new ArrayList<Achievement>());
        committee2.setId(123L);
        committee2.setName("Name");
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee2.setCreatedAt(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee1.equals(committee2));
    }

    @Test
    void testEquals6() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Achievement achievement = new Achievement();
        achievement.setCommittee(committee);
        achievement.setAchievementCertificate("Name");
        achievement.setYear("Name");
        achievement.setId(123L);
        achievement.setNameOfAward("Name");
        achievement.setAchievementLevel(AchievementLevel.International);
        achievement.setAwardingAgency("Name");

        ArrayList<Achievement> achievementList = new ArrayList<Achievement>();
        achievementList.add(achievement);

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(achievementList);
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee2 = new Committee();
        committee2.setYearDetails(new ArrayList<YearDetail>());
        committee2.setAchievements(new ArrayList<Achievement>());
        committee2.setId(123L);
        committee2.setName("Name");
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee2.setCreatedAt(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee1.equals(committee2));
    }

    @Test
    void testEquals7() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(0L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }

    @Test
    void testEquals8() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(null);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }

    @Test
    void testEquals9() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName(null);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }

    @Test
    void testEquals10() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("one.transfinite.naac.commitee.Committee");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }

    @Test
    void testEquals11() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(0, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }

    @Test
    void testEquals12() {
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        committee.setCreatedAt(null);

        Committee committee1 = new Committee();
        committee1.setYearDetails(new ArrayList<YearDetail>());
        committee1.setAchievements(new ArrayList<Achievement>());
        committee1.setId(123L);
        committee1.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee1.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        assertFalse(committee.equals(committee1));
    }
}

