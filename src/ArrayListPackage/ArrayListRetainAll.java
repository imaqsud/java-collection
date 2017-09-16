package ArrayListPackage;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListRetainAll {

    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Maiq");
        arrayList.add("Shaique");
        arrayList.add("Roshan");

        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Shaique");
        arrayList1.add("Roshan");

        arrayList.retainAll(arrayList1);

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
