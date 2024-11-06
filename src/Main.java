public class Main {
    public static void main(String[] args) {
        System.out.println("Test Case for MyTime class below: ");
            MyTime time = new MyTime(23, 59, 59);

            System.out.println("Initial time: " + time);

            // Test nextSecond (should wrap around to 00:00:00)
            time.nextSecond();
            System.out.println("After nextSecond(): " + time);

            // Test nextMinute (should go to 00:01:00)
            time.nextMinute();
            System.out.println("After nextMinute(): " + time);

            // Test nextHour (should go to 01:01:00)
            time.nextHour();
            System.out.println("After nextHour(): " + time);

            // Reset to 00:00:00 and test previous methods
            time.setTime(0, 0, 0);
            System.out.println("\nReset to: " + time);

            // Test previousSecond (should wrap around to 23:59:59)
            time.previousSecond();
            System.out.println("After previousSecond(): " + time);

            // Test previousMinute (should go to 23:58:59)
            time.previousMinute();
            System.out.println("After previousMinute(): " + time);

            // Test previousHour (should go to 22:58:59)
            time.previousHour();
            System.out.println("After previousHour(): " + time);


    }
}