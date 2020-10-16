package DailyempWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate employee
daily wage
* */
public class empDailyWage {
    public static void main(String args[]) {
        empDailyWageLogic wage=new empDailyWageLogic();
        int salary=wage.DailyWage();
            System.out.println("the salary of the employee is "+salary);
    }
}
