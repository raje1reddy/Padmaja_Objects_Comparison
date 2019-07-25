
import com.padmaja.arraytest.MyPerson;
//import MyPerson .*;

import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
//import newPackage.MyPerson;
import java.io.*;
//Objects are compared for equality using their equals() method
//Override the equals method in your own class

public class DeleteElementsFromArrayList2 {
    public static void main(String args[]){
        ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
        MyPerson p1 = new MyPerson ("Padmaja");
        MyPerson p2 = new MyPerson("Java");
        MyPerson p3 = new MyPerson ("Selenium");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p3);
        myArrList.remove(new MyPerson ("Java"));
        for (MyPerson element:myArrList)
            System.out.println(element.name);
    }
}
