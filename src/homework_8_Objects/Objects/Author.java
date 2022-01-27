package homework_8_Objects.Objects;

public class Author {
    private final String nameOfAuthor;
    private final String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.surnameOfAuthor;
    }
}
