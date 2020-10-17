package EmployeeWageForMonth;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageForMonthLogic {
    public int WageMonth() {
        int isFullTime=1;
        int isPartTime=2;
        int empHr;
        int salary,totalSalary=0;
        int empRatePerHr=20;
        int numWorkingDays=20;
        for(int day=1; day<numWorkingDays; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case isFullTime:
                    empHr = 8;
                case isPartTime:
                    empHr = 4;
                default:
                    empHr = 0;
            }
            salary=empHr*empRatePerHr;
            totalSalary=totalSalary+salary;
        }
        return totalSalary;
    }

}
