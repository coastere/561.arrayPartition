package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {6,2,6,5,1,2};

        Arrays.sort(nums);
        int r=0;
        for (int i = 0; i <nums.length/2 ; i++) {
            r = r + nums[2*i];
        }

        System.out.println(r);
    }
}
