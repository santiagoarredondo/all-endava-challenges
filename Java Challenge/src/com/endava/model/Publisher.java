package com.endava.model;

public class Publisher extends Registry{

    private String name;
    private long NIT;

    public Publisher(int id) {
        super(id);
    }

    public Publisher(int id, String name, long NIT) {
        super(id);
        this.name = name;
        this.NIT = NIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }
}
