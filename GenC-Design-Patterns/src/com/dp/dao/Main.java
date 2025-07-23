package com.dp.dao;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        bookDAO.addBook(new Book(1, "Clean Code"));
        bookDAO.addBook(new Book(2, "Effective Java"));

        System.out.println("All Books:");
        for (Book book : bookDAO.getAllBooks()) {
            System.out.println(book);
        }

        System.out.println("\nBook with ID 1:");
        System.out.println(bookDAO.getBookById(1));

        System.out.println("\nDeleting Book with ID 1");
        bookDAO.deleteBook(1);

        System.out.println("\nAll Books After Deletion:");
        for (Book book : bookDAO.getAllBooks()) {
            System.out.println(book);
        }
    }
}