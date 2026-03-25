package java12_strings;


//------------------------------------------------------------------------------------------------------------

// Q. print name one word only

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next(); // tony will print only if you try to print tony kumar it will not print for that we need to use scanner method called nextLine()
//         System.out.println("Your name is:" + name);
        
//     }
// }

//------------------------------------------------------------------------------------------------------------
// Q.if you want to print tony kumar then we need to used scanner method nextLine()

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Your name is:" + name);
        
//     }
// }

//------------------------------------------------------------------------------------------------------------
// Q. Concatenation (Joining 2 strings)

// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         // write your code here

//         // concatenation 
//         String firstName = "tony";
//         String secondName = "stark";
//         String fullName = firstName + " " + secondName;
//         System.out.println(fullName);

        
//     }
// }

//------------------------------------------------------------------------------------------------------------

// Q. Print length of a String


// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         // write your code here

//         // concatenation 
//         String firstName = "tony";
//         String secondName = "stark";
//         String fullName = firstName + " " + secondName;

//         //tony stark
//         System.out.println(fullName.length());

        
//     }
// }

//------------------------------------------------------------------------------------------------------------
// Q. Access characters of a string using charAt method

// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         // write your code here

//         // concatenation 
//         String firstName = "tony";
//         String secondName = "stark";
//         String fullName = firstName + " " + secondName;

//         //tony stark
//         System.out.println(fullName.length());

//         //charAt

//         for(int i =0; i<fullName.length(); i++) {
//             System.out.println(fullName.charAt(i));
//         }
        
//     }
// }
//------------------------------------------------------------------------------------------------------------

// Compare 2 strings


// import java.util.*;


// public class Strings {
//    public static void main(String args[]) {
//     //compare
//        String name1 = "Tony";
//        String name2 = "Tony";

//        //1 s1 > s2 : +ve value
//        //2 s1 = s2: 0
//        //3 s1 < s2: -ve value
    

//        if(name1.compareTo(name2) == 0) {

//               System.out.println("Strings are equal");
//          } else {
//               System.out.println("Strings are not equal");

//        }
    
//   //or

//        if(name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


//        //DO NOT USE == to check for string equality
//        //Gives correct answer here
//        if(name1 == name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


//        //Gives incorrect answer here       // q ki java k ander strings objects hoote hai or  normal  primitive types jo variable ham abhi tak padte aaye hai woo memory mein kis tarike se kaam karte hai unki alag functionling hai objects memory mein kis tarike se store hoote hai unki alag functionling hai or yaha par galat answer q aaaya iska explanation ham stringbuilder padte time yani next video k surwat mein sikh rhe hoonge jaha par ham baat kar rha hoonge ki strings java ke ander actually memory pe store kaise hoote hai or stringsbuilder naam ki class ki hame jarurat q padi jab hamare pas already strings thi thoo

//        if(new String("Tony") == new String("Tony")) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
      
//    }
// }

//------------------------------------------------------------------------------------------------------------

// Substring
// The substring of a string is a subpart of it.

//  import java.util.*;
// public class Strings {
//    public static void main(String args[]) {
//     //compare 
//        String name = "TonyStark";
     
//        System.out.println(name.substring(0, 4));
//    }
// }


//  import java.util.*;
// public class Strings {
//    public static void main(String args[]) {
//     //compare 
//        String sentence = "My name is Tony";
//        //substring(startIndex, endIndex)  endIndex is exclusive
//        String name = sentence.substring(11, sentence.length());
     
//        System.out.println(name);
//    }
// }


//or
// import java.util.*;
// public class Strings {
//     public static void main(String args[]) {
//         // compare
//         String sentence = "TonyStark";
//         String name =sentence.substring(4);
//         System.out.println(name);
//     }
// }

 //------------------------------------------------------------------------------------------------------------

 // ParseInt Method of Integer class
// public class Strings {
//    public static void main(String args[]) {
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);
//    }
// }


//------------------------------------------------------------------------------------------------------------

// ToString Method of String Class

import java.util.*;
public class Strings {
   public static void main(String args[]) {
      int number = 123;
      String str = Integer.toString(number);
      System.out.println(str.length());
      
      
   }
}
