package ListJavaPackage;

import java.util.ArrayList;

/**
 * Created by maiq on 10/07/17.
 */
public class ListJava {

    public static void main(String args[]){

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Shanon");
        arrayList.add("Raunak");
        arrayList.add("Goyal");

        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
