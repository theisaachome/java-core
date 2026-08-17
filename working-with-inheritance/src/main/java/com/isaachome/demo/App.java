package com.isaachome.demo;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(hasDifferent(nums));
    }
    static boolean hasDifferent(int[] nums){
//        if(nums.length==0)return false;
//
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j])return true;
//            }
//        }
//        return false;
        var set = new HashSet<Integer>();

        for(int num:nums){
            if(set.contains(num))return true;
            set.add(num);
        }
        return false;
    }
}
