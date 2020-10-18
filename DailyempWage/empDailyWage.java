package DailyempWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program to calculate employee
daily wage
* */
public class empDailyWage {
    public static void main(String args[]) {
        empDailyWageObject object=new empDailyWageObject();
        object.setEmpHr(8);
        object.setEmpRateHr(20);

        empDailyWageLogic wage=new empDailyWageLogic();
        int salary=wage.DailyWage(object.getIsFullTime(), object.getEmpRateHr(), object.getEmpHr());
            System.out.println("the salary of the employee is "+salary);
    }
}
