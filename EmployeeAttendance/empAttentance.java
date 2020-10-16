/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionaliy : program to check employee
is present or not
* */
package EmployeeAttendance;
import EmployeeAttendance.EmpAttendanceLogic;
public class empAttentance {
    public static void main (String args[]) {
        EmpAttendanceLogic attendance=new EmpAttendanceLogic();
        double present=attendance.Attendance();
        if (present>0)
            System.out.println("the attendance of the employee is present");

    }
}
