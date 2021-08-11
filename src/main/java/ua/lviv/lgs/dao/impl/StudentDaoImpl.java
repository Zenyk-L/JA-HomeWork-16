package ua.lviv.lgs.dao.impl;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> studentList = new ArrayList<>();


    @Override
    public Student create(Student student) {
        studentList.add(student);
        return student;
    }

    @Override
    public Student read(int id) {
        Student student = null;
        Iterator<Student> iteratorR = studentList.iterator();
        while (iteratorR.hasNext()) {
            Student studentFromList = iteratorR.next();
            if (studentFromList.getId().equals(id)) {
                student = studentFromList;
            }
        }
        return student;
    }

    @Override
    public Student update(Student student) {
        Integer studentId = student.getId();
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student studentFromList = iterator.next();
            if (studentFromList.getId().equals(studentId)) {
                studentFromList = student;
            }
        }
        return student;
    }

    @Override
    public void delete(int id) {
        Iterator<Student> iteratorD = studentList.iterator();
        while (iteratorD.hasNext()) {
            Student studentFromList = iteratorD.next();
            if (studentFromList.getId().equals(id)) {
                iteratorD.remove();
            }
        }
    }

    @Override
    public List<Student> readAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
        return studentList;
    }
}
