class TimePeriod {
    int hours;
    int minutes;
    
    TimePeriod(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    
    int getTotalMinutes() {
        return hours * 60 + minutes;
    }
}

public class TimeDifferenceCalc36 {
    public static void main(String[] args) {
        // Create two TimePeriod objects
        TimePeriod time1 = new TimePeriod(3, 30); // 3 hours and 30 minutes
        TimePeriod time2 = new TimePeriod(2, 45); // 2 hours and 45 minutes
        
        // Calculate the difference between the two time periods
        int differenceMinutes = Math.abs(time1.getTotalMinutes() - time2.getTotalMinutes());
        int diffHours = differenceMinutes / 60;
        int diffMinutes = differenceMinutes % 60;
        
        // Display the difference
        System.out.println("Time 1: " + time1.hours + " hours " + time1.minutes + " minutes");
        System.out.println("Time 2: " + time2.hours + " hours " + time2.minutes + " minutes");
        System.out.println("Time difference: " + diffHours + " hours " + diffMinutes + " minutes");
    }
}
