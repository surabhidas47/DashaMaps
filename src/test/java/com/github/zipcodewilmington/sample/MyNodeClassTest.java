package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.myLinkedList.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeClassTest {

    @Test
    public void equalsTest() {
        MyNode nd1 = new MyNode("Surbs", 10);
        MyNode nd2 = new MyNode("Surbs", 10);


        Assert.assertEquals(nd1, nd2);
    }


    @Test
    public void setNextTest() {



        MyNode first = new MyNode("Surbs", 1);
        MyNode second = new MyNode("Cass", 3);

        first.setNext(second);

        Assert.assertEquals(second,first.getNext());

    }

}
