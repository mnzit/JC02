public class Main {

    public static void main(String[] args) {
        /**
         *   2 * 3
         *
         *  5 6 7
         *  3 4 5
         */


        /**
         *   3 * 2
         * 1 2
         * 1 2
         * 1 2
         */

        int a[][] = {
                {2, 0},
                {1, 9}
        };
        int b[][] = {
                {3, 9},
                {4, 7},
        };


        String[][] friends= {
                {"","*","","*","*"},
                {"*","","","","*"},
                {"","*","","",""},
                {"*","","","","*"},
                {"*","*","","*",""}
        };



 /*     0+6+0*4=6 0
        0 0

         */


        int z = a[0][1];
        System.out.println(z);

        int[][] c = new int[a.length][b[0].length];
//        System.out.println(c.length);
        for(int row = 0; row < 2; row++){
            int colLength = c[row].length;
//            System.out.println(colLength);
            for(int col = 0; col < 2; col++){
                int jLength = a[row].length;
//                System.out.println(jLength);
                for(int j = 0; j<2; j++) {
                    System.out.println( c[row][col]+ "+="+ a[row][j] +"*" +b[j][col]);
                    c[row][col] += a[row][j] * b[j][col];
                }
            }
        }

        for(int row = 0; row < c.length; row++){
            for(int col = 0; col < c[row].length; col++){
                System.out.print(c[row][col] + " ");
            }
            System.out.println();
        }
    }

}
