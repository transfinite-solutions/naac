package one.transfinite.naac.program;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class ProgramTest {
    @Test
    void testConstructor() {
        Program actualProgram = new Program();
        ArrayList<AdmittedStudent> admittedStudentList = new ArrayList<AdmittedStudent>();
        actualProgram.setAdmittedStudents(admittedStudentList);
        ArrayList<Course> courseList = new ArrayList<Course>();
        actualProgram.setCourses(courseList);
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        ArrayList<Program> programList = new ArrayList<Program>();
        department.setPrograms(programList);
        department.setEstablishmentYear("Establishment Year");
        actualProgram.setDepartment(department);
        actualProgram.setProgramCode("Program Code");
        actualProgram.setProgramId(123L);
        actualProgram.setProgramName("Program Name");
        actualProgram.setProgramType("Program Type");
        actualProgram.setStartYear("Start Year");
        List<AdmittedStudent> admittedStudents = actualProgram.getAdmittedStudents();
        assertSame(admittedStudentList, admittedStudents);
        assertEquals(courseList, admittedStudents);
        assertEquals(programList, admittedStudents);
        List<Course> courses = actualProgram.getCourses();
        assertSame(courseList, courses);
        assertEquals(programList, courses);
        assertEquals(admittedStudents, courses);
        assertSame(department, actualProgram.getDepartment());
        assertEquals("Program Code", actualProgram.getProgramCode());
        assertEquals(123L, actualProgram.getProgramId().longValue());
        assertEquals("Program Name", actualProgram.getProgramName());
        assertEquals("Program Type", actualProgram.getProgramType());
        assertEquals("Start Year", actualProgram.getStartYear());
        assertEquals("Program(programId=123, programType=Program Type, programName=Program Name, programCode=Program Code,"
                + " startYear=Start Year, courses=[], admittedStudents=[])", actualProgram.toString());
    }

    @Test
    void testConstructor2() {
        Department department = new Department();
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<AdmittedStudent> admittedStudentList = new ArrayList<AdmittedStudent>();
        Program actualProgram = new Program(123L, department, "Program Type", "Program Name", "Program Code", "Start Year",
                courseList, admittedStudentList);
        ArrayList<AdmittedStudent> admittedStudentList1 = new ArrayList<AdmittedStudent>();
        actualProgram.setAdmittedStudents(admittedStudentList1);
        ArrayList<Course> courseList1 = new ArrayList<Course>();
        actualProgram.setCourses(courseList1);
        Department department1 = new Department();
        department1.setId(123L);
        department1.setDepartmentName("Department Name");
        ArrayList<Program> programList = new ArrayList<Program>();
        department1.setPrograms(programList);
        department1.setEstablishmentYear("Establishment Year");
        actualProgram.setDepartment(department1);
        actualProgram.setProgramCode("Program Code");
        actualProgram.setProgramId(123L);
        actualProgram.setProgramName("Program Name");
        actualProgram.setProgramType("Program Type");
        actualProgram.setStartYear("Start Year");
        List<AdmittedStudent> admittedStudents = actualProgram.getAdmittedStudents();
        assertSame(admittedStudentList1, admittedStudents);
        assertEquals(courseList, admittedStudents);
        assertEquals(admittedStudentList, admittedStudents);
        assertEquals(courseList1, admittedStudents);
        assertEquals(programList, admittedStudents);
        List<Course> courses = actualProgram.getCourses();
        assertSame(courseList1, courses);
        assertEquals(courseList, courses);
        assertEquals(admittedStudentList, courses);
        assertEquals(programList, courses);
        assertEquals(admittedStudents, courses);
        assertSame(department1, actualProgram.getDepartment());
        assertEquals("Program Code", actualProgram.getProgramCode());
        assertEquals(123L, actualProgram.getProgramId().longValue());
        assertEquals("Program Name", actualProgram.getProgramName());
        assertEquals("Program Type", actualProgram.getProgramType());
        assertEquals("Start Year", actualProgram.getStartYear());
        assertEquals("Program(programId=123, programType=Program Type, programName=Program Name, programCode=Program Code,"
                + " startYear=Start Year, courses=[], admittedStudents=[])", actualProgram.toString());
    }
}

