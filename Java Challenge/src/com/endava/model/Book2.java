package com.endava.model;

public class Book2 extends Registry{
    private String name;
    private String author;
    private int ISBN;
    private String language;
    private  String publisher;

    public Book2(int id) {
        super(id);
    }

    public Book2(int id, String name, String author, int ISBN, String language, String publisher) {
        super(id);
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.language = language;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "id = "+getId()+" Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                ", language='" + language + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
