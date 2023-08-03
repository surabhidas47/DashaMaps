package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.myLinkedList.MyPair;
import org.junit.Assert;
import org.junit.Test;

public class MyPairTest {

    @Test
    public void testSetKey(){
        //GIVEN
        //need a key
        String expectedKey ="pain";

        //need a pair
        MyPair pair = new MyPair("Bloop", 1);

        //WHEN
        pair.setKey(expectedKey);
        String actualKey = pair.getKey();

        //THEN
        Assert.assertEquals(expectedKey,actualKey);

    }

    @Test
    public void testSetValue(){
        //GIVEN
        //need a key
        Integer expectedValue = 5;

        //need a pair
        MyPair pair = new MyPair("Bloop", 1);

        //WHEN
        pair.setValue(expectedValue);
        Integer actualValue = pair.getValue();

        //THEN
        Assert.assertEquals(expectedValue,actualValue);

    }



    @Test
    //so this test works before we created the .equals override
    public void testEquals() {
        MyPair mp1 = new MyPair("Bloop", 1);
        MyPair mp2 = new MyPair("Bloop", 1);

        Assert.assertEquals(mp1,mp2);

    }
}
