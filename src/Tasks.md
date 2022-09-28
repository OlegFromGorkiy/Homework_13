### **Простой уровень**

Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке. Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.

- **Критерии оценки**

  – Метод toString реализован корректно.

  – Метод equals реализован корректно.

  – Метод hashCode реализован корректно.

  – Методы не дублируют друг друга в классах Author и Book.

### **Сложный уровень**

Реализуйте метод toString в классе Library, который выводит все книги библиотеки в формате:

Library:

книга1

книга2

Использовать геттеры при написании этого метода запрещено. Нужно корректно делегировать формирование строки методу toString из книги.

Пример вызова метода и формата вывода смотрите в разделе «Отладка».

- **Отладка**

  Создать класс Main с методом main и написать в него следующий код:

    ```java
    System.out.println("Authors:");
    Author stephenKing = new Author("Stephen", "King");
    Author stephenKing2 = new Author("Stephen", "King");
    Author levTolstoy = new Author("Lev", "Tolstoy");
    System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
    System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
    System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
    System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));
    
    System.out.println(stephenKing);
    System.out.println(levTolstoy);
    
    System.out.println("==============================");
    
    System.out.println("Books:");
    Book theStand = new Book("The Stand", stephenKing, 1976);
    Book theStand2 = new Book("The Stand", stephenKing, 1976);
    Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
    System.out.println("Book copies equal: " + theStand.equals(theStand2));
    System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
    System.out.println("Books equal: " + theStand.equals(warAndPeace));
    System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
    System.out.println(theStand);
    System.out.println(warAndPeace);
    
    System.out.println("==============================");
    
    Library library = new Library(2);
    library.addBook(theStand);
    library.addBook(warAndPeace);
    System.out.println(library);
    ```

  Вывод при этом должен быть таким:

    ```
    Authors:
    Author copies equal: true
    Author copies equal by hashCode: true
    Authors equal: false
    Authors equal by hashCode: false
    Author: Stephen King
    Author: Lev Tolstoy
    ==============================
    Books:
    Book copies equal: true
    Book copies equal by hashCode: true
    Books equal: false
    Books equal by hashCode: false
    Book: The Stand by Author: Stephen King
    Book: War and Peace by Author: Lev Tolstoy
    ==============================
    Library: 
    Book: The Stand by Author: Stephen King
    Book: War and Peace by Author: Lev Tolstoy
    ```


- **Критерии оценки**

  – Метод toString реализован в классе Library.

  – Все книги библиотеки выводятся в корректном формате.

  – Гетеры при написании методы не использованы.