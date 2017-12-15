package ru.job4j.inheritance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {
    @Test
    public void whenTeacherTeachStudent(){
        Teacher teacher = new Teacher("Иван", 10);
        String result = teacher.teach();
        String expect = "Преподаватель Иван, с опытом работы 10 лет, учит студента по имени Сергей";
        assertThat(result, is(expect));
    }
    @Test
    public void whenEngineerDevelopsProject(){
        Engineer engineer = new Engineer("Алеша", 30);
        String result = engineer.develop();
        String expect = "Инженер Алеша, с опытом работы 30 лет, разрабатывает Синхрофазотрон";
        assertThat(result, is(expect));
    }
    @Test
    public void whenDoctorTreatsPatient(){
        Doctor doctor = new Doctor ("Максим", 13);
        String result = doctor.threats();
        String expect = "Доктор Максим, с опытом работы 13 лет, лечит пациента по имени Дмитрий";
        assertThat(result, is(expect));
    }
}
