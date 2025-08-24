package net.java.College.Admission.Management.System.ServiceImpl;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Entity.Student;
import net.java.College.Admission.Management.System.Repository.StudentRepository;
import net.java.College.Admission.Management.System.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
