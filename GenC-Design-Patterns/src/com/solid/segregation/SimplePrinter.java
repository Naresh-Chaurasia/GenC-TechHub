package com.solid.segregation;

public class SimplePrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}