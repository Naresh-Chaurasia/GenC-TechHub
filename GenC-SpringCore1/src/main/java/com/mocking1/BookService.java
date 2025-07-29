package com.mocking1;

import java.util.List;

public class BookService {
    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<Book> fetchAllBooks() {
        return bookDAO.getAllBooks();
    }
}