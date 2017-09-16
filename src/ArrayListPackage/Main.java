package ArrayListPackage;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string;
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            string = scanner.next();
            arrayList.add(string);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
