package ru.job4j.inheritance;


public class Teacher extends Profession{
    String teacherDiploma;
    public Teacher(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    public String teach (){
        Student student = new Student ("Сергей");
        return "Преподаватель " + getName() + ", с опытом работы " + getExperience()+ " лет, учит студента по имени " + student.getName();
    }
}
