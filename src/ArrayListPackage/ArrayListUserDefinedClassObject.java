package ArrayListPackage;

import java.util.*;
import java.lang.*;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListUserDefinedClassObject {

    public static void main(String args[]){
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student1 = new Student(101, "Maiq", "CSE", "NITH");
        Student student2 = new Student(301, "Ramesh", "ECE", "NITH");
        arrayList.add(student1);
        arrayList.add(student2);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Student s = (Student) iterator.next();
            System.out.println(s.rollNo+" "+s.name+" "+s.branch+" "+s.collegeName);
        }
    }
}
