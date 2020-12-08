package com.example.javadesignpattern;

import com.example.javadesignpattern.adapter.Print;
import com.example.javadesignpattern.adapter.Print2;
import com.example.javadesignpattern.adapter.PrintBanner;
import com.example.javadesignpattern.adapter.PrintBanner2;
import com.example.javadesignpattern.adapter.practice1.Provide;
import com.example.javadesignpattern.adapter.practice1.ProvideCoffee;
import com.example.javadesignpattern.adapter.problem.FileIO;
import com.example.javadesignpattern.adapter.problem.FileProperties;
import com.example.javadesignpattern.factory.framework.Factory;
import com.example.javadesignpattern.factory.framework.Product;
import com.example.javadesignpattern.factory.idcard.IDCardFactory;
import com.example.javadesignpattern.iterator.Book;
import com.example.javadesignpattern.iterator.BookShelf;
import com.example.javadesignpattern.iterator.Iterator;
import com.example.javadesignpattern.template.AbstractDisplay;
import com.example.javadesignpattern.template.CharDisplay;
import com.example.javadesignpattern.template.StringDisplay;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void iteratorBookTest() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    @Test
    public void iteratorBookArrayList() {
        BookShelf bookShelf = new BookShelf(new ArrayList<Book>());
        bookShelf.addBook(new Book("Around the World in 80 days"));
        bookShelf.addBook(new Book("Bible"));
        bookShelf.addBook(new Book("Cinderella"));
        bookShelf.addBook(new Book("Daddy-Long-Legs"));
        bookShelf.addBook(new Book("Eden's Hill"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.nextArrayList();
            System.out.println(book.getName());
        }
    }

    @Test
    public void adapterPrintWithClassAdapterPattern() { // 클래스에 의한 어댑터 패턴
        // PrintBanner 타입의 참조변수가 아닌 Print 타입의 참조변수인 것에 주목
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    @Test
    public void adapterPrint2WithInstanceAdapterPattern() { // 인스턴스에 의한 어댑터 패턴
        Print2 p = new PrintBanner2("World");
        p.printWeak();
        p.printString();
    }

    @Test
    public void adapterFileIOWithAdapterPattern() { // 문제 2-2
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2020");
            f.setValue("month", "12");
            f.setValue("day", "05");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void adapterCoffee() {
        Provide p = new ProvideCoffee("루왁");
        p.provideCoffee();
    }

    @Test
    public void templateString() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("안녕하세요.");
        d1.display();
        d2.display();
        d3.display();
    }

    @Test
    public void factoryProduct() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
    }

}
