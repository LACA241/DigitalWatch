import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) throws InterruptedException {

      /*  Time time = new Time(23, 59, 59);

        while (time.isHourValid()) {
            time.decrementSecond();
            if (!time.isHourValid()){
                break;
            }
            System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
        }
        System.out.println("Game over ");
*/
        Time time1 = new Time(2024,12,31,23, 58, 35);
        while (time1.isHourValid()) {
            time1.incrementSecond();
            Thread.sleep(100L);
            System.out.println(time1.getYear()+"/"+ time1.getMonth()+"/"+ time1.getDays()+" "+time1.getHour() + ":"
                    + time1.getMinute() + ":" + time1.getSecond());
        }

    }
}