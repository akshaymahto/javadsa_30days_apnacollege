package java11_2DArrays;

import java.util.Scanner;

//------------------------------------------------------------------------------------------------------------

// Qs. 3* 5 matirx where the value of 8 is in 0,1 and the value if 4 is in 1, 3 the index will start from 0.
// public class TwoDArrays {
//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         //input 
//         //rows
//         for (int i = 0; i < rows; i++){
//             for (int j = 0; j< cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         for (int i = 0; i < rows; i++){
//             for (int j = 0; j< cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }

        
//     }
// }


//------------------------------------------------------------------------------------------------------------

//Qs.Take a matrix as input from the user. Search for a given number x
// and print the indeces at which it occurs.

public class TwoDArrays {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input 
        //rows
        for (int i = 0; i < rows; i++){
            for (int j = 0; j< cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i = 0; i< rows; i++){
            for( int j =0; j <cols; j++){
                if (numbers[i][j] == 11) {
                    System.out.println("x found at locations (" + i + " , " + j + " ) ");

                }
            }
        }     
    }
}
