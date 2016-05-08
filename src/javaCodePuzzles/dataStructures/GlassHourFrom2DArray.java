package javaCodePuzzles.dataStructures;

/**
 * Created by asee2278 on 5/7/16.
 *
 * You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

 a b c
 d
 e f g
 For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 0
 Actually, there are many hourglasses in the array above. The three topmost hourglasses are the following:

 1 1 1     1 1 0     1 0 0
 1         0         0
 1 1 1     1 1 0     1 0 0
 The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

 In this problem, you have to print the largest sum among all the hourglasses in the array.

 Note: If you have already solved the problem "Java 2D array" in the data structures chapter of the Java domain, you may skip this challenge.

 Input Format

 There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

 Output Format

 Print the answer to this problem on a single line.

 Sample Input

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0
 Sample Output

 19

 Explanation

 The hourglass possessing the largest sum is:

 2 4 4
 2
 1 2 4
 *
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class GlassHourFrom2DArray {

    static List<Integer> sum = new ArrayList<Integer>();
    static int arr[][] = new int[6][6];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        for(int arr_j=0; arr_j <= 6-3; arr_j++){
           for(int arr_i=0; arr_i <= 6-3; arr_i++){

               sum.add(glassHourSum(arr_i, arr_i + 2, arr_j, arr_j + 2));

            }
        }

        System.out.println(sum);
        System.out.println(Collections.max(sum));


    }


    private static int glassHourSum(int startr, int endr,int startc, int endc ){
        int total = 0;
        for(int arr_i=startr; arr_i <= endr; arr_i++){
            for(int arr_j = startc; arr_j <= endc; arr_j++){
                if(arr_i==startr+1){
                    if(arr_j==startc || arr_j== endc){
                        continue;
                    }
                }
                total += arr[arr_i][arr_j];
                sum.add(total);
            }
        }
        System.out.println(total);
        return total;
    }
}