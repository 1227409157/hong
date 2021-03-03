public class LeapYear {
    private int numDays=365;
    int year;
    LeapYear(int year){
        this.year=year;
    }
    Boolean isLeapYear(){
        return(((year%4==0)&&!(year%100==0))||(year%400==0));
    }
    int yearDays(){
        if  (((year %4 == 0)&&!(year%100 == 0))||(year%400 == 0)){
        numDays = 366;}
        else
        numDays = 365;
        return numDays;
    }
}
