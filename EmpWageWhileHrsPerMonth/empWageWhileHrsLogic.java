package EmpWageWhileHrsPerMonth;
/*
@author : harshith kolagatla
Created Date : 17th october 2020
Modified Date : 18th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage while employee
hours per Month upto 100 working hours
* */
public class empWageWhileHrsLogic {
/*
Functionality : this method contains the logic
for calculating the full time and part time employee
wage for month upto 100 working days
@param empRatePerHr is taken as argument
@param numWorkingDays is taken as argument
@param totalWorkingHrs is taken as argument
@param totalSalary is returned as argument
* */
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
