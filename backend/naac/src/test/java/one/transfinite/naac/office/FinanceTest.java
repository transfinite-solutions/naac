package one.transfinite.naac.office;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FinanceTest {
    @Test
    void testConstructor() {
        Finance actualFinance = new Finance();
        actualFinance.setAcademicFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList = new ArrayList<Expenditure>();
        actualFinance.setAcademicFacilityExpenditure(expenditureList);
        actualFinance.setAuditReport("Audit Report");
        actualFinance.setBudget("Budget");
        actualFinance.setExpenditureWithSalary(1L);
        actualFinance.setExpenditureWithoutSalary(1L);
        actualFinance.setFinancialYear("Financial Year");
        actualFinance.setId(123L);
        actualFinance.setLibraryFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList1 = new ArrayList<Expenditure>();
        actualFinance.setLibraryFacilityExpenditure(expenditureList1);
        ArrayList<MaintenanceExpenditure> maintenanceExpenditureList = new ArrayList<MaintenanceExpenditure>();
        actualFinance.setMaintenanceExpenditure(maintenanceExpenditureList);
        actualFinance.setMaintenanceFacilityBudget(1L);
        actualFinance.setPhysicalFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList2 = new ArrayList<Expenditure>();
        actualFinance.setPhysicalFacilityExpenditure(expenditureList2);
        assertEquals(1L, actualFinance.getAcademicFacilityBudget().longValue());
        List<Expenditure> academicFacilityExpenditure = actualFinance.getAcademicFacilityExpenditure();
        assertSame(expenditureList, academicFacilityExpenditure);
        List<Expenditure> libraryFacilityExpenditure = actualFinance.getLibraryFacilityExpenditure();
        assertEquals(libraryFacilityExpenditure, academicFacilityExpenditure);
        List<MaintenanceExpenditure> maintenanceExpenditure = actualFinance.getMaintenanceExpenditure();
        assertEquals(maintenanceExpenditure, academicFacilityExpenditure);
        List<Expenditure> physicalFacilityExpenditure = actualFinance.getPhysicalFacilityExpenditure();
        assertEquals(physicalFacilityExpenditure, academicFacilityExpenditure);
        assertEquals("Audit Report", actualFinance.getAuditReport());
        assertEquals("Budget", actualFinance.getBudget());
        assertEquals(1L, actualFinance.getExpenditureWithSalary().longValue());
        assertEquals(1L, actualFinance.getExpenditureWithoutSalary().longValue());
        assertEquals("Financial Year", actualFinance.getFinancialYear());
        assertEquals(123L, actualFinance.getId().longValue());
        assertEquals(1L, actualFinance.getLibraryFacilityBudget().longValue());
        assertSame(expenditureList1, libraryFacilityExpenditure);
        assertEquals(expenditureList, libraryFacilityExpenditure);
        assertEquals(maintenanceExpenditure, libraryFacilityExpenditure);
        assertEquals(physicalFacilityExpenditure, libraryFacilityExpenditure);
        assertSame(maintenanceExpenditureList, maintenanceExpenditure);
        assertEquals(expenditureList, maintenanceExpenditure);
        assertEquals(expenditureList1, maintenanceExpenditure);
        assertEquals(physicalFacilityExpenditure, maintenanceExpenditure);
        assertEquals(1L, actualFinance.getMaintenanceFacilityBudget().longValue());
        assertEquals(1L, actualFinance.getPhysicalFacilityBudget().longValue());
        assertSame(expenditureList2, physicalFacilityExpenditure);
        assertEquals(expenditureList, physicalFacilityExpenditure);
        assertEquals(expenditureList1, physicalFacilityExpenditure);
        assertEquals(maintenanceExpenditureList, physicalFacilityExpenditure);
        assertEquals("Finance(id=123, financialYear=Financial Year, budget=Budget, expenditureWithSalary=1, expenditureWit"
                + "houtSalary=1, auditReport=Audit Report, physicalFacilityBudget=1, physicalFacilityExpenditure=[],"
                + " academicFacilityBudget=1, academicFacilityExpenditure=[], libraryFacilityBudget=1, libraryFacilityE"
                + "xpenditure=[], MaintenanceFacilityBudget=1, maintenanceExpenditure=[])", actualFinance.toString());
    }

    @Test
    void testConstructor2() {
        ArrayList<Expenditure> expenditureList = new ArrayList<Expenditure>();
        ArrayList<Expenditure> expenditureList1 = new ArrayList<Expenditure>();
        ArrayList<Expenditure> expenditureList2 = new ArrayList<Expenditure>();
        ArrayList<MaintenanceExpenditure> maintenanceExpenditureList = new ArrayList<MaintenanceExpenditure>();
        Finance actualFinance = new Finance(123L, "Financial Year", "Budget", 1L, 1L, "Audit Report", 1L, expenditureList,
                1L, expenditureList1, 1L, expenditureList2, 1L, maintenanceExpenditureList);
        actualFinance.setAcademicFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList3 = new ArrayList<Expenditure>();
        actualFinance.setAcademicFacilityExpenditure(expenditureList3);
        actualFinance.setAuditReport("Audit Report");
        actualFinance.setBudget("Budget");
        actualFinance.setExpenditureWithSalary(1L);
        actualFinance.setExpenditureWithoutSalary(1L);
        actualFinance.setFinancialYear("Financial Year");
        actualFinance.setId(123L);
        actualFinance.setLibraryFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList4 = new ArrayList<Expenditure>();
        actualFinance.setLibraryFacilityExpenditure(expenditureList4);
        ArrayList<MaintenanceExpenditure> maintenanceExpenditureList1 = new ArrayList<MaintenanceExpenditure>();
        actualFinance.setMaintenanceExpenditure(maintenanceExpenditureList1);
        actualFinance.setMaintenanceFacilityBudget(1L);
        actualFinance.setPhysicalFacilityBudget(1L);
        ArrayList<Expenditure> expenditureList5 = new ArrayList<Expenditure>();
        actualFinance.setPhysicalFacilityExpenditure(expenditureList5);
        assertEquals(1L, actualFinance.getAcademicFacilityBudget().longValue());
        List<Expenditure> academicFacilityExpenditure = actualFinance.getAcademicFacilityExpenditure();
        assertSame(expenditureList3, academicFacilityExpenditure);
        assertEquals(expenditureList, academicFacilityExpenditure);
        assertEquals(expenditureList1, academicFacilityExpenditure);
        assertEquals(expenditureList2, academicFacilityExpenditure);
        assertEquals(maintenanceExpenditureList, academicFacilityExpenditure);
        List<Expenditure> libraryFacilityExpenditure = actualFinance.getLibraryFacilityExpenditure();
        assertEquals(libraryFacilityExpenditure, academicFacilityExpenditure);
        List<MaintenanceExpenditure> maintenanceExpenditure = actualFinance.getMaintenanceExpenditure();
        assertEquals(maintenanceExpenditure, academicFacilityExpenditure);
        List<Expenditure> physicalFacilityExpenditure = actualFinance.getPhysicalFacilityExpenditure();
        assertEquals(physicalFacilityExpenditure, academicFacilityExpenditure);
        assertEquals("Audit Report", actualFinance.getAuditReport());
        assertEquals("Budget", actualFinance.getBudget());
        assertEquals(1L, actualFinance.getExpenditureWithSalary().longValue());
        assertEquals(1L, actualFinance.getExpenditureWithoutSalary().longValue());
        assertEquals("Financial Year", actualFinance.getFinancialYear());
        assertEquals(123L, actualFinance.getId().longValue());
        assertEquals(1L, actualFinance.getLibraryFacilityBudget().longValue());
        assertSame(expenditureList4, libraryFacilityExpenditure);
        assertEquals(expenditureList, libraryFacilityExpenditure);
        assertEquals(expenditureList1, libraryFacilityExpenditure);
        assertEquals(expenditureList2, libraryFacilityExpenditure);
        assertEquals(maintenanceExpenditureList, libraryFacilityExpenditure);
        assertEquals(expenditureList3, libraryFacilityExpenditure);
        assertEquals(maintenanceExpenditure, libraryFacilityExpenditure);
        assertEquals(physicalFacilityExpenditure, libraryFacilityExpenditure);
        assertSame(maintenanceExpenditureList1, maintenanceExpenditure);
        assertEquals(expenditureList, maintenanceExpenditure);
        assertEquals(expenditureList1, maintenanceExpenditure);
        assertEquals(expenditureList2, maintenanceExpenditure);
        assertEquals(maintenanceExpenditureList, maintenanceExpenditure);
        assertEquals(expenditureList3, maintenanceExpenditure);
        assertEquals(expenditureList4, maintenanceExpenditure);
        assertEquals(physicalFacilityExpenditure, maintenanceExpenditure);
        assertEquals(1L, actualFinance.getMaintenanceFacilityBudget().longValue());
        assertEquals(1L, actualFinance.getPhysicalFacilityBudget().longValue());
        assertSame(expenditureList5, physicalFacilityExpenditure);
        assertEquals(expenditureList, physicalFacilityExpenditure);
        assertEquals(expenditureList1, physicalFacilityExpenditure);
        assertEquals(expenditureList2, physicalFacilityExpenditure);
        assertEquals(maintenanceExpenditureList, physicalFacilityExpenditure);
        assertEquals(expenditureList3, physicalFacilityExpenditure);
        assertEquals(expenditureList4, physicalFacilityExpenditure);
        assertEquals(maintenanceExpenditureList1, physicalFacilityExpenditure);
        assertEquals("Finance(id=123, financialYear=Financial Year, budget=Budget, expenditureWithSalary=1, expenditureWit"
                + "houtSalary=1, auditReport=Audit Report, physicalFacilityBudget=1, physicalFacilityExpenditure=[],"
                + " academicFacilityBudget=1, academicFacilityExpenditure=[], libraryFacilityBudget=1, libraryFacilityE"
                + "xpenditure=[], MaintenanceFacilityBudget=1, maintenanceExpenditure=[])", actualFinance.toString());
    }
}

