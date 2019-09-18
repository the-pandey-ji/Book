package main;

public class Book {
    private String bookName;
    private String authorName;
    private String isbn;

    @Override
    public String toString() {
        return "-----------------------------\n" + "Book Name:\t" + bookName + "\nAuthor Name:\t" + authorName + "/nISBN:\t" + isbn +
                "\n-----------------------------\n";
    }
}
