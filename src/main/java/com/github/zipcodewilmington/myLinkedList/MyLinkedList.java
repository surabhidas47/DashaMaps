package com.github.zipcodewilmington.myLinkedList;

import java.util.Objects;

public class MyLinkedList {

    MyNode head;



    //in our imagae example, the head has null value... head is used to keep traack of
    //how following
    public MyLinkedList(String key) {
        //linkedlist only ever keep track of the head
       head = new MyNode(key,null);
    }

    //want to able to get the head and comapre to other linked list
    public MyNode getHead() {
        return head;
    }

    public void add(String key, Integer value){
        //how do we add to the end of the list
        //we cant use collections
        //cant use for loop bc dont know how long linked list is
        MyNode currentNode =head;

        //while the  next node is not null
        while(currentNode.getNext() !=null){
            currentNode =currentNode.getNext();
        }

    currentNode.setNext(new MyNode(key,value));
    }

    public int size() {
        MyNode currentNode = head;

        //first node is like placeholder in this context... not including it in size
        int counter =0;

        while(currentNode.getNext()!=null){
            currentNode=currentNode.getNext();
            counter++;
        }

        return counter;
    }

    //using the key to get the node associated
    public MyNode get(String key){
        MyNode currentNode = head;

        while(currentNode!=null){
            currentNode=currentNode.getNext();
            //getData from pair
            if(currentNode.getData().getKey().equals(key)){
                return currentNode;
            }
            //updating currentNode to go the next element to check the equals in if
            //eventually will get to null
            currentNode=currentNode.getNext();
        }


        return null;
    }

    private void remove (String key){


    }

    //checking if there is just a head
    //an empty linkedList is considered to be just a head
    public boolean isEmpty(){
        return head.getNext()==null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList that = (MyLinkedList) o;
        return Objects.equals(head, that.head);
    }

}
