public class PyramidPatta {
    public static void main(String[] args) {
        int j, i, rows = 6;
        for (i = 0; i < rows; i++) {
            for (j = rows - i; j>1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        public static void main(String args [])
//        {
////i for rows and j for columns
////row denotes the number of rows you want to print
//            int i, j, row = 6;
////Outer loop work for rows
//            for (i=0; i<row; i++)
//            {
////inner loop work for space
//                for (j=row-i; j>1; j--)
//                {
////prints space between two stars
//                    System.out.print(" ");
//                }
////inner loop for columns
//                for (j=0; j<=i; j++ )
//                {
////prints star
//                    System.out.print("* ");
//                }
////throws the cursor in a new line after printing each line
//                System.out.println();
//            }
//        }
//    }
//
