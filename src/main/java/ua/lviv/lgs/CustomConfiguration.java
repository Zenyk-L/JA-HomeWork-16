package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.dao.impl.StudentDaoImpl;
import ua.lviv.lgs.domain.Student;

@Configuration
public class CustomConfiguration {

    @Bean("student1")
    public Student getStudent1(){
        return new Student(1, "Ivan", 20);
    }
    @Bean("student2")
    public Student getStudent2(){
        return new Student(2, "Petro", 21);
    }
    @Bean("student3")
    public Student getStudent3(){
        return new Student(3, "Stepan", 25);
    }

    @Bean
    public StudentDao getStudentDao(){
        return new StudentDaoImpl();
    }
}
