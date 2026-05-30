package Java18_RecursionII;


// -----------------------------------------------------------------

// Move all "X" to the end of the string. 
// "axbcxxd"
// public class Recursion2 {
//     public static void moveAllx(String str, int idx, int count,String newString){
//         if(idx == str.length()){
//             for(int i=0; i<count; i++){
//                 newString += "x";
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllx(str, idx+1, count, newString);
//         }else{
//             newString += currChar;
//             moveAllx(str, idx+1, count, newString); 
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllx(str, 0, 0, "");
//     }
        
    
// }

// -----------------------------------------------------------------

// Qs. Remove duplicates in a string.

// public class Recursion2 {
//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicates(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a']){
//             removeDuplicates(str, idx+1, newString);
//         }else{
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, "");
//     }
// }

// -----------------------------------------------------------------

// Qs. Print all subsequences of a string.
// "abc"
// public class Recursion2 {
//     public static void subsequences(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         // Yes choice
//         subsequences(str, idx+1, newString + currChar);
//         // No choice
//         subsequences(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     } 
// }

// -----------------------------------------------------------------

// Qs. Print all unique subsequences of a string.
// "aaa"


// import java.util.HashSet;
// public class Recursion2 {

    
//     public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set){
//         if(idx == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currChar = str.charAt(idx);
//         // Yes choice
//         uniqueSubsequences(str, idx+1, newString + currChar, set);
//         // No choice
//         uniqueSubsequences(str, idx+1, newString, set);
//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         uniqueSubsequences(str, 0, "", set);
//     } 
// }

//-----------------------------------------------------------------
// Qs. print keypad combination.

import java.util.HashSet;

class Recursion2 {
    
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        
        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination + mapping.charAt(i));
        }
    }
public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }

}
