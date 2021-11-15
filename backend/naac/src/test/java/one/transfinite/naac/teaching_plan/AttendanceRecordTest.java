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

class AttendanceRecordTest {
    @Test
    void testConstructor() {
        AttendanceRecord actualAttendanceRecord = new AttendanceRecord();
        actualAttendanceRecord.setAttendClass("Attend Class");
        actualAttendanceRecord.setAttendance("Attendance");
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
        actualAttendanceRecord.setCourse(course);
        actualAttendanceRecord.setDivision("Division");
        actualAttendanceRecord.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAttendanceRecord.setMonth(fromResult);
        assertEquals("Attend Class", actualAttendanceRecord.getAttendClass());
        assertEquals("Attendance", actualAttendanceRecord.getAttendance());
        assertSame(course, actualAttendanceRecord.getCourse());
        assertEquals("Division", actualAttendanceRecord.getDivision());
        assertEquals(123L, actualAttendanceRecord.getId().longValue());
        assertSame(fromResult, actualAttendanceRecord.getMonth());
    }

    @Test
    void testConstructor2() {
        Course course = new Course();
        AttendanceRecord actualAttendanceRecord = new AttendanceRecord(123L, "Attend Class", "Division", course,
                new Date(1L), "Attendance");
        actualAttendanceRecord.setAttendClass("Attend Class");
        actualAttendanceRecord.setAttendance("Attendance");
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
        actualAttendanceRecord.setCourse(course1);
        actualAttendanceRecord.setDivision("Division");
        actualAttendanceRecord.setId(123L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualAttendanceRecord.setMonth(fromResult);
        assertEquals("Attend Class", actualAttendanceRecord.getAttendClass());
        assertEquals("Attendance", actualAttendanceRecord.getAttendance());
        assertSame(course1, actualAttendanceRecord.getCourse());
        assertEquals("Division", actualAttendanceRecord.getDivision());
        assertEquals(123L, actualAttendanceRecord.getId().longValue());
        assertSame(fromResult, actualAttendanceRecord.getMonth());
    }
}

