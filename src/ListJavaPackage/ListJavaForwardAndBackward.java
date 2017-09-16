package ListJavaPackage;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by maiq on 10/07/17.
 */
public class ListJavaForwardAndBackward {

    public static void main(String args[]){

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Maiq");
        arrayList.add("Shaan");
        arrayList.add("Salman");
        arrayList.add("Akshay");
        arrayList.add("Shah Rukh");
        arrayList.add("Aamir");

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
