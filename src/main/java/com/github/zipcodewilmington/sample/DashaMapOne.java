package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.DashaMap;

public class DashaMapOne extends DashaMap {
    public DashaMapOne() {
        super ();
    }

    //hash function to determine where the key, value pair goes
    private String hashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(String.valueOf(Character.toLowerCase((input.charAt(0)))));
        }
        return null;
    }

    @Override
    public void set(String key,Integer value){
//    - set(key, value) {
//        key-hash = hash-function(key)
//        newval = new Node(key, value)
//        append-to(hash-array[key-hash], newval)
        String keyHash = hashFunctionOne(key);
        int keyHashIndex = getBucketsIndex(keyHash);
        dash[keyHashIndex].add(key,value);


    }

}
