package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class RequiredAttainmentTest {
    @Test
    void testConstructor() {
        RequiredAttainment actualRequiredAttainment = new RequiredAttainment();
        AttainmentLevel attainmentLevel = new AttainmentLevel();
        attainmentLevel.setEndRange(10.0);
        attainmentLevel.setId(123L);
        attainmentLevel.setLevel(1L);
        attainmentLevel.setStartRange(10.0);
        actualRequiredAttainment.setAttainmentLevel(attainmentLevel);
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
        actualRequiredAttainment.setCourse(course);
        actualRequiredAttainment.setId(123L);
        assertSame(attainmentLevel, actualRequiredAttainment.getAttainmentLevel());
        assertSame(course, actualRequiredAttainment.getCourse());
        assertEquals(123L, actualRequiredAttainment.getId().longValue());
        assertEquals("RequiredAttainment(id=123, course=Course(programId=123, year=Year, semester=Semester, code=Code,"
                + " name=Name, yoi=Yoi, elective=true, cbcs=true), attainmentLevel=AttainmentLevel(id=123, level=1,"
                + " startRange=10.0, endRange=10.0))", actualRequiredAttainment.toString());
    }

    @Test
    void testConstructor2() {
        Course course = new Course();
        RequiredAttainment actualRequiredAttainment = new RequiredAttainment(123L, course, new AttainmentLevel());
        AttainmentLevel attainmentLevel = new AttainmentLevel();
        attainmentLevel.setEndRange(10.0);
        attainmentLevel.setId(123L);
        attainmentLevel.setLevel(1L);
        attainmentLevel.setStartRange(10.0);
        actualRequiredAttainment.setAttainmentLevel(attainmentLevel);
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
        actualRequiredAttainment.setCourse(course1);
        actualRequiredAttainment.setId(123L);
        assertSame(attainmentLevel, actualRequiredAttainment.getAttainmentLevel());
        assertSame(course1, actualRequiredAttainment.getCourse());
        assertEquals(123L, actualRequiredAttainment.getId().longValue());
        assertEquals("RequiredAttainment(id=123, course=Course(programId=123, year=Year, semester=Semester, code=Code,"
                + " name=Name, yoi=Yoi, elective=true, cbcs=true), attainmentLevel=AttainmentLevel(id=123, level=1,"
                + " startRange=10.0, endRange=10.0))", actualRequiredAttainment.toString());
    }
}

