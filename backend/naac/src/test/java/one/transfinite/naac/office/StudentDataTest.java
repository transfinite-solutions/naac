package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import one.transfinite.naac.user.User;
import org.junit.jupiter.api.Test;

class StudentDataTest {
    @Test
    void testConstructor() {
        StudentData actualStudentData = new StudentData();
        actualStudentData.setAcademicYear("Academic Year");
        actualStudentData.setId(123L);
        ArrayList<RollCall> rollCallList = new ArrayList<RollCall>();
        actualStudentData.setRoleCallList(rollCallList);
        ArrayList<User> userList = new ArrayList<User>();
        actualStudentData.setStudentList(userList);
        assertEquals("Academic Year", actualStudentData.getAcademicYear());
        assertEquals(123L, actualStudentData.getId().longValue());
        List<RollCall> roleCallList = actualStudentData.getRoleCallList();
        assertSame(rollCallList, roleCallList);
        List<User> studentList = actualStudentData.getStudentList();
        assertEquals(studentList, roleCallList);
        assertSame(userList, studentList);
        assertEquals(rollCallList, studentList);
        assertEquals("StudentData(id=123, academicYear=Academic Year, studentList=[], roleCallList=[])",
                actualStudentData.toString());
    }

    @Test
    void testConstructor2() {
        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<RollCall> rollCallList = new ArrayList<RollCall>();
        StudentData actualStudentData = new StudentData(123L, "Academic Year", userList, rollCallList);
        actualStudentData.setAcademicYear("Academic Year");
        actualStudentData.setId(123L);
        ArrayList<RollCall> rollCallList1 = new ArrayList<RollCall>();
        actualStudentData.setRoleCallList(rollCallList1);
        ArrayList<User> userList1 = new ArrayList<User>();
        actualStudentData.setStudentList(userList1);
        assertEquals("Academic Year", actualStudentData.getAcademicYear());
        assertEquals(123L, actualStudentData.getId().longValue());
        List<RollCall> roleCallList = actualStudentData.getRoleCallList();
        assertSame(rollCallList1, roleCallList);
        assertEquals(userList, roleCallList);
        assertEquals(rollCallList, roleCallList);
        List<User> studentList = actualStudentData.getStudentList();
        assertEquals(studentList, roleCallList);
        assertSame(userList1, studentList);
        assertEquals(userList, studentList);
        assertEquals(rollCallList, studentList);
        assertEquals(rollCallList1, studentList);
        assertEquals("StudentData(id=123, academicYear=Academic Year, studentList=[], roleCallList=[])",
                actualStudentData.toString());
    }
}

