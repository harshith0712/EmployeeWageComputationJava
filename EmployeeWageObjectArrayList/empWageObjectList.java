package EmployeeWageObjectArrayList;
import java.util.ArrayList;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 21th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per Month for multiple Companies
* */
public class empWageObjectList {
    public static void main(String args[]) {
        empWageObjectListObject Reliance = new empWageObjectListObject("Reliance",20,20,100);
        empWageObjectListObject Dmart = new empWageObjectListObject("D-mart",20,20,100);
        empWageObjectListObject bigBasket = new empWageObjectListObject("BigBasket",10,15,50);
        empWageObjectListLogic employeeObject= new empWageObjectListLogic();
        employeeObject.WageHrs(Reliance.getCompanyName(), Reliance.getEmpRatePerHr(), Reliance.getNumWorkingDays(), Reliance.getTotalWorkingHrs());

        // EmployeeWageLogic Dmart = new EmployeeWageLogic();
        employeeObject.WageHrs(Dmart.getCompanyName(), Dmart.getEmpRatePerHr(), Dmart.getNumWorkingDays(), Dmart.getTotalWorkingHrs());
        employeeObject.WageHrs(bigBasket.getCompanyName(),bigBasket.getEmpRatePerHr(),bigBasket.getNumWorkingDays(),bigBasket.getTotalWorkingHrs());
        ArrayList<empWageObjectListObject>list=new ArrayList<empWageObjectListObject>();
        list.add(Dmart);
        list.add(Reliance);
        list.add(bigBasket);
        for (empWageObjectListObject company : list) {
            System.out.println(company);
        }



    }


}
