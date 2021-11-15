package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class CourseLectureTest {
    @Test
    void testConstructor() {
        CourseLecture actualCourseLecture = new CourseLecture();
        actualCourseLecture.setAssignment("Assignment");
        actualCourseLecture.setId(123L);
        actualCourseLecture.setModeOfTeaching("Mode Of Teaching");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualCourseLecture.setMonth(fromResult);
        actualCourseLecture.setNoOfLectures(1L);
        actualCourseLecture.setNofOfTutorials(1L);
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        department.setPrograms(new ArrayList<Program>());
        department.setEstablishmentYear("Establishment Year");
        Program program = new Program();
        program.setProgramCode("Program Code");
        program.setProgramName("Program Name");
        program.setCourses(new ArrayList<Course>());
        program.setProgramId(123L);
        program.setStartYear("Start Year");
        program.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program.setDepartment(department);
        program.setProgramType("Program Type");
        Course course = new Course();
        course.setProgram(program);
        course.setSemester("Semester");
        course.setElective(true);
        course.setYear("Year");
        course.setCbcs(true);
        course.setCode("Code");
        course.setName("Name");
        course.setYoi("Yoi");
        course.setProgramId(123L);
        TeachingPlan teachingPlan = new TeachingPlan();
        teachingPlan.setTeachingOutcomes(new ArrayList<TeachingOutcome>());
        teachingPlan.setSemester("Semester");
        teachingPlan.setId(123L);
        teachingPlan.setAcademicYear("Academic Year");
        teachingPlan.setCourse(course);
        teachingPlan.setCourseLecture(new ArrayList<CourseLecture>());
        teachingPlan.setTpClass("Tp Class");
        teachingPlan.setDivision("Division");
        actualCourseLecture.setTeachingPlan(teachingPlan);
        actualCourseLecture.setTopic("Topic");
        actualCourseLecture.setWeek(1L);
        assertEquals("Assignment", actualCourseLecture.getAssignment());
        assertEquals(123L, actualCourseLecture.getId().longValue());
        assertEquals("Mode Of Teaching", actualCourseLecture.getModeOfTeaching());
        assertSame(fromResult, actualCourseLecture.getMonth());
        assertEquals(1L, actualCourseLecture.getNoOfLectures().longValue());
        assertEquals(1L, actualCourseLecture.getNofOfTutorials().longValue());
        assertSame(teachingPlan, actualCourseLecture.getTeachingPlan());
        assertEquals("Topic", actualCourseLecture.getTopic());
        assertEquals(1L, actualCourseLecture.getWeek().longValue());
    }

    @Test
    void testConstructor2() {
        TeachingPlan teachingPlan = new TeachingPlan();
        CourseLecture actualCourseLecture = new CourseLecture(123L, teachingPlan, new Date(1L), 1L, 1L, 1L, "Topic",
                "Assignment", "Mode Of Teaching");
        actualCourseLecture.setAssignment("Assignment");
        actualCourseLecture.setId(123L);
        actualCourseLecture.setModeOfTeaching("Mode Of Teaching");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualCourseLecture.setMonth(fromResult);
        actualCourseLecture.setNoOfLectures(1L);
        actualCourseLecture.setNofOfTutorials(1L);
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        department.setPrograms(new ArrayList<Program>());
        department.setEstablishmentYear("Establishment Year");
        Program program = new Program();
        program.setProgramCode("Program Code");
        program.setProgramName("Program Name");
        program.setCourses(new ArrayList<Course>());
        program.setProgramId(123L);
        program.setStartYear("Start Year");
        program.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program.setDepartment(department);
        program.setProgramType("Program Type");
        Course course = new Course();
        course.setProgram(program);
        course.setSemester("Semester");
        course.setElective(true);
        course.setYear("Year");
        course.setCbcs(true);
        course.setCode("Code");
        course.setName("Name");
        course.setYoi("Yoi");
        course.setProgramId(123L);
        TeachingPlan teachingPlan1 = new TeachingPlan();
        teachingPlan1.setTeachingOutcomes(new ArrayList<TeachingOutcome>());
        teachingPlan1.setSemester("Semester");
        teachingPlan1.setId(123L);
        teachingPlan1.setAcademicYear("Academic Year");
        teachingPlan1.setCourse(course);
        teachingPlan1.setCourseLecture(new ArrayList<CourseLecture>());
        teachingPlan1.setTpClass("Tp Class");
        teachingPlan1.setDivision("Division");
        actualCourseLecture.setTeachingPlan(teachingPlan1);
        actualCourseLecture.setTopic("Topic");
        actualCourseLecture.setWeek(1L);
        assertEquals("Assignment", actualCourseLecture.getAssignment());
        assertEquals(123L, actualCourseLecture.getId().longValue());
        assertEquals("Mode Of Teaching", actualCourseLecture.getModeOfTeaching());
        assertSame(fromResult, actualCourseLecture.getMonth());
        assertEquals(1L, actualCourseLecture.getNoOfLectures().longValue());
        assertEquals(1L, actualCourseLecture.getNofOfTutorials().longValue());
        assertSame(teachingPlan1, actualCourseLecture.getTeachingPlan());
        assertEquals("Topic", actualCourseLecture.getTopic());
        assertEquals(1L, actualCourseLecture.getWeek().longValue());
    }
}

