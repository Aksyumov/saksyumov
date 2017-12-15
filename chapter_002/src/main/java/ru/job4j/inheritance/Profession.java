package ru.job4j.inheritance;

public class Profession {
    public String name;
    public int experience;

    public Profession(){

    }

    public Profession(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    public String getName(){
    return this.name;
    }

    public int getExperience(){
        return this.experience;
    }
}
