package EmployeeWageRefactor;

public class empWageReFactor {
    public static void main(String args[]) {
        empWageReFactorObject object = new empWageReFactorObject();
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        empWageReFactorLogic wage = new empWageReFactorLogic();
        int totalSalary = wage.WageHrs(object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());
        System.out.println("the total salary of the employee is " + totalSalary);

    }
}
