package com.endava.model;

public class Library extends Registry{

    private String name;
    private String address;

    public Library(int id) {
        super(id);
    }

    public Library(int id, String name, String address) {
        super(id);
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
