/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Linear Search Using Overloading
*/

public class linear_search {

    static boolean search(int[] arr,int key) {

        for(int num : arr) {
            if(num == key)
                return true;
        }

        return false;
    }

    static boolean search(String[] arr,String key) {
        for(String str : arr) {
            if(str.equals(key))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println( search(new int[]{10,20,30},20));
        System.out.println( search(new String[]{"Aman","Ankit","Amit"},"Amit"));
    }
}