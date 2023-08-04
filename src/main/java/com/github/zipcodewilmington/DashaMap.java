package com.github.zipcodewilmington;

import com.github.zipcodewilmington.myLinkedList.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX{

    protected MyLinkedList[] dash;
    protected String alpha = "abcdefghijklmnopqrstuvwxyz";

    public DashaMap (){
        //26 for each of the letters
        dash = new MyLinkedList[26];


       for(int i=0;i< dash.length;i++){
           //we added empty quotes bc just char wont work
           dash[i]=new MyLinkedList(""+ alpha.charAt(i));
       }
    }

    @Override
    public void set(String key, Integer value) {

    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        for(MyLinkedList mll: dash){
            if(!mll.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        int totalSize =0;
        for(MyLinkedList mll: dash) {
            totalSize += mll.size();
        }
        return totalSize;
    }


    //key should be a letter, bucket corresponding to the key
    //
    @Override
    public int bucketSize(String key) {

        return dash[getBucketsIndex(key)].size();
    }

    protected int getBucketsIndex(String key) {

        return alpha.indexOf(key);
    }
}
