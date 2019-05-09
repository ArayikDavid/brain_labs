package ua.zp.brain.labs.oop.basics.classes;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Имя класса: Book" );
        System.out.println("Строка 1 = " + book.pageNum);
        System.out.println("Строка 2 = " + book.Name);
        System.out.println("Строка 3 = " + book.year);




        MarketClient marketClient = new MarketClient();
        PostOffice postOffice = new PostOffice();

    }

}
