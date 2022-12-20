package ra.model.service;

import ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int studentId);
    Student saveOrUpdate(Student student);
    void delete(int studentId);
    List<Student> searchByName(String studentName, int studentId);


}
