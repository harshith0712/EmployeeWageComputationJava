package DailyempWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : logic to calculate employee
daily wage
* */
public class empDailyWageObject {
    private final int isFullTime=1;
    private int empRateHr;
    private int empHr;

    public int getIsFullTime() {

        return isFullTime;
    }

    public int getEmpRateHr() {

        return empRateHr;
    }

    public void setEmpRateHr(int empRateHr) {

        this.empRateHr = empRateHr;
    }

    public int getEmpHr() {

        return empHr;
    }

    public void setEmpHr(int empHr) {

        this.empHr = empHr;
    }
}
