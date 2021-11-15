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

class ProjectWorkTest {
    @Test
    void testConstructor() {
        ProjectWork actualProjectWork = new ProjectWork();
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
        actualProjectWork.setCourse(course);
        actualProjectWork.setDivision("Division");
        actualProjectWork.setId(123L);
        actualProjectWork.setPwClass("Pw Class");
        ArrayList<StudentProject> studentProjectList = new ArrayList<StudentProject>();
        actualProjectWork.setStudentProjects(studentProjectList);
        assertSame(course, actualProjectWork.getCourse());
        assertEquals("Division", actualProjectWork.getDivision());
        assertEquals(123L, actualProjectWork.getId().longValue());
        assertEquals("Pw Class", actualProjectWork.getPwClass());
        List<StudentProject> studentProjects = actualProjectWork.getStudentProjects();
        assertSame(studentProjectList, studentProjects);
        assertEquals(courseList, studentProjects);
        assertEquals(admittedStudentList, studentProjects);
        assertEquals(programList, studentProjects);
        assertEquals(
                "ProjectWork(id=123, pwClass=Pw Class, division=Division, course=Course(programId=123, year=Year,"
                        + " semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), studentProjects=[])",
                actualProjectWork.toString());
    }

    @Test
    void testConstructor2() {
        Course course = new Course();
        ArrayList<StudentProject> studentProjectList = new ArrayList<StudentProject>();
        ProjectWork actualProjectWork = new ProjectWork(123L, "Pw Class", "Division", course, studentProjectList);
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
        actualProjectWork.setCourse(course1);
        actualProjectWork.setDivision("Division");
        actualProjectWork.setId(123L);
        actualProjectWork.setPwClass("Pw Class");
        ArrayList<StudentProject> studentProjectList1 = new ArrayList<StudentProject>();
        actualProjectWork.setStudentProjects(studentProjectList1);
        assertSame(course1, actualProjectWork.getCourse());
        assertEquals("Division", actualProjectWork.getDivision());
        assertEquals(123L, actualProjectWork.getId().longValue());
        assertEquals("Pw Class", actualProjectWork.getPwClass());
        List<StudentProject> studentProjects = actualProjectWork.getStudentProjects();
        assertSame(studentProjectList1, studentProjects);
        assertEquals(studentProjectList, studentProjects);
        assertEquals(courseList, studentProjects);
        assertEquals(admittedStudentList, studentProjects);
        assertEquals(programList, studentProjects);
        assertEquals(
                "ProjectWork(id=123, pwClass=Pw Class, division=Division, course=Course(programId=123, year=Year,"
                        + " semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), studentProjects=[])",
                actualProjectWork.toString());
    }
}

