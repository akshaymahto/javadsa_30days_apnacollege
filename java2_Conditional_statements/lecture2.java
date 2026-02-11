
//------------------------------------------------------------------------------------------------------------

package java2_Conditional_statements;


// CONDITIONAL STATEMENTS
// IF,ELSE ELSE IF SWITCH BREAK

// Q. user input -age
// if (age>18) - adult
// else not adult
// sharadhha maam solution

// import java.util.*;
// // Adult and not adult  If else Statement
// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();

// if (age > 18) {
// System.out.println("Adult");
// } else {
// System.out.println("Not Adult");
// }

// }
// }




// second solution
// import java.util.*;

// // Adult and Child If else Statement
// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter age of Person:");
// int age = sc.nextInt();

// if (age > 18) {
// System.out.println("You are a Adult");
// } else {
// System.out.println("You are Child");
// }

// }
// }

//------------------------------------------------------------------------------------------------------------


// // IF ELSE FOR GIVEN NUMBER IS EVEN OR ODD BY INPUT

// import java.util.*;

// public class lecture2 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("ENTER THE NUMBER :");
// int x = sc.nextInt();
// // need to write code here for even or odd 

// if (x % 2 == 0) {
// System.out.println("Given Number is EVEN");
// } else {
// System.out.println("number is Odd");
// }

// }
// }

// shradhha maam solution 
//How to check even or add in java so basicall in java if x%2 == 0 then it will return even otherwise it will return odd number 
// 2 ÷ 2 = 1 with remainder 0
// lets suppose x is 2 then 2%2 == 0 because the remainder is 0 so thatswhy it will return even number 

// import java.util.*;

// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();

// if (x % 2 == 0) {
// System.out.println("even");
// } else {
// System.out.println("Odd");
// }

// }
// }


//------------------------------------------------------------------------------------------------------------

// //nested if statement

//first solution
// import java.util.*;

// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter number a :");
// int a = sc.nextInt();
// System.out.print("Enter number b :");
// int b = sc.nextInt();

// if (a == b) {
// System.out.println("a is equal to b");
// } else {
// if (a > b) {
// System.out.println("a is greater then b");
// } else {
// System.out.println("a is lesser then b");
// }
// }

// }

// }

//Second  solution as per sharddha maam youtube tutorial
// import java.util.*;

// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// //code
// if (a == b) {
// System.out.println("a is equal to b");
// } else {
// if (a > b) {
// System.out.println("a is greater then b");
// } else {
// System.out.println("a is lesser then b");
// }
// }

// }

// }

//------------------------------------------------------------------------------------------------------------


// //BY ELSE IF METHODE FIND 2 NUM IS GREATER OR LESSER OR EQUAL

// import java.util.*;

// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter number a :");
// int a = sc.nextInt();
// System.out.print("Enter number b :");
// int b = sc.nextInt();

// if (a == b) {
// System.out.println("a is equal to b");
// } else if (a > b) {
// System.out.println("a is greater then b");
// } else {
// System.out.println("a is lesser then b");
// }

// }
// }

// shradhha maam solution

// import java.util.*;

// public class lecture2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// if (a == b) {
// System.out.println("Equal");
// } else if (a > b) {
// System.out.println("a is greater");
// } else {
// System.out.println("a is lesser");
// }

// }
// }

//------------------------------------------------------------------------------------------------------------

// shraddha maam solution

// import java.util.*;

// public class lecture2 {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button ==1 ) {
//             System.out.println("Hello");
//         }
//         else if(button ==2 ) {
//             System.out.println("Namaste");
//         }
//         else if(button ==3 ) {
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid");
//         }
        
//     }
// }



// // SWITCH STATEMENT :

// import java.util.*;

// public class lecture2 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Button num :");
// int button = sc.nextInt();
// switch (button) {
// case 1:
// System.out.println("Hello");

// break;
// case 2:
// System.out.println("Namaste");
// break;
// case 3:
// System.out.println("Bonjour");
// break;
// default:
// System.out.println("Invalid button");
// }
// }
// }

