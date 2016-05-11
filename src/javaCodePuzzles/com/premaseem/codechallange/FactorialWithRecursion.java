package javaCodePuzzles.com.premaseem.codechallange;

/**
 * Created by asee2278 on 5/10/16.
 */
public class FactorialWithRecursion {


    public static void main(String[] args) {
        System.out.println( new FactorialWithRecursion().factorial(5));
    }

    public int factorial(int num){
        if (num ==1) return 1;
        System.out.println("calculating for value "+ num + " with total ");
        return  num *  factorial (num-1);
    }
}
