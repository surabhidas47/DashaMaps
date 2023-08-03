package com.github.zipcodewilmington.myLinkedList;


import java.util.Objects;

//key and value pair like from a hashmap
public class MyPair {

    private String key;
    private Integer value;

    //dont want to create a node with nothing in it, no nullary


    public MyPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }


    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    //like the toString method for comparing\
    //when comapring, without this method... even if have same key and value pair wont be equal
    //they have two diff locations
    //this override allows for the objects to be comapred as opposed to the
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(key, myPair.key) && Objects.equals(value, myPair.value);
    }



//   @Override
//    public boolean equals(Object o){
//        if(o==null){
//            return false;
//        }
//        return this.key.equals(o.equals(key)) && this.value.equals(o.equals(value));
//    }
}

