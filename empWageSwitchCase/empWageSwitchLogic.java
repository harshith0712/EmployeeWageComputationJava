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
        int empHr;
        double empCheck =Math.floor(Math.random()*10)%3;
        switch (empCheck) {
            case isFullTime:
                empHr=8;
            case isPartTime:
                empHr = 4;
            default:
                empHr=0;
        }
        int empRatePerHr=20;
        int salary=empHr*empRatePerHr;
        return salary;
    }
}
