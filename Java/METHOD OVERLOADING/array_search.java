/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Elements Using Method Overloading
*/

public class array_search {

    static boolean search(int[] arr,int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String[] arr,String key) {
        for (String str : arr) {
            if (str.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums ={10, 20, 30};

        String[] names ={"Java", "Python"};

        System.out.println(search(nums, 20));

        System.out.println(search(names,"Java"));
    }
}