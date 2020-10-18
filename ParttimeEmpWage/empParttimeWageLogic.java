package ParttimeEmpWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage
* */
public class empParttimeWageLogic {
/*
Functionality : this method contains the logic
for calculating the full time and part time employee wage
@param : isFullTime is taken as argument
@param : isPartTime is taken as argument
@param : empRatePerHr is taken as argument
@param : salary is returned as argument
* */
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
