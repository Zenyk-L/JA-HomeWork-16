package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");



        StudentDao studentDao = context.getBean("getStudentDao", StudentDao.class);

        studentDao.create(student1);
        studentDao.create(student2);
        studentDao.create(student3);

        System.out.println("Student readed whith id 2 " + studentDao.read(2));
        student2.setAge(50);
        System.out.println("Student age updated whith id 2 " + studentDao.update(student2));

        studentDao.delete(2);
        System.out.println("Student with id 2 is deleted");

        studentDao.readAll();


    }
}
