package org.example;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        Hashing hashing = new Hashing();

        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(hashing.twoSum(nums, target)));
    }
}
