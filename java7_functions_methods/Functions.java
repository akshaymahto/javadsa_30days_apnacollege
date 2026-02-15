package java7_functions_methods;

import java.util.Scanner;

//------------------------------------------------------------------------------------------------------------

//Q. 1 print a given name in a function

// import java.util.Scanner;
// public class Functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);// call kiya function ko 
//     }
// }



//------------------------------------------------------------------------------------------------------------

// Q. 2 Make a function to add 2 numbers and return the sum.

// import java.util.*;

// public class Functions {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b; // sum variable jo yaha banaya hai wo calculateSum k liye banaya hai means new function k liye 
//         return sum;
//     }
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b); // sum variable yaha again banaya hai ab ye main function k liye banaya hai
//         System.out.println("Sum of 2 numbers is: " + sum);
//     }
// }

//------------------------------------------------------------------------------------------------------------

// Q.3  Make a function to multiply 2 Numbers and return  the product

// import java.util.*;

// public class Functions {
//     public static int calculateProduct(int a, int b){
//         return a*b; // ham yaha naya variable nhi bhi banaye tho chalega because multiple product ko direct likh sakte hai

//     }
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//      // yaha naya variable banane ka jarurat nhi han multiply karna hai esliye ham direct print v kara sakte hai
//         System.out.println("Product of 2 numbers is : " + calculateProduct(a, b));
        
//     }
// }

//------------------------------------------------------------------------------------------------------------

//Q. 4. Find the factorial of a number

import java.util.*;

public class Functions {
    public static void printFactorial(int n){
        //loop
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i =n; i>=1; i--){
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;

    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}