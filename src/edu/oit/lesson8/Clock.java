package edu.oit.lesson8;

public class Clock {
    private int hour;
    private int minute;
    private String amPm;

    public static void main(String[] args) {
        Clock time = new Clock(6, 27, "PM");
        time.toTime(time.toMinute());
        System.out.println("Initial time: " + time.toString());
        
        time.advance(1);
        System.out.println("time.advance(1): " + time.toString());
        
        time.advance(30);
        System.out.println("time.advance(30): " + time.toString());
        
        time.advance(5);
        System.out.println("time.advance(5): " + time.toString());
        
        time.advance(60);
        System.out.println("time.advance(60): " + time.toString());
        
        time.advance(128);
        System.out.println("time.advance(128): " + time.toString());
        
        time.advance(180);
        System.out.println("time.advance(180): " + time.toString());
        
        time.advance(1440);
        System.out.println("time.advance(1440): " + time.toString());
        
        time.advance(21075);
        System.out.println("time.advance(21075): " + time.toString());
    }
    
    public Clock(int h, int m, String ap) {
        this.hour = h;
        this.minute = m;
        this.amPm = ap;
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getAmPm() {
        return amPm;
    }
    
    public String toString() {
        String zero = "";
        if (this.minute < 10) {
            zero = "0";
        }
        return this.hour + ":" + zero + this.minute + " " + this.amPm;
    }
    
    public int toMinute(){
        int totalMinute = 0;
        int hour24 = this.hour;
        if (this.amPm == "PM") {
            hour24 += 12;
        }
        totalMinute = hour24 * 60 + this.minute;
        
        return totalMinute;
    }
    
    public void toTime(int num) {
        int newNum = num % 1440;
        this.amPm = "AM";
        
        if (newNum >= 720) {
            this.amPm = "PM";
            newNum -= 720;
        }
        
        int remainder = newNum % 60;
        this.hour = (newNum - remainder) / 60;
        this.minute = remainder;
    }
    
    public void advance(int m) {
        if (m > 0) {
            int total = this.toMinute() + m;
            this.toTime(total);
        }
    }

}
