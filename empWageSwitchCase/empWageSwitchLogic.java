package empWageSwitchCase;
import java.lang.Enum;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageSwitchLogic {
/*
Functionality : this method calculates the employee wage
of full time and part time using Switch case
@param : empRatePerHr is taken as argument in
@param : returns salary as argument output
* */
    public int SwitchWage(int empRatePerHr) {

        int empHr;
        double randomNumber =Math.floor(Math.random()*10)%3;
        int empCheck=(int)randomNumber;
        switch (empCheck) {
            case 1:
                System.out.println("the employee is full time employee");
                empHr=8;
                break;
            case 2:
                System.out.println("the employee is part time employee");
                empHr = 4;
                break;
            default:
                empHr=0;
        }
        int salary=empHr*empRatePerHr;
        return salary;
    }
}
