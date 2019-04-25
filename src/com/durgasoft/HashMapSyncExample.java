package com.durgasoft;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapSyncExample {
    public static void main(String args[]) {
         HashMap<Integer, String> hmap= new HashMap<Integer, String>();
         hmap.put(2, "Anil");
         hmap.put(44, "Ajit");
         hmap.put(1, "Brad");
         hmap.put(4, "Sachin");
         hmap.put(88, "XYZ");

         Map map= Collections.synchronizedMap(hmap);
         
         map.put(1, "MNC");
         Set set = map.entrySet();
         synchronized(map){
             Iterator i = set.iterator();
             // Display elements
             while(i.hasNext()) {
            	 map.put(3, "MNC");
            	 Map.Entry me = (Map.Entry)i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
             }
         }
    }
}
