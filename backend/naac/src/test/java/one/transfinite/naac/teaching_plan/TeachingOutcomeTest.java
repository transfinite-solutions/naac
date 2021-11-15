package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import one.transfinite.naac.course.Course;
import one.transfinite.naac.department.Department;
import one.transfinite.naac.program.Program;
import one.transfinite.naac.student.AdmittedStudent;
import org.junit.jupiter.api.Test;

class TeachingOutcomeTest {
    @Test
    void testConstructor() {
        TeachingOutcome actualTeachingOutcome = new TeachingOutcome();
        actualTeachingOutcome.setCorrelationValue(42L);
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
        actualTeachingOutcome.setCourse(course);
        actualTeachingOutcome.setId(123L);
        Department department1 = new Department();
        department1.setId(123L);
        department1.setDepartmentName("Department Name");
        department1.setPrograms(new ArrayList<Program>());
        department1.setEstablishmentYear("Establishment Year");
        Program program1 = new Program();
        program1.setProgramCode("Program Code");
        program1.setProgramName("Program Name");
        program1.setCourses(new ArrayList<Course>());
        program1.setProgramId(123L);
        program1.setStartYear("Start Year");
        program1.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program1.setDepartment(department1);
        program1.setProgramType("Program Type");
        actualTeachingOutcome.setProgram(program1);
        Department department2 = new Department();
        department2.setId(123L);
        department2.setDepartmentName("Department Name");
        department2.setPrograms(new ArrayList<Program>());
        department2.setEstablishmentYear("Establishment Year");
        Program program2 = new Program();
        program2.setProgramCode("Program Code");
        program2.setProgramName("Program Name");
        program2.setCourses(new ArrayList<Course>());
        program2.setProgramId(123L);
        program2.setStartYear("Start Year");
        program2.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program2.setDepartment(department2);
        program2.setProgramType("Program Type");
        Course course1 = new Course();
        course1.setProgram(program2);
        course1.setSemester("Semester");
        course1.setElective(true);
        course1.setYear("Year");
        course1.setCbcs(true);
        course1.setCode("Code");
        course1.setName("Name");
        course1.setYoi("Yoi");
        course1.setProgramId(123L);
        TeachingPlan teachingPlan = new TeachingPlan();
        teachingPlan.setTeachingOutcomes(new ArrayList<TeachingOutcome>());
        teachingPlan.setSemester("Semester");
        teachingPlan.setId(123L);
        teachingPlan.setAcademicYear("Academic Year");
        teachingPlan.setCourse(course1);
        teachingPlan.setCourseLecture(new ArrayList<CourseLecture>());
        teachingPlan.setTpClass("Tp Class");
        teachingPlan.setDivision("Division");
        actualTeachingOutcome.setTeachingPlan(teachingPlan);
        assertEquals(42L, actualTeachingOutcome.getCorrelationValue().longValue());
        assertSame(course, actualTeachingOutcome.getCourse());
        assertEquals(123L, actualTeachingOutcome.getId().longValue());
        assertSame(program1, actualTeachingOutcome.getProgram());
        assertSame(teachingPlan, actualTeachingOutcome.getTeachingPlan());
        assertEquals(
                "TeachingOutcome(id=123, teachingPlan=TeachingPlan(id=123, academicYear=Academic Year, semester=Semester,"
                        + " tpClass=Tp Class, division=Division, course=Course(programId=123, year=Year, semester=Semester,"
                        + " code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), courseLecture=[], teachingOutcomes=[]),"
                        + " program=Program(programId=123, programType=Program Type, programName=Program Name, programCode=Program"
                        + " Code, startYear=Start Year, courses=[], admittedStudents=[]), course=Course(programId=123, year=Year,"
                        + " semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), correlationValue=42)",
                actualTeachingOutcome.toString());
    }

