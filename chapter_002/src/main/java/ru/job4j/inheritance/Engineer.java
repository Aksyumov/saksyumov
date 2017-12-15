package ru.job4j.inheritance;

public class Engineer extends Profession{
    String engineerDiploma;

    public Engineer(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    public String develop (){
        Project project = new Project("Синхрофазотрон");
        return "Инженер " + getName() + ", с опытом работы " + getExperience()+ " лет, разрабатывает " + project.getName();
    }
}
