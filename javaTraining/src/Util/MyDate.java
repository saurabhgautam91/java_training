package Util;

public class MyDate {


    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        boolean isLeapYear = this.getYear() % 4 == 0;
        if (isLeapYear && month == 2 && day > 29) {
            this.day = 29;
        } else if (!isLeapYear && month == 2 && day > 28) {
            this.day = 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||
                month == 12 && day > 31) {
            this.day = 31;
        }else if ( day < 1) {
            this.day = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if (month > 12) {
            this.month = 12;
        } else if (month < 1) {
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year < 2023) {
            this.year = 2023;
        } else if (year > 2030) {
            this.year = 2030;
        }
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
