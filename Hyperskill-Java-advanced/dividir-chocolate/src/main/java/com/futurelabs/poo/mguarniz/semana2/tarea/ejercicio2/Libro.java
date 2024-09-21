package com.futurelabs.poo.mguarniz.semana2.tarea.ejercicio2;

public class Libro {
    private String title;
    private String author;
    private int numberCopies;
    private int numberCopiesLoaned;

    public Libro() {
        this.title = "Harry Potter";
        this.author = "J.K. Rowling";
        this.numberCopies = 10;
        this.numberCopiesLoaned = 0;
    }

    public Libro(String title, String author, int numberCopies, int numberCopiesLoaned) {
        this.title = title;
        this.author = author;
        this.numberCopies = numberCopies;
        this.numberCopiesLoaned = numberCopiesLoaned;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public int getNumberCopiesLoaned() {
        return numberCopiesLoaned;
    }

    public void setNumberCopiesLoaned(int numberCopiesLoaned) {
        this.numberCopiesLoaned = numberCopiesLoaned;
    }

    public boolean returnLoans() {
        if (numberCopiesLoaned != 0 && numberCopiesLoaned <= numberCopies) {
            numberCopiesLoaned --;
            return true;
        } else {
            return false;
        }
    }

    public boolean loans() {
        if (numberCopiesLoaned < numberCopies) {
            numberCopiesLoaned ++;
            return true;
        } else {
            return false;
        }
    }
}