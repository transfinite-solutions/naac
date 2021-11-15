package one.transfinite.naac.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import one.transfinite.naac.program.Program;
import org.junit.jupiter.api.Test;

class DepartmentTest {
    @Test
    void testConstructor() {
        Department actualDepartment = new Department();
        actualDepartment.setDepartmentName("Department Name");
        actualDepartment.setEstablishmentYear("Establishment Year");
        actualDepartment.setId(123L);
        ArrayList<Program> programList = new ArrayList<Program>();
        actualDepartment.setPrograms(programList);
        assertEquals("Department Name", actualDepartment.getDepartmentName());
        assertEquals("Establishment Year", actualDepartment.getEstablishmentYear());
        assertEquals(123L, actualDepartment.getId().longValue());
        assertSame(programList, actualDepartment.getPrograms());
        assertEquals(
                "Department(id=123, departmentName=Department Name, establishmentYear=Establishment Year," + " programs=[])",
                actualDepartment.toString());
    }

    @Test
    void testConstructor2() {
        ArrayList<Program> programList = new ArrayList<Program>();
        Department actualDepartment = new Department(123L, "Department Name", "Establishment Year", programList);
        actualDepartment.setDepartmentName("Department Name");
        actualDepartment.setEstablishmentYear("Establishment Year");
        actualDepartment.setId(123L);
        ArrayList<Program> programList1 = new ArrayList<Program>();
        actualDepartment.setPrograms(programList1);
        assertEquals("Department Name", actualDepartment.getDepartmentName());
        assertEquals("Establishment Year", actualDepartment.getEstablishmentYear());
        assertEquals(123L, actualDepartment.getId().longValue());
        List<Program> programs = actualDepartment.getPrograms();
        assertSame(programList1, programs);
        assertEquals(programList, programs);
        assertEquals(
                "Department(id=123, departmentName=Department Name, establishmentYear=Establishment Year," + " programs=[])",
                actualDepartment.toString());
    }
}

