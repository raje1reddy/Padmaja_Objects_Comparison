
import java.util.Scanner;
import java.util.ArrayList;
//code accesses and prints all the elements of array list
public class PadmajaArrayTest {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("four");
        list.add(2, "three");
        for(String element : list){
            System.out.println(element);
        }

    }
}

