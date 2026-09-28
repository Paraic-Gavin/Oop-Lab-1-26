package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args){


        Book firstBook = new Book();
        firstBook.title = "Dune";
        firstBook.author = "Frank Herbert";
        firstBook.pageCount = 412;

        //before loan
        firstBook.displayDetails();
        firstBook.borrowBook();

        //after loan
        firstBook.displayDetails();

        Book secondBook = createBook("Clean Code","Dan Williams", 223);
        Book thirdBook = createBook("Another Book Code","John Smith", 456);
        Book fourthBook = createBook("Life","Jane Doe", 648);

        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");
        fourthBook.displayDetails();
        System.out.println("\n");

    }

    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}