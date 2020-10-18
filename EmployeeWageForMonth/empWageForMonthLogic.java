package EmployeeWageForMonth;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageForMonthLogic {
    public int WageMonth(int empRatePerHr, int numWorkingDays) {
        int empHrs;
        int salary,totalSalary=0;
        for(int day=1; day<numWorkingDays; day++) {
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
            salary=empHrs*empRatePerHr;
            totalSalary=totalSalary+salary;
        }
        return totalSalary;
    }

}
