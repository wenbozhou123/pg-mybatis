package com.dao;

import com.pojo.Student;

import java.util.List;

public interface  StudentDao {

    public Integer addStudent(Student user);

    public boolean updateStudent(Student user);

    public boolean deleteStudent(String Id);

    public Student findStudent(String Id);

    public int countStudent();

    public List<Student> listStudent();
}
