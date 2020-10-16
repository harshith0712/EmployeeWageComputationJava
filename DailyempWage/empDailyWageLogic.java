package DailyempWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : logic to calculate employee
daily wage
* */
public class empDailyWageLogic {
    public int DailyWage () {
        int isFullTime=1;
            double empCheck =Math.floor(Math.random()*10)%2;
            if (empCheck==isFullTime) {
                int empRateHr = 20;
                int emphr = 8;
                int salary = empRateHr * emphr;
                return salary;
            }

            else
                return 0;
    }
}
