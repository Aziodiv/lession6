package enums;

public enum DaysOfWeek {
    SUNDAY(false),
    MONDAY(true);


    DaysOfWeek(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;

    }

///getter setter///
   private boolean isWorkingDay;

    public boolean getWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay){
        this.isWorkingDay = workingDay;
    }

}
