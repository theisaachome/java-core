package com.isaachome.demo;

import java.util.HashMap;
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
        System.out.println(test("abc","cba"));
        System.out.println(test2("abc","cba"));
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
    static boolean test(String s, String t){
        //
        if(s.length() != t.length())return false;
        var sMap = new HashMap<Character,Integer>();
        var tMap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(i,0)+1);
            tMap.put(t.charAt(i),tMap.getOrDefault(i,0)+1);
        }
        return sMap.equals(tMap);
    }
    static boolean test2(String s, String t){
//        return s.length() == t.length() && s.chars().allMatch(c->t.indexOf(c)>=0);
        if(s.length()!=t.length())return false;

        int[] count =new int [26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a'] ++;
            count[t.charAt(i)-'a'] --;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0)return false;
        }
        return true;
    }
}
