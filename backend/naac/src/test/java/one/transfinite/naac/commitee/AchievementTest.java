package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AchievementTest {
    @Test
    void testConstructor() {
        Achievement actualAchievement = new Achievement();
        actualAchievement.setAchievementCertificate("Achievement Certificate");
        actualAchievement.setAchievementLevel(AchievementLevel.International);
        actualAchievement.setAwardingAgency("Awarding Agency");
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        actualAchievement.setCommittee(committee);
        actualAchievement.setId(123L);
        actualAchievement.setNameOfAward("Name Of Award");
        actualAchievement.setYear("Year");
        assertEquals("Achievement Certificate", actualAchievement.getAchievementCertificate());
        assertEquals(AchievementLevel.International, actualAchievement.getAchievementLevel());
        assertEquals("Awarding Agency", actualAchievement.getAwardingAgency());
        assertSame(committee, actualAchievement.getCommittee());
        assertEquals(123L, actualAchievement.getId().longValue());
        assertEquals("Name Of Award", actualAchievement.getNameOfAward());
        assertEquals("Year", actualAchievement.getYear());
    }

    @Test
    void testConstructor2() {
        Achievement actualAchievement = new Achievement(123L, new Committee(), "Year", "Name Of Award", "Awarding Agency",
                AchievementLevel.International, "Achievement Certificate");
        actualAchievement.setAchievementCertificate("Achievement Certificate");
        actualAchievement.setAchievementLevel(AchievementLevel.International);
        actualAchievement.setAwardingAgency("Awarding Agency");
        Committee committee = new Committee();
        committee.setYearDetails(new ArrayList<YearDetail>());
        committee.setAchievements(new ArrayList<Achievement>());
        committee.setId(123L);
        committee.setName("Name");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        committee.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        actualAchievement.setCommittee(committee);
        actualAchievement.setId(123L);
        actualAchievement.setNameOfAward("Name Of Award");
        actualAchievement.setYear("Year");
        assertEquals("Achievement Certificate", actualAchievement.getAchievementCertificate());
        assertEquals(AchievementLevel.International, actualAchievement.getAchievementLevel());
        assertEquals("Awarding Agency", actualAchievement.getAwardingAgency());
        assertSame(committee, actualAchievement.getCommittee());
        assertEquals(123L, actualAchievement.getId().longValue());
        assertEquals("Name Of Award", actualAchievement.getNameOfAward());
        assertEquals("Year", actualAchievement.getYear());
    }
}

