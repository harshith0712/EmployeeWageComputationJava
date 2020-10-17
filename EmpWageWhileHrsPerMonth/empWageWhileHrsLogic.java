package EmpWageWhileHrsPerMonth;
/*
@author : harshith kolagatla
Created Date : 17th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage while employee
hours per Month
* */
public class empWageWhileHrsLogic {
    public int WageHrs() {
        int isFullTime=1;
        int isPartTime=2;
        int empHr;
        int salary,totalSalary=0;
        int totalEmpHrs=0,totalWorkingDays=0;
        int empRatePerHr=20;
        int numWorkingDays=20;
        int toralWorkingHrs=100;
        while (totalEmpHrs<toralWorkingHrs & totalWorkingDays<numWorkingDays) {
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case isFullTime:
                    empHr = 8;
                case isPartTime:
                    empHr = 4;
                default:
                    empHr = 0;
            }
            totalEmpHrs=totalEmpHrs+empHr;
            totalSalary=totalEmpHrs*empRatePerHr;
        }
        return totalSalary;
    }



}
