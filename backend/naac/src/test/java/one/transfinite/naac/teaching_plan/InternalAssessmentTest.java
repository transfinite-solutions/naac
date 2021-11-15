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

class InternalAssessmentTest {
    @Test
    void testConstructor() {
        InternalAssessment actualInternalAssessment = new InternalAssessment();
        ArrayList<AttainmentLevel> attainmentLevelList = new ArrayList<AttainmentLevel>();
        actualInternalAssessment.setAttainmentsLevels(attainmentLevelList);
        ArrayList<DistributedMark> distributedMarkList = new ArrayList<DistributedMark>();
        actualInternalAssessment.setDistributedMarks(distributedMarkList);
        actualInternalAssessment.setId(123L);
        actualInternalAssessment.setInternalTest("Internal Test");
        ArrayList<RequiredAttainment> requiredAttainmentList = new ArrayList<RequiredAttainment>();
        actualInternalAssessment.setRequiredAttainment(requiredAttainmentList);
        ArrayList<StudentCourseMapping> studentCourseMappingList = new ArrayList<StudentCourseMapping>();
        actualInternalAssessment.setStudentCourseMappings(studentCourseMappingList);
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
        TeachingPlan teachingPlan = new TeachingPlan();
        ArrayList<TeachingOutcome> teachingOutcomeList = new ArrayList<TeachingOutcome>();
        teachingPlan.setTeachingOutcomes(teachingOutcomeList);
        teachingPlan.setSemester("Semester");
        teachingPlan.setId(123L);
        teachingPlan.setAcademicYear("Academic Year");
        teachingPlan.setCourse(course);
        ArrayList<CourseLecture> courseLectureList = new ArrayList<CourseLecture>();
        teachingPlan.setCourseLecture(courseLectureList);
        teachingPlan.setTpClass("Tp Class");
        teachingPlan.setDivision("Division");
        actualInternalAssessment.setTeachingPlan(teachingPlan);
        actualInternalAssessment.setTestType("Test Type");
        actualInternalAssessment.setTotalMarks(1L);
        List<AttainmentLevel> attainmentsLevels = actualInternalAssessment.getAttainmentsLevels();
        assertSame(attainmentLevelList, attainmentsLevels);
        assertEquals(distributedMarkList, attainmentsLevels);
        assertEquals(requiredAttainmentList, attainmentsLevels);
        assertEquals(studentCourseMappingList, attainmentsLevels);
        assertEquals(teachingOutcomeList, attainmentsLevels);
        assertEquals(courseList, attainmentsLevels);
        assertEquals(admittedStudentList, attainmentsLevels);
        assertEquals(programList, attainmentsLevels);
        assertEquals(courseLectureList, attainmentsLevels);
        List<DistributedMark> distributedMarks = actualInternalAssessment.getDistributedMarks();
        assertSame(distributedMarkList, distributedMarks);
        assertEquals(requiredAttainmentList, distributedMarks);
        assertEquals(teachingOutcomeList, distributedMarks);
        assertEquals(courseList, distributedMarks);
        assertEquals(admittedStudentList, distributedMarks);
        assertEquals(programList, distributedMarks);
        assertEquals(courseLectureList, distributedMarks);
        assertEquals(attainmentsLevels, distributedMarks);
        List<StudentCourseMapping> studentCourseMappings = actualInternalAssessment.getStudentCourseMappings();
        assertEquals(studentCourseMappings, distributedMarks);
        assertEquals(123L, actualInternalAssessment.getId().longValue());
        assertEquals("Internal Test", actualInternalAssessment.getInternalTest());
        List<RequiredAttainment> requiredAttainment = actualInternalAssessment.getRequiredAttainment();
        assertSame(requiredAttainmentList, requiredAttainment);
        assertEquals(teachingOutcomeList, requiredAttainment);
        assertEquals(courseList, requiredAttainment);
        assertEquals(admittedStudentList, requiredAttainment);
        assertEquals(programList, requiredAttainment);
        assertEquals(courseLectureList, requiredAttainment);
        assertEquals(attainmentsLevels, requiredAttainment);
        assertEquals(distributedMarks, requiredAttainment);
        assertEquals(studentCourseMappings, requiredAttainment);
        assertSame(studentCourseMappingList, studentCourseMappings);
        assertEquals(distributedMarkList, studentCourseMappings);
        assertEquals(requiredAttainmentList, studentCourseMappings);
        assertEquals(teachingOutcomeList, studentCourseMappings);
        assertEquals(courseList, studentCourseMappings);
        assertEquals(admittedStudentList, studentCourseMappings);
        assertEquals(programList, studentCourseMappings);
        assertEquals(courseLectureList, studentCourseMappings);
        assertEquals(attainmentsLevels, studentCourseMappings);
        assertSame(teachingPlan, actualInternalAssessment.getTeachingPlan());
        assertEquals("Test Type", actualInternalAssessment.getTestType());
        assertEquals(1L, actualInternalAssessment.getTotalMarks().longValue());
        assertEquals(
                "InternalAssessment(id=123, teachingPlan=TeachingPlan(id=123, academicYear=Academic Year, semester=Semester,"
                        + " tpClass=Tp Class, division=Division, course=Course(programId=123, year=Year, semester=Semester,"
                        + " code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), courseLecture=[], teachingOutcomes=[]),"
                        + " internalTest=Internal Test, testType=Test Type, totalMarks=1, distributedMarks=[], studentCourseMappings=[],"
                        + " attainmentsLevels=[], requiredAttainment=[])",
                actualInternalAssessment.toString());
    }

