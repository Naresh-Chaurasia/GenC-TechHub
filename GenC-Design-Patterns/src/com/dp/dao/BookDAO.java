package com.dp.dao;

import java.util.List;

public interface BookDAO {
    void addBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(int id);

    void deleteBook(int id);
}
