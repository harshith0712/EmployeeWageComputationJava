package EmpWageWhileHrsPerMonth;
/*
@author : harshith kolagatla
Created Date : 17th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage while employee
hours per Month
* */
public class empWageWhileHrsLogic {
    int empHrs;
    public int WageHrs(int empRatePerHr, int numWorkingDays, int totalWorkingHrs) {
        int totalSalary=0;
        int totalEmpHrs=0,totalWorkingDays=0;
        while (totalEmpHrs<totalWorkingHrs & totalWorkingDays<numWorkingDays) {
            double randomNumber = Math.floor(Math.random() * 10) % 3;
            int empCheck=(int)randomNumber;
            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkingDays+=1;
            totalEmpHrs=totalEmpHrs+empHrs;
            totalSalary=totalEmpHrs*empRatePerHr;
        }
        return totalSalary;
    }



}
