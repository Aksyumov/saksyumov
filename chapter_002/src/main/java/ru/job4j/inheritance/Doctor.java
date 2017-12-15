package ru.job4j.inheritance;

public class Doctor extends Profession{
    String doctorDiploma;
    public Doctor(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    public String threats(){
        Patient patient = new Patient("Дмитрий");
        return "Доктор " + getName() + ", с опытом работы " + getExperience() + " лет, лечит пациента по имени " + patient.getName();
    }
}
