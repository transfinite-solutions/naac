package one.transfinite.naac.course;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class CourseTest {
    @Test
    void testConstructor() {
        Course actualCourse = new Course();
        actualCourse.setCbcs(true);
        actualCourse.setCode("Code");
        actualCourse.setElective(true);
        actualCourse.setName("Name");
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
        actualCourse.setProgram(program);
        actualCourse.setProgramId(123L);
        actualCourse.setSemester("Semester");
        actualCourse.setYear("Year");
        actualCourse.setYoi("Yoi");
        assertTrue(actualCourse.getCbcs());
        assertEquals("Code", actualCourse.getCode());
        assertTrue(actualCourse.getElective());
        assertEquals("Name", actualCourse.getName());
        assertSame(program, actualCourse.getProgram());
        assertEquals(123L, actualCourse.getProgramId().longValue());
        assertEquals("Semester", actualCourse.getSemester());
        assertEquals("Year", actualCourse.getYear());
        assertEquals("Yoi", actualCourse.getYoi());
        assertEquals("Course(programId=123, year=Year, semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true,"
                + " cbcs=true)", actualCourse.toString());
    }

    @Test
    void testConstructor2() {
        Course actualCourse = new Course(123L, new Program(), "Year", "Semester", "Code", "Name", "Yoi", true, true);
        actualCourse.setCbcs(true);
        actualCourse.setCode("Code");
        actualCourse.setElective(true);
        actualCourse.setName("Name");
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
        actualCourse.setProgram(program);
        actualCourse.setProgramId(123L);
        actualCourse.setSemester("Semester");
        actualCourse.setYear("Year");
        actualCourse.setYoi("Yoi");
        assertTrue(actualCourse.getCbcs());
        assertEquals("Code", actualCourse.getCode());
        assertTrue(actualCourse.getElective());
        assertEquals("Name", actualCourse.getName());
        assertSame(program, actualCourse.getProgram());
        assertEquals(123L, actualCourse.getProgramId().longValue());
        assertEquals("Semester", actualCourse.getSemester());
        assertEquals("Year", actualCourse.getYear());
        assertEquals("Yoi", actualCourse.getYoi());
        assertEquals("Course(programId=123, year=Year, semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true,"
                + " cbcs=true)", actualCourse.toString());
    }
}

