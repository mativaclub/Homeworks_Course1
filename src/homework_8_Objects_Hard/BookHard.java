package homework_8_Objects_Hard;

public class BookHard {

    private final String titleOfBook;
    private final AuthorHard author;
    private int yearOfPublication;

    public BookHard(String titleOfBook, AuthorHard author, int yearOfPublication) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfBook() {
        return this.titleOfBook;
    }

    public AuthorHard getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
