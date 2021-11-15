package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class DistributedMarkTest {
    @Test
    void testConstructor() {
        DistributedMark actualDistributedMark = new DistributedMark();
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
        actualDistributedMark.setCourse(course);
        actualDistributedMark.setId(123L);
        actualDistributedMark.setTotalMark(1L);
        assertSame(course, actualDistributedMark.getCourse());
        assertEquals(123L, actualDistributedMark.getId().longValue());
        assertEquals(1L, actualDistributedMark.getTotalMark().longValue());
        assertEquals(
                "DistributedMark(id=123, course=Course(programId=123, year=Year, semester=Semester, code=Code, name=Name,"
                        + " yoi=Yoi, elective=true, cbcs=true), totalMark=1)",
                actualDistributedMark.toString());
    }

    @Test
    void testConstructor2() {
        DistributedMark actualDistributedMark = new DistributedMark(123L, new Course(), 1L);
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
        actualDistributedMark.setCourse(course);
        actualDistributedMark.setId(123L);
        actualDistributedMark.setTotalMark(1L);
        assertSame(course, actualDistributedMark.getCourse());
        assertEquals(123L, actualDistributedMark.getId().longValue());
        assertEquals(1L, actualDistributedMark.getTotalMark().longValue());
        assertEquals(
                "DistributedMark(id=123, course=Course(programId=123, year=Year, semester=Semester, code=Code, name=Name,"
                        + " yoi=Yoi, elective=true, cbcs=true), totalMark=1)",
                actualDistributedMark.toString());
    }
}

