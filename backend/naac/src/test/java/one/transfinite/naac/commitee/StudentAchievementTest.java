package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentAchievementTest {
    @Test
    void testConstructor() {
        StudentAchievement actualStudentAchievement = new StudentAchievement();
        actualStudentAchievement.setAchievementLevel(AchievementLevel.International);
        actualStudentAchievement.setAchievementNature("Achievement Nature");
        actualStudentAchievement.setAwardingAgency("Awarding Agency");
        actualStudentAchievement.setId(123L);
        actualStudentAchievement.setNameOfStudent("Name Of Student");
        actualStudentAchievement.setStudentCertificate("Student Certificate");
        assertEquals(AchievementLevel.International, actualStudentAchievement.getAchievementLevel());
        assertEquals("Achievement Nature", actualStudentAchievement.getAchievementNature());
        assertEquals("Awarding Agency", actualStudentAchievement.getAwardingAgency());
        assertEquals(123L, actualStudentAchievement.getId().longValue());
        assertEquals("Name Of Student", actualStudentAchievement.getNameOfStudent());
        assertEquals("Student Certificate", actualStudentAchievement.getStudentCertificate());
        assertEquals(
                "StudentAchievement(id=123, nameOfStudent=Name Of Student, awardingAgency=Awarding Agency, achievementNature"
                        + "=Achievement Nature, achievementLevel=International, studentCertificate=Student Certificate)",
                actualStudentAchievement.toString());
    }

    @Test
    void testConstructor2() {
        StudentAchievement actualStudentAchievement = new StudentAchievement(123L, "Name Of Student", "Awarding Agency",
                "Achievement Nature", AchievementLevel.International, "Student Certificate");
        actualStudentAchievement.setAchievementLevel(AchievementLevel.International);
        actualStudentAchievement.setAchievementNature("Achievement Nature");
        actualStudentAchievement.setAwardingAgency("Awarding Agency");
        actualStudentAchievement.setId(123L);
        actualStudentAchievement.setNameOfStudent("Name Of Student");
        actualStudentAchievement.setStudentCertificate("Student Certificate");
        assertEquals(AchievementLevel.International, actualStudentAchievement.getAchievementLevel());
        assertEquals("Achievement Nature", actualStudentAchievement.getAchievementNature());
        assertEquals("Awarding Agency", actualStudentAchievement.getAwardingAgency());
        assertEquals(123L, actualStudentAchievement.getId().longValue());
        assertEquals("Name Of Student", actualStudentAchievement.getNameOfStudent());
        assertEquals("Student Certificate", actualStudentAchievement.getStudentCertificate());
        assertEquals(
                "StudentAchievement(id=123, nameOfStudent=Name Of Student, awardingAgency=Awarding Agency, achievementNature"
                        + "=Achievement Nature, achievementLevel=International, studentCertificate=Student Certificate)",
                actualStudentAchievement.toString());
    }
}

