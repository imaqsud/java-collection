package ListJavaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by maiq on 10/07/17.
 */
public class ListJavaBook {

    public static void main(String args[]){

        List<Book> list = new ArrayList<Book>();

        Book book1 = new Book(110, 155.55, "C++ by A. Singh", "John Willey");
        Book book2 = new Book(111, 155.55, "C++ by A. Singh", "John Willey");
        Book book3 = new Book(112, 155.55, "C++ by A. Singh", "John Willey");
        Book book4 = new Book(113, 155.55, "C++ by A. Singh", "John Willey");
        Book book5 = new Book(114, 155.55, "C++ by A. Singh", "John Willey");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        for (Book book : list){
            System.out.println(book.id+" "+book.price+" "+book.bookName+" "+book.publisherName);
        }

        System.out.println();

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Book b1 = (Book) listIterator.next();
            System.out.println(b1.id+" "+b1.price+" "+b1.bookName+" "+b1.publisherName);
        }

        System.out.println();

        while (listIterator.hasPrevious()){
            Book b2 = (Book) listIterator.previous();
            System.out.println(b2.id+" "+b2.price+" "+b2.bookName+" "+b2.publisherName);
        }

    }
}
