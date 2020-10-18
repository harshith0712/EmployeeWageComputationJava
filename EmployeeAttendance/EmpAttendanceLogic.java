package EmployeeAttendance;
/*
@author harshith kolagatla
Created Date : 16th october 2020
Functionality : logic to check employee is present or not
returns the employee check
* */
public class EmpAttendanceLogic {
/*
Functionality : this function contains the employee
present or not
@param isFullTime argument taken in
@param empCheck argument is returned
* */

    public double Attendance (int isFullTime) {
        double empCheck =Math.floor(Math.random()*10)%2;
        if (empCheck==isFullTime)
            return empCheck;
        else
            return 0;
    }
}
