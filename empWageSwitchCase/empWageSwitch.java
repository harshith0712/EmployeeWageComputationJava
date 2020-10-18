package empWageSwitchCase;
import empWageSwitchCase.empWageSwitchLogic;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th octtober 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageSwitch {
    public static void main(String args[]) {
        empWageSwitchObject object=new empWageSwitchObject();
        object.setEmpRatePerHr(20);
        empWageSwitchLogic wage = new empWageSwitchLogic();
        int Salary = wage.SwitchWage(object.getEmpRatePerHr());
        if(Salary>0)
        System.out.println("the salary of the employee is " + Salary);
    }
}
