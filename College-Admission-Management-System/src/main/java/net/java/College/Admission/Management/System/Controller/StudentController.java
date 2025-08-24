package net.java.College.Admission.Management.System.Controller;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Entity.Student;
import net.java.College.Admission.Management.System.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
