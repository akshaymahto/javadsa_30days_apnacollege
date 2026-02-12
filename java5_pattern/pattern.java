package java5_pattern;


// Solid Rectangle 
// * * * * *
// * * * * *
// * * * * *
// * * * * *


// public class pattern {
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;

//         // outer loop
//         for(int i = 1; i <= n; i++){

//             //inner loop
//             for(int j =1; j<=5; j++){
//              System.out.print("*");
  
//             }
//             System.out.println();
//         } 
//     }
    
// }

//------------------------------------------------------------------------------------------------------------

// Q. 2 Hollow Rectangle

// * * * * *
// *       *
// *       *
// * * * * *

// public class pattern {
//     public static void main(String args[]) {
//         // write your code here
//         int n = 4;
//         int m = 5;

//         // outer loop 
//         for(int i = 1; i<= n; i++){
//             // inner loop 
//             for(int j = 1; j<= m; j++){
//                 //cell -> (i, j)
//                 if(i == 1 || j == 1 || i == n || j == n){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();

        
//         }


//     }

// }
//------------------------------------------------------------------------------------------------------------

//Q. 3 Half Pyramid
// print the pattern

// *
// **
// ***
// ****

// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
//         int n = 4;

//         // outer loop
//         for(int i =1; i <= n; i++){
//             // inner loop
//             for (int j =1; j <= i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
//------------------------------------------------------------------------------------------------------------

//Q. 4 Inverted Half pyramid

// ****
// ***
// **
// *


// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
//         int n = 4;

//         // outer loop
//         for(int i =n; i >=1; i--){ // here n=4 means that number of star
//             // inner loop
//             for (int j =1; j <= i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

//------------------------------------------------------------------------------------------------------------

//Q. 5 Inverted Half pyramid (rotated by 180 degree)

//     *
//    **
//   ***
//  ****


// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
//         int n=4;

//         //outer loop -> rows print
//         for(int i =1; i<=n; i++){
//             //inner loop -> space print
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             } 
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             } 

//             System.out.println();
//         }

//     }
// }

//------------------------------------------------------------------------------------------------------------
// Q. 6 print the pattern Half pyramid with Numbers
//1 
//1 2
//1 2 3 
//1 2 3 4
//1 2 3 4 5


// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
//         int n = 5;

//         //outer loop
//         for(int i =1; i<=n; i++){
//             //inner loop
//             for(int j =1; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


//------------------------------------------------------------------------------------------------------------
// Q. 6 print the pattern inverted Half pyramid with Numbers

//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
        
//         int n = 5;

//         //outer loop
//         for(int i =1; i <=n ; i++){
//             //inner loop
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }

//     }
// }

//------------------------------------------------------------------------------------------------------------

//Q. 8 print the pattern Floyd's Triangle 

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15


// solution

// public class pattern {
//     public static void main(String[] args) {
//         // write your code here
//         int n =5;
//         int number = 1;

//         //outer loop
//         for(int i =1 ; i <= n; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(number + " ");
//                 number++; // number = number + 1
//             }
//             System.out.println();
        
//         }
//     }
// }

//------------------------------------------------------------------------------------------------------------

// Q. 9 print the pattern 0-1 Triangle

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

public class pattern {
    public static void main(String[] args) {
        // write your code here
        int n =5;

        //outer loop
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 ==0) { //even
                    System.out.print("1 ");
                }else { //odd
                    System.out.print("0 ");

                }
            }
            System.out.println();

        }


    }
}
