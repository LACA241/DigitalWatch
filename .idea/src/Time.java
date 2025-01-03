public class Time extends Date {
    private int hour;
    private int minute;
    private int second;

    public Time(int year, int month, int day, int hour, int minute, int second) {
        super(year,month,day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void decrementHour() {
        hour--;
       while (!isHourValid()){
           break;
       }
    }
     public  void  incrementHour(){
        hour++;
         if (!isHourValid()){
            hour=00;
            minute=00;
            second=00;
            incrementDay();

        }
     }

    public void decrementMinute() {
        minute--;
        if (!isMinuteValid()) {
            minute = 59;
            decrementHour();
        }
    }
    public void incrementMinute(){
        minute++;
        if (!isMinuteValid()){
            minute=00;
            incrementHour();
        }
    }

    public void decrementSecond() {
        second--;
        if (!isSecondValid()) {
            second = 59;
            decrementMinute();
        }
    }
     public void incrementSecond(){
        second++;
        if (!isSecondValid()){
            second=00;
            incrementMinute();
        }
     }

    public boolean isHourValid() {
        return hour >= 00 && hour <= 23;
    }

   public boolean isMinuteValid() {
        return minute >= 00 && minute <= 59;
    }

    public boolean isSecondValid() {
        return second >= 00 && second <= 59;
    }

}
