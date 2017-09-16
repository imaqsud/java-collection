package LinkedListPackage;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by maiq on 10/07/17.
 */
public class LinkedListOne {

    public static void main(String args[]){

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Maiq");
        linkedList.add("Mike");
        linkedList.add("Rohtang");
        linkedList.add("New York");

        Iterator iterator  = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
