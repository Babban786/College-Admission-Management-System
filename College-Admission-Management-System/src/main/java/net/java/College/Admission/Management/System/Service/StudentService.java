package net.java.College.Admission.Management.System.Service;

import net.java.College.Admission.Management.System.Dto.StudentDto;
import net.java.College.Admission.Management.System.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();
}
