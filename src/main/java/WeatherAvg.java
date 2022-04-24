import java.util.Arrays;
import java.util.Scanner;

public class WeatherAvg {

    public static void main(String[] args) {
//        // Taking input from the user
//        System.out.print("How many days' temperatures? ");
//        Scanner scanner = new Scanner(System.in);
//        int days = scanner.nextInt();
//        System.out.println("");
//        int[] temperatures = new int[days];
//        double sumTemperature = 0;
//        for (int i = 0; i < days; i++) {
////            System.out.print("Day " + (i + 1) + "'s high temp: ");
//            System.out.printf("Day %s's high temp: ",(i+1));
//            temperatures[i] = scanner.nextInt();
//            System.out.println("");
//            sumTemperature = sumTemperature + temperatures[i];
//        }
//        double avgTemperature = (sumTemperature / days);
//        // Calculating average temperature
//        System.out.println("Average temp = " + avgTemperature);
//
//        int greaterThanAvgTemperature = 0;
//        for (int i = 0; i < days; i++) {
//            if (temperatures[i] > avgTemperature) {
//                greaterThanAvgTemperature++;
//            }
//        }
//        System.out.println(greaterThanAvgTemperature + " days were above average.");

//        int[] a = {1, 7, 5, 6, 4, 14, 11};
//        for (int i = 0; i < a.length - 1; i++) {
//            System.out.println("Comparing " + a[i] + ", " + (a[i + 1]));
//            System.out.println(a[i]+">"+a[i+1]+"= "+(a[i]>a[i+1]));
//
//            if (a[i] > a[i + 1]) {
//                a[i + 1] = a[i + 1] * 2;
//            }
//        }
//        for (int i = 0; i < a.length - 1; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        int[] array = new int[]{7,2,0,4,-1};
//        Arrays.sort(array);
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));

        int[] a1 = {4, 15, 8};
        int[] a2 = a1;          // refer to same array as a1
        a2[0] = 7;
        System.out.println(Arrays.toString(a1)); // [7, 15, 8

    }
}
