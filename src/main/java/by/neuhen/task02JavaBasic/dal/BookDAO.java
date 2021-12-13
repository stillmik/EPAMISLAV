package by.neuhen.task02JavaBasic.dal;

import by.neuhen.task02JavaBasic.beans.Book;

public interface BookDAO {

    void addBook(Book book);
    void deleteBook(long id);
    void delete(Book book);
}
