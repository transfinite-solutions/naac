package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class TeachingPlanTest {
    @Test
    void testConstructor() {
        TeachingPlan actualTeachingPlan = new TeachingPlan();
        actualTeachingPlan.setAcademicYear("Academic Year");
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        ArrayList<Program> programList = new ArrayList<Program>();
        department.setPrograms(programList);
        department.setEstablishmentYear("Establishment Year");
        Program program = new Program();
        program.setProgramCode("Program Code");
        program.setProgramName("Program Name");
        ArrayList<Course> courseList = new ArrayList<Course>();
        program.setCourses(courseList);
        program.setProgramId(123L);
        program.setStartYear("Start Year");
        ArrayList<AdmittedStudent> admittedStudentList = new ArrayList<AdmittedStudent>();
        program.setAdmittedStudents(admittedStudentList);
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
        actualTeachingPlan.setCourse(course);
        ArrayList<CourseLecture> courseLectureList = new ArrayList<CourseLecture>();
        actualTeachingPlan.setCourseLecture(courseLectureList);
        actualTeachingPlan.setDivision("Division");
        actualTeachingPlan.setId(123L);
        actualTeachingPlan.setSemester("Semester");
        ArrayList<TeachingOutcome> teachingOutcomeList = new ArrayList<TeachingOutcome>();
        actualTeachingPlan.setTeachingOutcomes(teachingOutcomeList);
        actualTeachingPlan.setTpClass("Tp Class");
        assertEquals("Academic Year", actualTeachingPlan.getAcademicYear());
        assertSame(course, actualTeachingPlan.getCourse());
        List<CourseLecture> courseLecture = actualTeachingPlan.getCourseLecture();
        assertSame(courseLectureList, courseLecture);
        assertEquals(courseList, courseLecture);
        assertEquals(admittedStudentList, courseLecture);
        assertEquals(programList, courseLecture);
        List<TeachingOutcome> teachingOutcomes = actualTeachingPlan.getTeachingOutcomes();
        assertEquals(teachingOutcomes, courseLecture);
        assertEquals("Division", actualTeachingPlan.getDivision());
        assertEquals(123L, actualTeachingPlan.getId().longValue());
        assertEquals("Semester", actualTeachingPlan.getSemester());
        assertSame(teachingOutcomeList, teachingOutcomes);
        assertEquals(courseList, teachingOutcomes);
        assertEquals(admittedStudentList, teachingOutcomes);
        assertEquals(programList, teachingOutcomes);
        assertEquals(courseLectureList, teachingOutcomes);
        assertEquals("Tp Class", actualTeachingPlan.getTpClass());
        assertEquals(
                "TeachingPlan(id=123, academicYear=Academic Year, semester=Semester, tpClass=Tp Class, division=Division,"
                        + " course=Course(programId=123, year=Year, semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true,"
                        + " cbcs=true), courseLecture=[], teachingOutcomes=[])",
                actualTeachingPlan.toString());
    }

    @Test
    void testConstructor2() {
        Course course = new Course();
        ArrayList<CourseLecture> courseLectureList = new ArrayList<CourseLecture>();
        ArrayList<TeachingOutcome> teachingOutcomeList = new ArrayList<TeachingOutcome>();
        TeachingPlan actualTeachingPlan = new TeachingPlan(123L, "Academic Year", "Semester", "Tp Class", "Division",
                course, courseLectureList, teachingOutcomeList);
        actualTeachingPlan.setAcademicYear("Academic Year");
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        ArrayList<Program> programList = new ArrayList<Program>();
        department.setPrograms(programList);
        department.setEstablishmentYear("Establishment Year");
        Program program = new Program();
        program.setProgramCode("Program Code");
        program.setProgramName("Program Name");
        ArrayList<Course> courseList = new ArrayList<Course>();
        program.setCourses(courseList);
        program.setProgramId(123L);
        program.setStartYear("Start Year");
        ArrayList<AdmittedStudent> admittedStudentList = new ArrayList<AdmittedStudent>();
        program.setAdmittedStudents(admittedStudentList);
        program.setDepartment(department);
        program.setProgramType("Program Type");
        Course course1 = new Course();
        course1.setProgram(program);
        course1.setSemester("Semester");
        course1.setElective(true);
        course1.setYear("Year");
        course1.setCbcs(true);
        course1.setCode("Code");
        course1.setName("Name");
        course1.setYoi("Yoi");
        course1.setProgramId(123L);
        actualTeachingPlan.setCourse(course1);
        ArrayList<CourseLecture> courseLectureList1 = new ArrayList<CourseLecture>();
        actualTeachingPlan.setCourseLecture(courseLectureList1);
        actualTeachingPlan.setDivision("Division");
        actualTeachingPlan.setId(123L);
        actualTeachingPlan.setSemester("Semester");
        ArrayList<TeachingOutcome> teachingOutcomeList1 = new ArrayList<TeachingOutcome>();
        actualTeachingPlan.setTeachingOutcomes(teachingOutcomeList1);
        actualTeachingPlan.setTpClass("Tp Class");
        assertEquals("Academic Year", actualTeachingPlan.getAcademicYear());
        assertSame(course1, actualTeachingPlan.getCourse());
        List<CourseLecture> courseLecture = actualTeachingPlan.getCourseLecture();
        assertSame(courseLectureList1, courseLecture);
        assertEquals(courseLectureList, courseLecture);
        assertEquals(teachingOutcomeList, courseLecture);
        assertEquals(courseList, courseLecture);
        assertEquals(admittedStudentList, courseLecture);
        assertEquals(programList, courseLecture);
        List<TeachingOutcome> teachingOutcomes = actualTeachingPlan.getTeachingOutcomes();
        assertEquals(teachingOutcomes, courseLecture);
        assertEquals("Division", actualTeachingPlan.getDivision());
        assertEquals(123L, actualTeachingPlan.getId().longValue());
        assertEquals("Semester", actualTeachingPlan.getSemester());
        assertSame(teachingOutcomeList1, teachingOutcomes);
        assertEquals(courseLectureList, teachingOutcomes);
        assertEquals(teachingOutcomeList, teachingOutcomes);
        assertEquals(courseList, teachingOutcomes);
        assertEquals(admittedStudentList, teachingOutcomes);
        assertEquals(programList, teachingOutcomes);
        assertEquals(courseLectureList1, teachingOutcomes);
        assertEquals("Tp Class", actualTeachingPlan.getTpClass());
        assertEquals(
                "TeachingPlan(id=123, academicYear=Academic Year, semester=Semester, tpClass=Tp Class, division=Division,"
                        + " course=Course(programId=123, year=Year, semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true,"
                        + " cbcs=true), courseLecture=[], teachingOutcomes=[])",
                actualTeachingPlan.toString());
    }
}

