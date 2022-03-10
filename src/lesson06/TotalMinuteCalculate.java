package lesson06;

public class TotalMinuteCalculate {
    public static void main(String[] args) {
        String inputTimeString = "2hrs and 5 minutes";

        String[] splitString = inputTimeString.split("and");
        String hoursString = splitString[0];
        String minutesString = splitString[1];

        int hours = Integer.parseInt(hoursString.replaceAll("[^0-9]",""));
        int minutes = Integer.parseInt(minutesString.replaceAll("[^0-9]",""));
        System.out.println("Hours get from input string: " +hours);
        System.out.println("Minutes get from input string: " +minutes);

        int totalMinutes = (hours * 60) + minutes;
        System.out.println("\n===>Total minutes is: " + totalMinutes + " minutes");


    }
}
