import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDemo {
    // File IO
    public static void main(String[] args) {

        try{
           Scanner scanner = new Scanner(new File("myFolder/hello.txt"));

           while (scanner.hasNext()){
               System.out.println(scanner.next());
           }
        }catch (Exception ex ){
            System.out.println(ex.getMessage());
        }
    }
}
