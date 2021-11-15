package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MaintenanceExpenditureTest {
    @Test
    void testConstructor() {
        MaintenanceExpenditure actualMaintenanceExpenditure = new MaintenanceExpenditure();
        actualMaintenanceExpenditure.setAmount(10L);
        actualMaintenanceExpenditure.setFacility("Facility");
        Finance finance = new Finance();
        finance.setAcademicFacilityBudget(1L);
        finance.setFinancialYear("Financial Year");
        finance.setExpenditureWithoutSalary(1L);
        finance.setPhysicalFacilityBudget(1L);
        finance.setLibraryFacilityBudget(1L);
        finance.setBudget("Budget");
        finance.setMaintenanceExpenditure(new ArrayList<MaintenanceExpenditure>());
        finance.setAuditReport("Audit Report");
        finance.setMaintenanceFacilityBudget(1L);
        finance.setId(123L);
        finance.setExpenditureWithSalary(1L);
        finance.setAcademicFacilityExpenditure(new ArrayList<Expenditure>());
        finance.setLibraryFacilityExpenditure(new ArrayList<Expenditure>());
        finance.setPhysicalFacilityExpenditure(new ArrayList<Expenditure>());
        actualMaintenanceExpenditure.setFinance(finance);
        actualMaintenanceExpenditure.setId(123L);
        actualMaintenanceExpenditure.setItem("Item");
        assertEquals(10L, actualMaintenanceExpenditure.getAmount().longValue());
        assertEquals("Facility", actualMaintenanceExpenditure.getFacility());
        assertSame(finance, actualMaintenanceExpenditure.getFinance());
        assertEquals(123L, actualMaintenanceExpenditure.getId().longValue());
        assertEquals("Item", actualMaintenanceExpenditure.getItem());
        assertEquals("MaintenanceExpenditure(id=123, finance=Finance(id=123, financialYear=Financial Year, budget=Budget,"
                + " expenditureWithSalary=1, expenditureWithoutSalary=1, auditReport=Audit Report, physicalFacilityBudget=1,"
                + " physicalFacilityExpenditure=[], academicFacilityBudget=1, academicFacilityExpenditure=[], libraryFa"
                + "cilityBudget=1, libraryFacilityExpenditure=[], MaintenanceFacilityBudget=1, maintenanceExpenditure=[]),"
                + " item=Item, amount=10, Facility=Facility)", actualMaintenanceExpenditure.toString());
    }

    @Test
    void testConstructor2() {
        MaintenanceExpenditure actualMaintenanceExpenditure = new MaintenanceExpenditure(123L, new Finance(), "Item", 10L,
                "Facility");
        actualMaintenanceExpenditure.setAmount(10L);
        actualMaintenanceExpenditure.setFacility("Facility");
        Finance finance = new Finance();
        finance.setAcademicFacilityBudget(1L);
        finance.setFinancialYear("Financial Year");
        finance.setExpenditureWithoutSalary(1L);
        finance.setPhysicalFacilityBudget(1L);
        finance.setLibraryFacilityBudget(1L);
        finance.setBudget("Budget");
        finance.setMaintenanceExpenditure(new ArrayList<MaintenanceExpenditure>());
        finance.setAuditReport("Audit Report");
        finance.setMaintenanceFacilityBudget(1L);
        finance.setId(123L);
        finance.setExpenditureWithSalary(1L);
        finance.setAcademicFacilityExpenditure(new ArrayList<Expenditure>());
        finance.setLibraryFacilityExpenditure(new ArrayList<Expenditure>());
        finance.setPhysicalFacilityExpenditure(new ArrayList<Expenditure>());
        actualMaintenanceExpenditure.setFinance(finance);
        actualMaintenanceExpenditure.setId(123L);
        actualMaintenanceExpenditure.setItem("Item");
        assertEquals(10L, actualMaintenanceExpenditure.getAmount().longValue());
        assertEquals("Facility", actualMaintenanceExpenditure.getFacility());
        assertSame(finance, actualMaintenanceExpenditure.getFinance());
        assertEquals(123L, actualMaintenanceExpenditure.getId().longValue());
        assertEquals("Item", actualMaintenanceExpenditure.getItem());
        assertEquals("MaintenanceExpenditure(id=123, finance=Finance(id=123, financialYear=Financial Year, budget=Budget,"
                + " expenditureWithSalary=1, expenditureWithoutSalary=1, auditReport=Audit Report, physicalFacilityBudget=1,"
                + " physicalFacilityExpenditure=[], academicFacilityBudget=1, academicFacilityExpenditure=[], libraryFa"
                + "cilityBudget=1, libraryFacilityExpenditure=[], MaintenanceFacilityBudget=1, maintenanceExpenditure=[]),"
                + " item=Item, amount=10, Facility=Facility)", actualMaintenanceExpenditure.toString());
    }
}

