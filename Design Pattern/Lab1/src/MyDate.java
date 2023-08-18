public class MyDate {
    int year;
    int day;
    int month;

    public MyDate(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString(){
        return new String(day+"/"+month+"/"+year+"/");

    }
}
