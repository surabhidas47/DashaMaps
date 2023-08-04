package com.github.zipcodewilmington;

import com.github.zipcodewilmington.sample.DashaMapOne;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {

    @Test
    public void isEmpty(){
        DashaMap dm = new DashaMapOne();

        //When
        boolean actual = dm.isEmpty();

        Assert.assertTrue(actual);
    }

    @Test
    public void isNotEmpty(){
        DashaMap dm = new DashaMapOne();
        dm.set("bloop",1);

        //When
        boolean actual = dm.isEmpty();

        Assert.assertFalse(actual);
    }

    @Test
    public void size(){
        long expected= 1;
        DashaMap dm = new DashaMapOne();
        dm.set("bloop",1);


        //When
        long actual = dm.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sizeIsEmpty(){
        long expected= 0;
        DashaMap dm = new DashaMapOne();


        long actual = dm.size();


        Assert.assertEquals(expected,actual);
    }

}
