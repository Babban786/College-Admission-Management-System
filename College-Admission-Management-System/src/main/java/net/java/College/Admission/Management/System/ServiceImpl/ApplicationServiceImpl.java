package net.java.College.Admission.Management.System.ServiceImpl;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Dto.ApplicationDto;
import net.java.College.Admission.Management.System.Entity.Application;
import net.java.College.Admission.Management.System.Entity.Course;
import net.java.College.Admission.Management.System.Entity.Student;
import net.java.College.Admission.Management.System.Mapper.ApplicationMapper;
import net.java.College.Admission.Management.System.Repository.ApplicationRepository;
import net.java.College.Admission.Management.System.Repository.CourseRepository;
import net.java.College.Admission.Management.System.Repository.StudentRepository;
import net.java.College.Admission.Management.System.Service.ApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    private final CourseRepository courseRepository;

    private final StudentRepository studentRepository;


    @Override
    public ApplicationDto apply(ApplicationDto applicationDto) {
        Application application = ApplicationMapper.toEntity(applicationDto);

        // Fetch student and course from DB
        Student student =studentRepository.findById(applicationDto.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(applicationDto.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        application.setStudent(student);
        application.setCourse(course);

        // default status
        if (application.getStatus() == null) {
            application.setStatus("PENDING");
        }

        Application savedApplication = applicationRepository.save(application);
        return ApplicationMapper.toDto(savedApplication);
    }


    @Override
    public List<ApplicationDto> getAllApplications() {
        return applicationRepository.findAll().stream().map(ApplicationMapper::toDto).toList();
    }
}
