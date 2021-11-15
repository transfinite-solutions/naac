package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ExpenditureTest {
    @Test
    void testConstructor() {
        Expenditure actualExpenditure = new Expenditure();
        actualExpenditure.setAmount(10L);
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
        actualExpenditure.setFinance(finance);
        actualExpenditure.setId(123L);
        actualExpenditure.setItem("Item");
        assertEquals(10L, actualExpenditure.getAmount().longValue());
        assertSame(finance, actualExpenditure.getFinance());
        assertEquals(123L, actualExpenditure.getId().longValue());
        assertEquals("Item", actualExpenditure.getItem());
        assertEquals("Expenditure(id=123, item=Item, amount=10)", actualExpenditure.toString());
    }

    @Test
    void testConstructor2() {
        Expenditure actualExpenditure = new Expenditure(123L, new Finance(), "Item", 10L);
        actualExpenditure.setAmount(10L);
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
        actualExpenditure.setFinance(finance);
        actualExpenditure.setId(123L);
        actualExpenditure.setItem("Item");
        assertEquals(10L, actualExpenditure.getAmount().longValue());
        assertSame(finance, actualExpenditure.getFinance());
        assertEquals(123L, actualExpenditure.getId().longValue());
        assertEquals("Item", actualExpenditure.getItem());
        assertEquals("Expenditure(id=123, item=Item, amount=10)", actualExpenditure.toString());
    }
}

