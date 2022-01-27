package homework_8_Objects.Objects;

public class main {

    public static void main(String[] args) {

        Book book1 = new Book("Иди туда где страшно",
                new Author("Джим", "Лоулесс"), 2017);
        System.out.println("book1.titleOfBook = " + book1.getTitleOfBook());
        System.out.println("book1.nameOfAuthor = "
                + book1.getAuthor().getNameOfAuthor() + " "
                + book1.getAuthor().getSurnameOfAuthor());
        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());
        book1.setYearOfPublication(2020);
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

        Book book2 = new Book("Исповедь экономического убийцы",
                new Author("Джон", "Перкинс"), 2018);
        System.out.println("book2.titleOfBook = " + book2.getTitleOfBook());
        System.out.println("book2.nameOfAuthor = "
                + book2.getAuthor().getNameOfAuthor() + " "
                + book2.getAuthor().getSurnameOfAuthor());
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());


    }
}
