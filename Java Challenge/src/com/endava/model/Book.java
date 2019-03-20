package com.endava.model;

public class Book extends Registry{

    private String name;
    private long ISBN;
    private int authorId;
    private int libarayId;
    private int publisherId;

    public Book(int id) {
        super(id);
    }

    public Book(int id, String name, long ISBN, int authorId, int libarayId, int publisherId) {
        super(id);
        this.name = name;
        this.ISBN = ISBN;
        this.authorId = authorId;
        this.libarayId = libarayId;
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getLibarayId() {
        return libarayId;
    }

    public void setLibarayId(int libarayId) {
        this.libarayId = libarayId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }
}
