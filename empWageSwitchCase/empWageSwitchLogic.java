package empWageSwitchCase;
import java.lang.Enum;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageSwitchLogic {
    public int SwitchWage() {
       final int isFullTime=1;
        final int isPartTime=2;
        int empHr;
        double empCheck =Math.floor(Math.random()*10)%3;
        int i=(int)empCheck;
        switch (i) {
            case isFullTime:
                empHr=8;
                break;
            case isPartTime:
                empHr = 4;
                break;
            default:
                empHr=0;
        }
        int empRatePerHr=20;
        int salary=empHr*empRatePerHr;
        return salary;
    }
}
