package net.java.College.Admission.Management.System.ServiceImpl;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Entity.Course;
import net.java.College.Admission.Management.System.Repository.CourseRepository;
import net.java.College.Admission.Management.System.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
