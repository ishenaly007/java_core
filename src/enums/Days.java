package enums;

public enum Days {
    MONDAY(true, 8), TUESDAY(true, 8),
    WEDNESDAY(true, 8), THURSDAY(true, 8),
    FRIDAY(true, 8), SATURDAY(false, 8),
    SUNDAY(false, 8);

    private boolean isWorkingDay;
    private int workingHours;

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    Days(boolean isWorkingDay, int workingHours) {
        this.isWorkingDay = isWorkingDay;
        this.workingHours = workingHours;
    }

}
