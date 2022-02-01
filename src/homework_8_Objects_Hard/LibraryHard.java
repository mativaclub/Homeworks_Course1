package homework_8_Objects_Hard;

public class LibraryHard {

    private final BookHard[] books;

    public LibraryHard(int size){
        books = new BookHard[size];
    }

    public boolean addBook(BookHard newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public void printBookInfo(BookHard bookName) {
        for (BookHard newBook : books) {
            if (newBook != null && newBook.getTitleOfBook().equals(bookName)) {
                System.out.println(newBook.getTitleOfBook() +  " by" + newBook.getAuthor().getNameOfAuthor() +
                        newBook.getAuthor().getSurnameOfAuthor() + " was published in " +
                        newBook.getYearOfPublication());
                return;
            }
        }
        System.out.println("Book " + bookName + " was not found");
    }
}
