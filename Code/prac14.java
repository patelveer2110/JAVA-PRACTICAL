class Date{
    int day,month,year;

    Date()
    {
        day=1;
        month=1;
        year=2001;
    }
    Date(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
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
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    void displayDate(){
        System.out.println("Date : "+day+"/"+month+"/"+year);
    }

}


public class prac14 {
    public static void main(String[] args) {
        Date d1=new Date();
        Date d2=new Date(21, 10, 2005);
        Date d3=new Date();

        d3.setDay(21);
        d3.setMonth(12);
        d3.setYear(2004);

        d1.displayDate();
        d2.displayDate();
        d3.displayDate();

        System.out.println("Date d3 :");
        System.out.println("Day:"+d3.getDay());
        System.out.println("Month:"+d3.getMonth());
        System.out.println("Year:"+d3.getYear());

        
    }
}
