package DailyempWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : logic to calculate employee
daily wage
* */
public class empDailyWageLogic {
/*
Functionality : the method to check if the employee
is present or not and to calculate the wage
@param isFullTime argument is take in
@param empRatehr argument is taken in
@param empHr argument is taken in
@param salary value is returned as output
* */
    public int DailyWage (int isFullTime, int empRateHr, int emphr) {
            double empCheck =Math.floor(Math.random()*10)%2;
            if (empCheck==isFullTime) {
                int salary = empRateHr * emphr;
                return salary;
            }

            else
                return 0;
    }
}
