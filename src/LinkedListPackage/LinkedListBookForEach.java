package LinkedListPackage;

import java.util.LinkedList;

/**
 * Created by maiq on 10/07/17.
 */
public class LinkedListBookForEach {

    public static void main(String args[]){
        LinkedList<Book> linkedList = new LinkedList<Book>();

        Book book1 = new Book(101, 123.44, "C by Yashwant Kanetkar", "Arihant");
        Book book2 = new Book(102, 123.44, "C by Yashwant Kanetkar", "Arihant");

        linkedList.add(book1);
        linkedList.add(book2);

        for (Book book : linkedList){
            System.out.println(book.id+" "+book.price+" "+book.bookName+" "+book.publisherName);
        }
    }
}
