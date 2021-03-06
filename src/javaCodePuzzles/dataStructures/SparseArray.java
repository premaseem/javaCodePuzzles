package javaCodePuzzles.dataStructures;

/**
 * Created by aseem jain on 5/7/16.
 *
 * There are NN strings. Each string's length is no more than 2020 characters. There are also QQ queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

 Input Format

 The first line contains NN, the number of strings.
 The next NN lines each contain a string.
 The N+2N+2nd line contains QQ, the number of queries.
 The following QQ lines each contain a query string.

 Constraints

 1≤N≤10001≤N≤1000
 1≤Q≤10001≤Q≤1000
 1≤1≤ lengthlength ofof anyany string≤20string≤20
 Sample Input

 4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab
 Sample Output

 2
 1
 0
 Explanation

 Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
 */

import java.util.*;

public class SparseArray {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int strLen = scan.nextInt();

        List<String> str = new ArrayList<String>();
        List<String> query = new ArrayList<String>();
        for(int i=0; i < strLen;i++) {
            str.add(scan.next());
        }
        int queryLen = scan.nextInt();

        for(int i=0; i < queryLen;i++) {
            query.add(scan.next());
        }

        for(String q : query){
            int count = 0;
            for(String s : str){
                if(s.equals(q)) count++;
            }
            System.out.println(count);
        }


    }

}
