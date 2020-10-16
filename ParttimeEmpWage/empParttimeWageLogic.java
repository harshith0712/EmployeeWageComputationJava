package ParttimeEmpWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage
* */
public class empParttimeWageLogic {
    public int PartWage() {
        int isFullTime=1;
        int isPartTime=2;
        double empCheck =Math.floor(Math.random()*10)%3;
        if (empCheck==isFullTime) {
            int empRateHrFull = 20;
            int emphrFull = 8;
            int salaryFull = empRateHrFull * emphrFull;
            return salaryFull;
        }

        else
            if (empCheck==isPartTime) {
                int empRateHrPart = 20;
                int emphrPart = 8;
                int salaryPart = empRateHrPart * emphrPart;
                return salaryPart;
            }
                else
                    return 0;
            }
    }
