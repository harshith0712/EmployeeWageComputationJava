package empWageSwitchCase;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageSwitchLogic {
    public int SwitchWage() {
        int isFullTime=1;
        int isPartTime=2;
        double empCheck =Math.floor(Math.random()*10)%3;
        switch (empCheck) {
            case isFullTime:
                int empRateHrFull = 20;
                int emphrFull = 8;
                int salaryFull = empRateHrFull * emphrFull;
                return salaryFull;
            case isPartTime:
                int empRateHrPart = 20;
                int emphrPart = 8;
                int salaryPart = empRateHrPart * emphrPart;
                return salaryPart;
            default:
                return 0;
        }
    }
}
