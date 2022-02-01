package homework_8_Objects_Middle;
import homework_8_Objects_Middle.AuthorMiddle;
import homework_8_Objects_Middle.BookMiddle;

public class Main {

    private static boolean addBook(BookMiddle[] books, BookMiddle newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    private static void printBook(BookMiddle books) {
        System.out.println(String.join("; ", books.getAuthor().getNameOfAuthor() + " " +
                        books.getAuthor().getSurnameOfAuthor(), books.getTitleOfBook(),
                String.valueOf(books.getYearOfPublication())));
    }


    public static void main(String[] args) {
        BookMiddle newBook1 = new BookMiddle("Title1",
                new AuthorMiddle("Name1", "Surname1"), 2001);
        BookMiddle newBook2 = new BookMiddle("Title2",
                new AuthorMiddle("Name2", "Surname2"), 2002);
        BookMiddle newBook3 = new BookMiddle("Title3",
                new AuthorMiddle("Name3", "Surname3"), 2003);
        BookMiddle newBook4 = new BookMiddle("Title4",
                new AuthorMiddle("Name4", "Surname4"), 2004);
        BookMiddle newBook5 = new BookMiddle("Title5",
                new AuthorMiddle("Name5", "Surname5"), 2005);


        BookMiddle[] books = new BookMiddle[5];
        addBook(books, newBook1);
        addBook(books, newBook2);
        addBook(books, newBook3);
        addBook(books, newBook4);
        addBook(books, newBook5);
        addBook(books, new BookMiddle("Title6", new AuthorMiddle("Name6",
                "Surname6"), 2006));

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                printBook(books[i]);
            } else {
                System.out.println("Not enough space");
            }
        }
//          for (BookMiddle book : books) {
//            if (book != null) {
//                printBook(book);
//            }
//        }
    }
}