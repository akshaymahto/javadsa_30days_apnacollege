package java13_stringbuilder;


//------------------------------------------------------------------------------------------------------------

// Get A Character from Index

// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("Tony");
//      //char at index 0
//      System.out.println(sb.charAt(0));
//     }
        
// }

//------------------------------------------------------------------------------------------------------------
// Set a Character at Index


// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("Tony");
//      // set  at index 0
//      sb.setCharAt(0, 'P');
//      System.out.println(sb);

//     }
        
// }

//------------------------------------------------------------------------------------------------------------

//Insert a Character at some Index

// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("tony");
//      // Insert char 
//   // sb.insert(0, 'S');
//       // we want to insert n at the 2nd index in Tony string to make it Tonny
//      // sb.insert(2, 'n');
// System.out.println(sb);

//     }
        
// }


//------------------------------------------------------------------------------------------------------------

// Delete a Character at some Index

// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("tony");
//      // delete char 
//      sb.delete(0, 1);  //delete(startIndex, endIndex) where 0 index will start from 0 and end index will be 1 but it will not include 1. so it will delete char at index 0 only.
//      System.out.println(sb);

//     }
        
// }

//------------------------------------------------------------------------------------------------------------

// Append a char
//Append means to add something at the end.


// import java.util.*;
//  public class Strings {
//      public static void main(String[] args) {
//          // write your code here
//          StringBuildersb = new StringBuilder("h");
//             sb.append("e"); // str = str + "e;// sb.append() method is used to append a string or char at the end of the string builder.
//             sb.append("l"); // str = str + "l";
//             sb.append("l");
//             sb.append("o");
//             System.out.println(sb);
//      }
//  }


//or 

// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("Tony");
//      // append char 
//      sb.append(" Stark");
//      System.out.println(sb);

//     }
// }

//------------------------------------------------------------------------------------------------------------

// Print Length of String

import java.util.*;

public class Strings {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
     // print length of string  
     sb.append(" Stark");
     // System.out.println(sb);

     System.out.println(sb.length());

    }
}

//------------------------------------------------------------------------------------------------------------

// Reverse a String (using StringBuilder class)

// import java.util.*;


// public class Strings {
//    public static void main(String args[]) {
//      StringBuilder sb = new StringBuilder("HelloWorld");
    
//      for(int i=0; i<sb.length()/2; i++) {
//        int front = i;
//        int back = sb.length() - i - 1;


//        char frontChar = sb.charAt(front);
//        char backChar = sb.charAt(back);


//        sb.setCharAt(front, backChar);
//        sb.setCharAt(back, frontChar);
//      }


//      System.out.println(sb);
//    }
// }
