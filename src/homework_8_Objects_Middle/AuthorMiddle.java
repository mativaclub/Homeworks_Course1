package homework_8_Objects_Middle;

    public class AuthorMiddle {
    private final String nameOfAuthor;
    private final String surnameOfAuthor;

    public AuthorMiddle(String nameOfAuthor, String surnameOfAuthor) {
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
