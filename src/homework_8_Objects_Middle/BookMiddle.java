package homework_8_Objects_Middle;

public class BookMiddle {

    private final String titleOfBook;
    private final AuthorMiddle author;
    private int yearOfPublication;

    public BookMiddle(String titleOfBook, AuthorMiddle author, int yearOfPublication) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleOfBook() {
        return this.titleOfBook;
    }

    public AuthorMiddle getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
