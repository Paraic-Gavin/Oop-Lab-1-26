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
        firstBook.borrowBook();
    }
}