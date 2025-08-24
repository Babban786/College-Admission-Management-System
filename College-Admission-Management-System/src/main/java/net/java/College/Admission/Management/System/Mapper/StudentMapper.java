package net.java.College.Admission.Management.System.Mapper;

import net.java.College.Admission.Management.System.Dto.StudentDto;
import net.java.College.Admission.Management.System.Entity.Student;

public class StudentMapper {
    public static StudentDto toDto(Student student) {
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setMarks(student.getMarks());
        return dto;
    }

    public static Student toEntity(StudentDto dto) {
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setMarks(dto.getMarks());
        return student;
    }
}

