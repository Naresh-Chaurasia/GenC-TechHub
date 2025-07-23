package com.dp.dao;

import java.util.ArrayList;
import java.util.List;

//DB Interaction Layer
public class BookDAOImpl implements BookDAO {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    @Override
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
