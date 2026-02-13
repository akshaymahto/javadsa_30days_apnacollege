package Java6_advancedpattern;


//------------------------------------------------------------------------------------------------------------

// Q 10 : Butterfly pattern

// import java.util.*;


// public class advancedpattern {
//    public static void main(String args[]) {
//        int n = 4;


//        //upper part
//        for(int i=1; i<=n; i++) {
//          //1st part 
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }

//           // spaces
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }

//            //2nd part
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//             }
//            System.out.println();
//        }


//        //lower part
//        for(int i=n; i>=1; i--) {
//         //1st part
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }

//            // spaces
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }

//       // 2nd part
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//             }
//            System.out.println();
//        }
//    }   
// }



//------------------------------------------------------------------------------------------------------------

//Q. 2 Print the pattern   solid Rhombus


// import java.util.*;


// public class advancedpattern {
//    public static void main(String args[]) {
//        int n = 5;


//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }


//            //stars
//            for(int j=1; j<=n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }   
// }

//------------------------------------------------------------------------------------------------------------
//Q. 12 Print the pattern (number pyramid)

// import java.util.*;


// public class advancedpattern {
//    public static void main(String args[]) {
//        int n = 5;


//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }


//            //numbers
//            for(int j=1; j<=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }   
// }

//------------------------------------------------------------------------------------------------------------

//Q. 13 print the pattern (Palindromic pattern)
// palindromic means jo samne se or piche se same dikta hoo like BOB or 212


// import java.util.*;


// public class advancedpattern {
//    public static void main(String args[]) {
//        int n = 5;
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }


//            //first part
//            for(int j=i; j>=1; j--) {
//                System.out.print(j);
//            }


//            //second part
//            for(int j=2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }   
// }


//------------------------------------------------------------------------------------------------------------

//Q. 14 print the pattern (Diamond pattern)

import java.util.*;


public class advancedpattern {
   public static void main(String args[]) {
       int n = 5;


       //upper part
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           //stars
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


       //lower part
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }

           //stars
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}
