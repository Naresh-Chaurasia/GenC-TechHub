package com.solid.segregation;

public class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }
}
