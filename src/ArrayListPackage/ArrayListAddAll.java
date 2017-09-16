package ArrayListPackage;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListAddAll {
    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Maiq");
        arrayList.add("Rahul");
        arrayList.add("Sherlock");

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Thor");
        arrayList1.add("Iron Man");

        arrayList.addAll(arrayList1);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
