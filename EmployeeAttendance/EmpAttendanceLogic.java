package EmployeeAttendance;

public class EmpAttendanceLogic {
    int isFullTime=1;
    public double Attendance () {
        double empCheck =Math.floor(Math.random()*10)%2;
        if (empCheck==isFullTime)
            return empCheck;
        else
            return 0;
    }
}
