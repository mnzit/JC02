public class Main {

    // Primitive Datatype
    int i = 1;
    float j = 1.34f;
    double k = 1.3;
    short m = 12;
    boolean z = true;
    long x = 100;
    char nn = 'A';

    // Wrapper Datatype
    Integer ii = 1;
    Float jj;
    String name = "Abiral";

    public static void main(String[] args) {
        int numbers[] = new int[3]; // 0,1

        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Inserting: "+ i);
//            if( i == 1){
//                numbers[i] = i;
//
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]:" + numbers[i]);
        }

    }
}
