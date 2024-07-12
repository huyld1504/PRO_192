
public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 22;
        this.month = 5;
        this.year = 2024;
    }

    public int getDay() {
        int resulDay;
        if (this.day > 0 && this.day <= 31) {
            resulDay = this.day;
        } else {
            resulDay = -1;
        }
        return resulDay;
    }

    public int getMonth() {
        int resultMonth;
        if (this.month > 0 && this.month <= 12) {
            resultMonth = this.month;
        } else {
            resultMonth = -1;
        }
        return resultMonth;
    }

    public int getYear() {
        int resultYear;
        if (this.year > 0) {
            resultYear = this.year;
        } else {
            resultYear = -1;
        }
        return resultYear;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String str = null;

        if (this.day < 10 && this.month < 10) {
            str = String.format("dd/mm/yyyy: 0%d/0%d/%d", this.day, this.month, this.year);
        } else if (this.day < 0 && this.month >= 10) {
            str = String.format("dd/mm/yyyy: 0%d/%d/%d", this.day, this.month, this.year);
        } else if (this.day >= 10 && this.month < 10) {
            str = String.format("dd/mm/yyyy: %d/0%d/%d", this.day, this.month, this.year);
        } else {
            str = String.format("dd/mm/yyyy: %d/%d/%d", this.day, this.month, this.year);
        }

        return str;
    }

}
