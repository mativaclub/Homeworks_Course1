package homework_8_Objects_Hard;

public class Main {


    public static void main(String[] args) {
        LibraryHard library = new LibraryHard(5);

        BookHard newBook1 = new BookHard("Title1",
                new AuthorHard("Name1", "Surname1"), 2001);
        BookHard newBook2 = new BookHard("Title2",
                    new AuthorHard("Name2", "Surname2"), 2002);
        BookHard newBook3 = new BookHard("Title3",
                    new AuthorHard("Name3", "Surname3"), 2003);
        BookHard newBook4 = new BookHard("Title4",
                    new AuthorHard("Name4", "Surname4"), 2004);
        BookHard newBook5 = new BookHard("Title5",
                    new AuthorHard("Name5", "Surname5"), 2005);

        BookHard[] books = new BookHard[5];
        library.addBook(new BookHard("Title5",
                new AuthorHard("Name5", "Surname5"), 2005));
//        LibraryHard.addBook(books, newBook2);
//        LibraryHard.addBook(books, newBook3);
//        LibraryHard.addBook(books, newBook4);
//        LibraryHard.addBook(books, newBook5);
//        LibraryHard.addBook(new BookHard("Title6", new AuthorHard("Name6",
//                    "Surname6"), 2006));

        for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    library.printBookInfo(books[i]);
                } else {
                }
    }
    }
}


//Сложный уровень
//Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
//Учесть, что доступ к нему должен быть только из Library (private поле),
// а сеттеры и геттеры отсутствуют. Работать с массивом можно только через
// внутренние нестатические методы класса Library.
//2. Конструктор класса должен получать в качестве параметра размер массива и
// инициализировать в себе поле массива тем размером, что пришел параметром.
//3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
//4. Создать новые нестатические методы в классе Library:
//Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
//       Формат: “The Stand by Stephen King was published in 1978”
//Изменить год публикации книги по ее названию.
//       В метод подаются два параметра, а именно: название и новый год публикации.
//       Нужно найти книгу и изменить ее год публикации.
//Критерии оценки
//Класс Library создан корректно.
//Массив корректно перенесен в виде поля в класс Library.
//Конструктор класса Library написан корректно.
//Корректно перенесены методы, модификатор static удален.
//Объявлены новые методы.
//Методы корректно справляются со своей задачей.