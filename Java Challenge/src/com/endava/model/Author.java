package com.endava.model;

public class Author extends Registry{
    private String name;
    private String birthDate;

    public Author(int id) {
        super(id);
    }

    public Author(int id, String name, String birthDate) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
