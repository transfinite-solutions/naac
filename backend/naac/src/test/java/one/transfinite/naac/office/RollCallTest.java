package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import one.transfinite.naac.user.User;
import org.junit.jupiter.api.Test;

class RollCallTest {
    @Test
    void testConstructor() {
        RollCall actualRollCall = new RollCall();
        actualRollCall.setDivision("Division");
        actualRollCall.setId(123L);
        actualRollCall.setRcClass("Rc Class");
        actualRollCall.setRollCallList("Roll Call List");
        StudentData studentData = new StudentData();
        studentData.setId(123L);
        studentData.setAcademicYear("Academic Year");
        studentData.setStudentList(new ArrayList<User>());
        studentData.setRoleCallList(new ArrayList<RollCall>());
        actualRollCall.setStudentData(studentData);
        actualRollCall.setSubject("Hello from the Dreaming Spires");
        assertEquals("Division", actualRollCall.getDivision());
        assertEquals(123L, actualRollCall.getId().longValue());
        assertEquals("Rc Class", actualRollCall.getRcClass());
        assertEquals("Roll Call List", actualRollCall.getRollCallList());
        assertSame(studentData, actualRollCall.getStudentData());
        assertEquals("Hello from the Dreaming Spires", actualRollCall.getSubject());
        assertEquals("RollCall(id=123, rcClass=Rc Class, division=Division, subject=Hello from the Dreaming Spires,"
                + " rollCallList=Roll Call List)", actualRollCall.toString());
    }

    @Test
    void testConstructor2() {
        RollCall actualRollCall = new RollCall(123L, new StudentData(), "Rc Class", "Division",
                "Hello from the Dreaming Spires", "Roll Call List");
        actualRollCall.setDivision("Division");
        actualRollCall.setId(123L);
        actualRollCall.setRcClass("Rc Class");
        actualRollCall.setRollCallList("Roll Call List");
        StudentData studentData = new StudentData();
        studentData.setId(123L);
        studentData.setAcademicYear("Academic Year");
        studentData.setStudentList(new ArrayList<User>());
        studentData.setRoleCallList(new ArrayList<RollCall>());
        actualRollCall.setStudentData(studentData);
        actualRollCall.setSubject("Hello from the Dreaming Spires");
        assertEquals("Division", actualRollCall.getDivision());
        assertEquals(123L, actualRollCall.getId().longValue());
        assertEquals("Rc Class", actualRollCall.getRcClass());
        assertEquals("Roll Call List", actualRollCall.getRollCallList());
        assertSame(studentData, actualRollCall.getStudentData());
        assertEquals("Hello from the Dreaming Spires", actualRollCall.getSubject());
        assertEquals("RollCall(id=123, rcClass=Rc Class, division=Division, subject=Hello from the Dreaming Spires,"
                + " rollCallList=Roll Call List)", actualRollCall.toString());
    }
}

