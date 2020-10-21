import java.util.ArrayList;

/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 21th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per Month for multiple Companies
* */
public class EmployeeWageComputationInJava {
    public static void main(String args[]) {
        EmployeeWageObject Reliance = new EmployeeWageObject("Reliance",20,20,100);
        EmployeeWageObject Dmart = new EmployeeWageObject("D-mart",20,20,100);
        EmployeeWageObject bigBasket = new EmployeeWageObject("BigBasket",10,15,50);
        EmployeeWageLogic employeeObject= new EmployeeWageLogic();
        employeeObject.WageHrs(Reliance.getCompanyName(), Reliance.getEmpRatePerHr(), Reliance.getNumWorkingDays(), Reliance.getTotalWorkingHrs());

       // EmployeeWageLogic Dmart = new EmployeeWageLogic();
        employeeObject.WageHrs(Dmart.getCompanyName(), Dmart.getEmpRatePerHr(), Dmart.getNumWorkingDays(), Dmart.getTotalWorkingHrs());
        employeeObject.WageHrs(bigBasket.getCompanyName(),bigBasket.getEmpRatePerHr(),bigBasket.getNumWorkingDays(),bigBasket.getTotalWorkingHrs());
        ArrayList<EmployeeWageObject>list=new ArrayList<EmployeeWageObject>();
        list.add(Dmart);
        list.add(Reliance);
        list.add(bigBasket);
        for (EmployeeWageObject company : list) {
            System.out.println(company);
        }



    }

}
