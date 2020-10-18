package ParttimeEmpWage;

public class empParttimeWageObject {
    private final int isFulltime=1;
    private final int isPartTime=2;
    private int empRatePerHr;

    public int getIsFulltime() {
        return isFulltime;
    }


    public int getIsPartTime() {
        return isPartTime;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }
}
