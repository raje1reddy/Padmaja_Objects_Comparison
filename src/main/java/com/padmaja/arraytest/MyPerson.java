package com.padmaja.arraytest;

import java.lang.String;
public class MyPerson {

    public String name;
    //MyPerson(){}

    public MyPerson(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyPerson) {
            MyPerson p = (MyPerson) obj;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        } else
            return false;
    }
}

