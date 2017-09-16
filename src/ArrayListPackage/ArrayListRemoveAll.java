package ArrayListPackage;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListRemoveAll {

    public static void main(String args[]){

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Maiq");
        arrayList.add("Ashutosh");
        arrayList.add("Inception");

        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Ashutosh");
        arrayList1.add("Inception");

        arrayList.removeAll(arrayList1);

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}