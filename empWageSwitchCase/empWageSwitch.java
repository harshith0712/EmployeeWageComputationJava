package empWageSwitchCase;
import empWageSwitchCase.empWageSwitchLogic;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageSwitch {
    public static void main(String args[]) {
        empWageSwitchLogic wage = new empWageSwitchLogic();
        int salary = wage.SwitchWage();
        if(salary>0)
        System.out.println("the salary of the employee is " + salary);
    }
}
