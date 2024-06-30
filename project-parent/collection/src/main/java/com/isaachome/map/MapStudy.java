package com.isaachome.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Apple",100);
        productMap.put("Orange",120);
        productMap.put("Peas",130);

        mapWithForLoop(productMap);
    }

     static void MapWithIterator(Map<String,Integer> maps){
         Iterator<Map.Entry<String,Integer>> iterator = maps.entrySet().iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
     }

   static  void mapWithForLoop(Map<String,Integer> maps){
        for(Map.Entry<String,Integer> m:maps.entrySet()){
            System.out.println(m);
        }
   }

}
