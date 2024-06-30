package com.isaachome.annotation;

import java.util.*;
import java.util.stream.Stream;

public class TwoSumNumberApp {


    public  static  int [] findTowSumNumberWithDoubleLoop(int [] arrays,int targetSum){
        for(int i =0; i< arrays.length-1;i++){
            int firstNum = arrays[i];
            for(int j=i+1;j<arrays.length;j++){
                int secondNum =arrays[j];
                if((firstNum+secondNum)==targetSum) {
                    return new int[]{firstNum,secondNum};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
//        var result =  findTowSumNumberWithDoubleLoop(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
//        var result = findTowSumNumberWithLeftRightPointer(new int[] {3, 5, -4, 8, 11, 1, -1, 6,6}, 13);
        var result = findTownSumWithHashMap(new int[] {3, 5, -4, 8, 11, 1, -1, 6,6}, 1);

        for (int arr: result){

            System.out.print(arr + " ");
        }
    }

    public static int [] findTowSumNumberWithLeftRightPointer(int [] arrays,int targetnum){
        Arrays.sort(arrays);
        int left =0;
        int right = arrays.length-1;
        while (left<right){
            int currentSum= arrays[left]+arrays[right];
            if (currentSum==targetnum){
                return  new int[]{arrays[left],arrays[right]};
            }else if(currentSum<targetnum){
                left+=1;
            }else {
                right-=1;
            }
        }
        return  new int[0];
    }

    public  static  int [] findTownSumWithHashMap(int []array, int targetSum){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<array.length-1;i++){
            int complement = targetSum - array[i];
            if(map.containsKey(complement)){
                return  new int[]{map.get(complement),array[i]};
            }
            map.put(array[i],i);
        }
        Set<Integer> nums = new HashSet<>();
        for(int num: array){
            int potentialMatch = targetSum -num;
            if(nums.contains(potentialMatch)){
                return  new int[]{potentialMatch,num};
            }else {
                nums.add(num);
            }
        }
        return  new int[0];
    }
}
