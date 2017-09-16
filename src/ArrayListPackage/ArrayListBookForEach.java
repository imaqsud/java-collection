package ArrayListPackage;

import java.util.ArrayList;
import java.lang.*;

/**
 * Created by maiq on 10/07/17.
 */
public class ArrayListBookForEach {

    public static void main(String args[]){
        ArrayList<Book> arrayList  = new ArrayList<Book>();

        Book book1 = new Book(1, 123.4, "DS", "Disha");
        Book book2 = new Book(2, 122.4, "Physics", "Disha");

        arrayList.add(book1);
        arrayList.add(book2);

        for (Book book : arrayList){
            System.out.println(book.id+" "+book.price+" "+book.bookName+" "+book.publisherName);
        }
    }
}
