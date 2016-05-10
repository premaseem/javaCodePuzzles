package javaCodePuzzles.com.premaseem.codechallange;

/**
 * Created by asee2278 on 5/10/16.
 * <p/>
 * If nn is odd, print Weird.
 * If nn is even and in the inclusive range of 22 to 55, print Not Weird.
 * If nn is even and in the inclusive range of 6 to 20, print Weird.
 * If nn is even and greater than 20, print Not Weird.
 */


import java.util.Scanner;

public class FindWieredNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";
        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)


        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n >= 2 || n <= 5) {
            ans = "Not Weird";
        } else if (n >= 6 || n <= 20) {
            ans = "Weird";
        } else if (n > 20) {
            ans = "Weird";
        }
        System.out.println(ans);
    }
}


