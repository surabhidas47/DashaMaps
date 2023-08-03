package com.github.zipcodewilmington.myLinkedList;


import java.util.Objects;

//is a pair plus a "next" pointer to go to the next pair
public class MyNode {

    MyPair data;
    MyNode next;


    //when we create a node it gets added to the end
    public MyNode(String key, Integer value) {
       data =  new MyPair(key,value);
       next = null;
    }

    public MyPair getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    //we dont have

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode myNode = (MyNode) o;
        return Objects.equals(data, myNode.data) && Objects.equals(next, myNode.next);
    }


}
