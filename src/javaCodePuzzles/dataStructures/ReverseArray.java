package javaCodePuzzles.dataStructures;

/**
 * Created by asee2278 on 5/7/16.
 *
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, AA, of size NN, each memory location has some unique index, ii (where 0≤i<N0≤i<N), that can be referenced as A[i]A[i] (you may also see it written as AiAi).

 Given an array, AA, of NN integers, print each element in reverse order as a single line of space-separated integers.

 Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

 Input Format

 The first line contains an integer, NN (the number of integers in AA).
 The second line contains NN space-separated integers describing AA.

 Constraints

 1≤N≤1031≤N≤103
 1≤Ai≤104, where Ai is the ith integer in A1≤Ai≤104, where Ai is the ith integer in A
 Output Format

 Print all NN integers in AA in reverse order as a single line of space-separated integers.

 # Sample Input
 4
 1 4 3 2

 #Sample Output
 2 3 4 1

 *
 *
 */

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        for (int arr_i = n-1; arr_i >= 0; arr_i--) {
            System.out.print(arr[arr_i]+" ");
        }
    }
}

