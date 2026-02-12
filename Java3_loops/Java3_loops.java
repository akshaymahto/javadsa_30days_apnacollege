package Java3_loops;


// for loop 

// Q. Hello world ko 3 baar print karya jaay without loops 

// public class Java3_loops {
//     public static void main(String[] args) {
//         // write your code here
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//     }
// }
//------------------------------------------------------------------------------------------------------------ 


//Q. Hello world ko 3 ya 100 baar print karaya jaay with for loop
//  public class Java3_loops {
//      public static void main(String[] args) {
//          // write your code here
//          for(int counter = 0; counter < 3; counter = counter + 1){
//                      System.out.println("Hello World");

//          }
//      }
//  }

 // 100 baar hello world ko print kare

//  public class Java3_loops {
//      public static void main(String[] args) {
//          // write your code here
//          for(int counter = 0; counter < 100; counter = counter + 1){
//                      System.out.println("Hello World");

//          }
//      }
//  }

 // 10 baar hello world ko print karay jaay

//  public class Java3_loops {
//      public static void main(String[] args) {
//          // write your code here
//          for(int counter = 0; counter < 11; counter++){
//             System.out.println(counter); // 0 1 2 3 4 5 6 7 8 9 10 line by line 

//          }
        
//      }
//  }

 // Q. print the numbers from 0 to 10

// 10 baar hello world ko ek he line pe print karaya jaay

//  public class Java3_loops {
//      public static void main(String[] args) {
//          // write your code here
//          // we can also write counter = i. i mean we can represent counter as i
//          for(int counter = 0; counter < 11; counter++){
//             System.out.print(counter +" "); // 0 1 2 3 4 5 6 7 8 9 10 in one line 

//          }
        
//      }
//  }


//------------------------------------------------------------------------------------------------------------

// while loop
// statement :

// while (condition){
  // do something

//  }

 // Q. print the numbers from 0 to 10

//   public class Java3_loops {
//       public static void main(String[] args) {
//           // write your code here
//           int i =0;
//           while(i < 11){
//             System.out.println(i); // print 0 1 2 3 4 5 6 7 8 9 10 line by line
//             i = i + 1; // i++;
//           }

//       }
//   }

//------------------------------------------------------------------------------------------------------------

// do while loop: 

 // Q. print the numbers from 0 to 10


//  public class Java3_loops {
//      public static void main(String[] args) {
//          // write your code here
//          int i = 0;
//          do {
//             System.out.println(i);// output 0 1 2 3 4 5 6 7 8 9 10 line by line 
//             i = i + 1; // i++;
//          } while(i < 11);
//      }
//  }

//------------------------------------------------------------------------------------------------------------

//practice try to print apnacollege 

// public class Java3_loops {
//     public static void main(String[] args) {
//         // write your code here
//         int i = 12; // condition false ho jayega because i ki value badi hai esliye print kuch v nhi hooga 
//         while (i < 11){
//             System.out.println("apna college");
//         }
//     }
// }

// or 

// public class Java3_loops {
//     public static void main(String[] args) {
//         // write your code here
        
//         //while loop
//         int i = 12; // condition false ho jayega because i ki value badi hai esliye print kuch v nhi hooga 
//         while (i < 11){
//             System.out.println("apna college");
//         }

//         //do while loop

//         do {
//             System.out.println("apna college");// yaha per apna college 1 bar print hoga because while ki condition baad mein check ki jayegi
//         }while(i<11); // do while loop pe while neecha rehta hai esliye ; terminator lagana na bhule

//     }
// }

//------------------------------------------------------------------------------------------------------------

// Q. print the sum of first n Natural Numbers
//let suppose n = 4
// then 1+2+3+4 = 10 

// import java.util.*;
// public class Java3_loops {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i =1; i <=n; i++){
//           sum = sum + i;
        
//         }
//         System.out.println(sum); 


//     }
// }


// Q2. print the table of a number input by the user
    
// import java.util.*;
// public class Java3_loops {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for( int i = 1; i<=10; i++){
//           System.out.println(i*n);
//         }

//     }
// }

