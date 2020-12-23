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
import com.example.javadesignpattern.prototype.JinRamen;
import com.example.javadesignpattern.prototype.Manager;
import com.example.javadesignpattern.prototype.MessageBox;
import com.example.javadesignpattern.prototype.Ramen;
import com.example.javadesignpattern.prototype.RamenManager;
import com.example.javadesignpattern.prototype.ShinRamen;
import com.example.javadesignpattern.prototype.UnderlinePen;
import com.example.javadesignpattern.singleton.Singleton;
import com.example.javadesignpattern.singleton.TicketMaker;
import com.example.javadesignpattern.singleton.Triple;
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

    @Test
    public void singletonTest() {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2) {
            System.out.println("둘은 동일한 인스턴스 입니다.");
        } else {
            System.out.println("둘은 다른 인스턴스 입니다.");
        }
        System.out.println("End.");
    }

    @Test
    public void singletonTicket() {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        int ticket1 = ticketMaker.getNextTicketNumber();
        int ticket2 = ticketMaker.getNextTicketNumber();
        int ticket3 = ticketMaker.getNextTicketNumber();
        System.out.println("첫번째 티켓번호 : " + ticket1 + " 두번째 티켓번호 : " + ticket2 + " 세번째 티켓번호 : " + ticket3);
    }

    @Test
    public void singletonTriple() {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + " : " + triple);
        }
        System.out.println("End.");
    }

    @Test
    public void prototypeTest() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        com.example.javadesignpattern.prototype.Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        com.example.javadesignpattern.prototype.Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        com.example.javadesignpattern.prototype.Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }

    @Test
    public void prototypeRamen() {
        RamenManager manager = new RamenManager();
        ShinRamen sramen = new ShinRamen();
        JinRamen jramen = new JinRamen();
        sramen.setDecoChar('@');
        jramen.setDecoChar('*');

        manager.register("shin", sramen);
        manager.register("jin", jramen);

        Ramen r1 = manager.create("shin");
        Ramen r2 = manager.create("jin");

        r1.use("매운 신라면");
        r2.use("고소한 진라면");

    }

}
