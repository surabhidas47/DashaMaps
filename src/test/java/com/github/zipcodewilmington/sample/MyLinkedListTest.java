package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.myLinkedList.MyLinkedList;
import com.github.zipcodewilmington.myLinkedList.MyNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void getHead() {
    }

    @Test
    void add() {
        MyLinkedList mll = new MyLinkedList("Alopa");
        String expectedKey = "Sapna";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey,expectedValue);

        //when
        mll.add(expectedKey,expectedValue);
        MyNode actual = mll.getHead().getNext();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    void size() {

        int expected =1;
        MyLinkedList mll = new MyLinkedList("Alopa");
        mll.add("Sapna",6);

        //when
        int actual = mll.size();

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    void get() {
        //checking to
        MyLinkedList mll = new MyLinkedList("Alopa");
        String expectedKey = "Sapna";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey,expectedValue);

        mll.add(expectedKey,expectedValue);
        MyNode actual = mll.get(expectedKey);

        Assert.assertEquals(expected,actual);

    }
}