import java.io.*;               // for File
import java.util.*;             // for Scanner

public class HoursWorked {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("hours.txt"));
     /*   PrintStream out = new PrintStream(new File("hours_out.txt"));*/
        FileWriter fw = new FileWriter(new File("hours_out.txt"));
        BufferedWriter bw = new BufferedWriter(fw);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            int id = lineScan.nextInt();          // e.g. 456
            String name = lineScan.next();        // e.g. "Eric"
            double sum = 0.0;
            int count = 0;
            while (lineScan.hasNextDouble()) {
                sum = sum + lineScan.nextDouble();
                count++;
            }

            double average = sum / count;
            bw.write(name + " (ID#" + id + ") worked " +
                    sum + " hours (" + average + " hours/day)\n");

        }
        bw.close();
    }
}
