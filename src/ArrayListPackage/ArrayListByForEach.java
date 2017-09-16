package ArrayListPackage;

import java.lang.*;
import java.io.*;
import java.util.*;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListByForEach {

    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<String>();
        String string;
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            string = scanner.next();
            arrayList.add(string);
        }
        for (String str : arrayList){
            System.out.print(str+" ");
        }
        System.out.println();
    }
}
