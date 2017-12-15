package ru.job4j.inheritance;

public class Patient {
    public String name;
    public String getName(){
        return this.name;
    }

    public Patient(String name) {
        this.name = name;
    }
}