    @Test
    void testConstructor2() {
        TeachingPlan teachingPlan = new TeachingPlan();
        ArrayList<DistributedMark> distributedMarkList = new ArrayList<DistributedMark>();
        ArrayList<StudentCourseMapping> studentCourseMappingList = new ArrayList<StudentCourseMapping>();
        ArrayList<AttainmentLevel> attainmentLevelList = new ArrayList<AttainmentLevel>();
        ArrayList<RequiredAttainment> requiredAttainmentList = new ArrayList<RequiredAttainment>();
        InternalAssessment actualInternalAssessment = new InternalAssessment(123L, teachingPlan, "Internal Test",
                "Test Type", 1L, distributedMarkList, studentCourseMappingList, attainmentLevelList, requiredAttainmentList);
        ArrayList<AttainmentLevel> attainmentLevelList1 = new ArrayList<AttainmentLevel>();
        actualInternalAssessment.setAttainmentsLevels(attainmentLevelList1);
        ArrayList<DistributedMark> distributedMarkList1 = new ArrayList<DistributedMark>();
        actualInternalAssessment.setDistributedMarks(distributedMarkList1);
        actualInternalAssessment.setId(123L);
        actualInternalAssessment.setInternalTest("Internal Test");
        ArrayList<RequiredAttainment> requiredAttainmentList1 = new ArrayList<RequiredAttainment>();
        actualInternalAssessment.setRequiredAttainment(requiredAttainmentList1);
        ArrayList<StudentCourseMapping> studentCourseMappingList1 = new ArrayList<StudentCourseMapping>();
        actualInternalAssessment.setStudentCourseMappings(studentCourseMappingList1);
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
        TeachingPlan teachingPlan1 = new TeachingPlan();
        ArrayList<TeachingOutcome> teachingOutcomeList = new ArrayList<TeachingOutcome>();
        teachingPlan1.setTeachingOutcomes(teachingOutcomeList);
        teachingPlan1.setSemester("Semester");
        teachingPlan1.setId(123L);
        teachingPlan1.setAcademicYear("Academic Year");
        teachingPlan1.setCourse(course);
        ArrayList<CourseLecture> courseLectureList = new ArrayList<CourseLecture>();
        teachingPlan1.setCourseLecture(courseLectureList);
        teachingPlan1.setTpClass("Tp Class");
        teachingPlan1.setDivision("Division");
        actualInternalAssessment.setTeachingPlan(teachingPlan1);
        actualInternalAssessment.setTestType("Test Type");
        actualInternalAssessment.setTotalMarks(1L);
        List<AttainmentLevel> attainmentsLevels = actualInternalAssessment.getAttainmentsLevels();
        assertSame(attainmentLevelList1, attainmentsLevels);
        assertEquals(distributedMarkList, attainmentsLevels);
        assertEquals(studentCourseMappingList, attainmentsLevels);
        assertEquals(attainmentLevelList, attainmentsLevels);
        assertEquals(requiredAttainmentList, attainmentsLevels);
        assertEquals(distributedMarkList1, attainmentsLevels);
        assertEquals(requiredAttainmentList1, attainmentsLevels);
        assertEquals(studentCourseMappingList1, attainmentsLevels);
        assertEquals(teachingOutcomeList, attainmentsLevels);
        assertEquals(courseList, attainmentsLevels);
        assertEquals(admittedStudentList, attainmentsLevels);
        assertEquals(programList, attainmentsLevels);
        assertEquals(courseLectureList, attainmentsLevels);
        List<DistributedMark> distributedMarks = actualInternalAssessment.getDistributedMarks();
        assertSame(distributedMarkList1, distributedMarks);
        assertEquals(distributedMarkList, distributedMarks);
        assertEquals(studentCourseMappingList, distributedMarks);
        assertEquals(attainmentLevelList, distributedMarks);
        assertEquals(requiredAttainmentList, distributedMarks);
        assertEquals(requiredAttainmentList1, distributedMarks);
        assertEquals(teachingOutcomeList, distributedMarks);
        assertEquals(courseList, distributedMarks);
        assertEquals(admittedStudentList, distributedMarks);
        assertEquals(programList, distributedMarks);
        assertEquals(courseLectureList, distributedMarks);
        assertEquals(attainmentsLevels, distributedMarks);
        List<StudentCourseMapping> studentCourseMappings = actualInternalAssessment.getStudentCourseMappings();
        assertEquals(studentCourseMappings, distributedMarks);
        assertEquals(123L, actualInternalAssessment.getId().longValue());
        assertEquals("Internal Test", actualInternalAssessment.getInternalTest());
        List<RequiredAttainment> requiredAttainment = actualInternalAssessment.getRequiredAttainment();
        assertSame(requiredAttainmentList1, requiredAttainment);
        assertEquals(distributedMarkList, requiredAttainment);
        assertEquals(studentCourseMappingList, requiredAttainment);
        assertEquals(attainmentLevelList, requiredAttainment);
        assertEquals(requiredAttainmentList, requiredAttainment);
        assertEquals(teachingOutcomeList, requiredAttainment);
        assertEquals(courseList, requiredAttainment);
        assertEquals(admittedStudentList, requiredAttainment);
        assertEquals(programList, requiredAttainment);
        assertEquals(courseLectureList, requiredAttainment);
        assertEquals(attainmentsLevels, requiredAttainment);
        assertEquals(distributedMarks, requiredAttainment);
        assertEquals(studentCourseMappings, requiredAttainment);
        assertSame(studentCourseMappingList1, studentCourseMappings);
        assertEquals(distributedMarkList, studentCourseMappings);
        assertEquals(studentCourseMappingList, studentCourseMappings);
        assertEquals(attainmentLevelList, studentCourseMappings);
        assertEquals(requiredAttainmentList, studentCourseMappings);
        assertEquals(distributedMarkList1, studentCourseMappings);
        assertEquals(requiredAttainmentList1, studentCourseMappings);
        assertEquals(teachingOutcomeList, studentCourseMappings);
        assertEquals(courseList, studentCourseMappings);
        assertEquals(admittedStudentList, studentCourseMappings);
        assertEquals(programList, studentCourseMappings);
        assertEquals(courseLectureList, studentCourseMappings);
        assertEquals(attainmentsLevels, studentCourseMappings);
        assertSame(teachingPlan1, actualInternalAssessment.getTeachingPlan());
        assertEquals("Test Type", actualInternalAssessment.getTestType());
        assertEquals(1L, actualInternalAssessment.getTotalMarks().longValue());
        assertEquals(
                "InternalAssessment(id=123, teachingPlan=TeachingPlan(id=123, academicYear=Academic Year, semester=Semester,"
                        + " tpClass=Tp Class, division=Division, course=Course(programId=123, year=Year, semester=Semester,"
                        + " code=Code, name=Name, yoi=Yoi, elective=true, cbcs=true), courseLecture=[], teachingOutcomes=[]),"
                        + " internalTest=Internal Test, testType=Test Type, totalMarks=1, distributedMarks=[], studentCourseMappings=[],"
                        + " attainmentsLevels=[], requiredAttainment=[])",
                actualInternalAssessment.toString());
    }
}

