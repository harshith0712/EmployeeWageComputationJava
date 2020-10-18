package ParttimeEmpWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage
* */
public class empParttimeWageLogic {
    int empHrs,salary;
    public int PartWage(int isFullTime, int isPartTime, int empRatePerHr ) {
        double empCheck =Math.floor(Math.random()*10)%3;
        if (empCheck==isFullTime) {
            System.out.println("the employee is full time employee");
            empHrs=8;

        }

        else
            if (empCheck==isPartTime) {

                System.out.println("the employee is part time employee");
                empHrs=4;
            }
            salary=empRatePerHr*empHrs;
            return salary;
            }
    }
