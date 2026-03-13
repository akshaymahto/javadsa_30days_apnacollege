
package java10_Arrays;


//------------------------------------------------------------------------------------------------------------

 // print marks 
// Creating an array (method 1)
// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         // write your code here
//         int [] marks = new int[3]; // ham ayse bhi likh sakte hai int marks [] = new int[3];
//         marks[0] = 97; //physics
//         marks[1] = 98; //chemistry
//         marks[2] = 95; //english
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

        
//         // we can solve by loop when we need to print 1000 Values

//         for(int i = 0; i < 3; i++){
//             System.out.println(marks[i]);
//         }



//     }
// }





//------------------------------------------------------------------------------------------------------------

// Creating an array (method 2)
// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//        int marks[] = {97, 98, 95};
        
//         // we can solve by loop when we need to print 1000 Values

//         for(int i = 0; i < 3; i++){
//             System.out.println(marks[i]);
//         }



//     }
// }

//------------------------------------------------------------------------------------------------------------

//numbers print 
// import java.util.*;
// public class Arrays {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers [] = new int[size];


         // output
//         for(int i =0; i<size; i++){
//             System.out.println(numbers[i]);
//         }


        
//     }
// }





//------------------------------------------------------------------------------------------------------------


// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers [] = new int[size];
         
//         //input
//         for (int i =0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }


//          //output
//         for(int i =0; i<size; i++){
//             System.out.println(numbers[i]);
//         } 


        
//     }
// }







//------------------------------------------------------------------------------------------------------------

// Q1. Take an array as input from the user. Search for a 
// given number x and print the index at which it occours.
// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers [] = new int[size];
         
//         //input
//         for (int i =0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();


//          //output
//         for(int i =0; i<size; i++){
//             System.out.println(numbers[i]);
//         } 


        
//     }
// }

//------------------------------------------------------------------------------------------------------------

// Q2. Take an array as input from the user. 
// Search for a given number x and print the index at which it occours.

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers [] = new int[size];
         
        //input
        for (int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();


         //output
        for(int i =0; i<numbers.length; i++){
            if(numbers[i] ==x) {
                System.out.println("x found at index: " + i);
            }
        } 


        
    }
}
