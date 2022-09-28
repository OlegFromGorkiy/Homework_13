import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] books;
    private int index = 0;

    public Library(int i) {
        this.books = new Book[i];
    }

    public void addBook(Book book) {
        if (search(book) >= 0) {
            System.out.println("This book already added!");
            return;
        }
        if (books[books.length - 1] != null) this.grow();
        books[index] = book;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Library:\n");
        //В моей реализации класса после первого пустого значения в массиве,
        //все следующие тоже пустые, и по достижении первого нулевого значения цикл прерывается.
        //iDea советует цикл foreash. В каком порядке этот цикл перебирает массивы и
        //можно ли прервать цикл foreach по аналогии с тем как написано тут? (чтоб лишние пустые ячейки не перебирались)
        //Вводить переменную длины и копировать алгоритмы ArrayList не хочется =)
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) sb.append(books[i].toString()).append("\n");
            else break;
        }
        return sb.toString().trim();
    }

    public void viewAll() {
        Arrays.stream(books).filter(Objects::nonNull).forEach(System.out::println);
    }

    private void grow() {
                books = Arrays.copyOf(books, books.length * 2);
    }

    private int search(Book book) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (book.equals(books[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void bookInfo(Book book) {
        int i = search(book);
        System.out.println(i < 0 ? "This book not found!" : books[i]);
    }

    public void setYear(Book book, int year) {
        int i = search(book);
        if (i < 0) {
            System.out.println("This book not found!");
            return;
        }
        books[i].setYear(year);
    }
}
