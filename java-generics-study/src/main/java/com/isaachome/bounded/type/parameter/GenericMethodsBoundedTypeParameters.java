package com.isaachome.bounded.type.parameter;

public class GenericMethodsBoundedTypeParameters {

    public static <T extends  Comparable<T>> int countGreaterThan(T[] array, T elem){
        int count = 0;
        for (T t : array) {
            if(t.compareTo(elem)>0)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        var result = GenericMethodsBoundedTypeParameters.countGreaterThan(new Integer[]{1,2,3,4,5,6},4);
        System.out.println(result);
    }
}