    @Test
    void testConstructor2() {
        TeachingPlan teachingPlan = new TeachingPlan();
        Program program = new Program();
        TeachingOutcome actualTeachingOutcome = new TeachingOutcome(123L, teachingPlan, program, new Course(), 42L);
        actualTeachingOutcome.setCorrelationValue(42L);
        Department department = new Department();
        department.setId(123L);
        department.setDepartmentName("Department Name");
        department.setPrograms(new ArrayList<Program>());
        department.setEstablishmentYear("Establishment Year");
        Program program1 = new Program();
        program1.setProgramCode("Program Code");
        program1.setProgramName("Program Name");
        program1.setCourses(new ArrayList<Course>());
        program1.setProgramId(123L);
        program1.setStartYear("Start Year");
        program1.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program1.setDepartment(department);
        program1.setProgramType("Program Type");
        Course course = new Course();
        course.setProgram(program1);
        course.setSemester("Semester");
        course.setElective(true);
        course.setYear("Year");
        course.setCbcs(true);
        course.setCode("Code");
        course.setName("Name");
        course.setYoi("Yoi");
        course.setProgramId(123L);
        actualTeachingOutcome.setCourse(course);
        actualTeachingOutcome.setId(123L);
        Department department1 = new Department();
        department1.setId(123L);
        department1.setDepartmentName("Department Name");
        department1.setPrograms(new ArrayList<Program>());
        department1.setEstablishmentYear("Establishment Year");
        Program program2 = new Program();
        program2.setProgramCode("Program Code");
        program2.setProgramName("Program Name");
        program2.setCourses(new ArrayList<Course>());
        program2.setProgramId(123L);
        program2.setStartYear("Start Year");
        program2.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program2.setDepartment(department1);
        program2.setProgramType("Program Type");
        actualTeachingOutcome.setProgram(program2);
        Department department2 = new Department();
        department2.setId(123L);
        department2.setDepartmentName("Department Name");
        department2.setPrograms(new ArrayList<Program>());
        department2.setEstablishmentYear("Establishment Year");
        Program program3 = new Program();
        program3.setProgramCode("Program Code");
        program3.setProgramName("Program Name");
        program3.setCourses(new ArrayList<Course>());
        program3.setProgramId(123L);
        program3.setStartYear("Start Year");
        program3.setAdmittedStudents(new ArrayList<AdmittedStudent>());
        program3.setDepartment(department2);
        program3.setProgramType("Program Type");
        Course course1 = new Course();
        course1.setProgram(program3);
        course1.setSemester("Semester");
        course1.setElective(true);
        course1.setYear("Year");
        course1.setCbcs(true);
        course1.setCode("Code");
        course1.setName("Name");
        course1.setYoi("Yoi");
        course1.setProgramId(123L);
        TeachingPlan teachingPlan1 = new TeachingPlan();
        teachingPlan1.setTeachingOutcomes(new ArrayList<TeachingOutcome>());
        teachingPlan1.setSemester("Semester");
        teachingPlan1.setId(123L);
        teachingPlan1.setAcademicYear("Academic Year");
        teachingPlan1.setCourse(course1);
        teachingPlan1.setCourseLecture(new ArrayList<CourseLecture>());
        teachingPlan1.setTpClass("Tp Class");
        teachingPlan1.setDivision("Division");
        actualTeachingOutcome.setTeachingPlan(teachingPlan1);
        assertEquals(42L, actualTeachingOutcome.getCorrelationValue().longValue());
        assertSame(course, actualTeachingOutcome.getCourse());
        assertEquals(123L, actualTeachingOutcome.getId().longValue());
        assertSame(program2, actualTeachingOutcome.getProgram());
        assertSame(teachingPlan1, actualTeachingOutcome.getTeachingPlan());
        assertEquals(
                "TeachingOutcome(id=123, teachingPlan=TeachingPlan(id=123, academicYear=Academic Year, semester=Semester,"
                        + " tpClass=Tp Class, division=Division, course=Course(programId=123, year=Year, semester=Semester,"
                        + " code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), courseLecture=[], teachingOutcomes=[]),"
                        + " program=Program(programId=123, programType=Program Type, programName=Program Name, programCode=Program"
                        + " Code, startYear=Start Year, courses=[], admittedStudents=[]), course=Course(programId=123, year=Year,"
                        + " semester=Semester, code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), correlationValue=42)",
                actualTeachingOutcome.toString());
    }
}

