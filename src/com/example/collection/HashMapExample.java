package com.example.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
* HashMap vs HashTable
* */
public class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"one");
        hmap.put(2, "two");
        hmap.put(3, "three");
        hmap.put(1, "four");
        /*hmap.put(null, "zero");
        hmap.put(null, "zerotwo");
        hmap.put(5, null);
        hmap.put(6, null);*/

        for(Map.Entry<Integer,String> entry : hmap.entrySet()){
            System.out.println("get key : " +entry.getKey());
            System.out.println("get value : " +entry.getValue());
            System.out.println("get hashcode : " +entry.hashCode() +entry.equals(entry.getKey()));
        }

        //the value of two will be overriden
        if(hmap.containsKey(2)){
            hmap.replace(2, "replace two as six");
        }

        Hashtable<Integer, String> htable = new Hashtable<>();
        htable.put(7 , "seven");

        /*
        HashTable will not allow null key or value if we try to copy hashmap to hashtable if null values or key present in hashmap will
        through NullPointer Exception
        */
        htable.putAll(hmap);

        System.out.println("Fetch key values in map : " +hmap);
        System.out.println("Fetch values using specific key in map :n " +hmap.get(1));
        System.out.println("Fetch key values in map : " +htable);
    }
}
