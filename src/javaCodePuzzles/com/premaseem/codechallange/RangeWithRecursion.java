package javaCodePuzzles.com.premaseem.codechallange;


    /**
     * Created by asee2278 on 5/10/16.
     * A program to write range function with recursion with dynamic length array
     */
    public class RangeWithRecursion {


        public static void main(String[] args) {
            int [] arr = new int[5-3+1];
            int [] arr1 = new RangeWithRecursion().range(3,5,arr);
            for (int i : arr1){
                // System.out.println(i);
            }

        }




        public int[] range(int low, int high,int [] arr ){

            arr[high-low] = high;
            if(low==high) {
                arr[0]=low;
                return arr;}
            System.out.println(low +" " + high);
            return range(low,high - 1,arr);
        }
    }


