package net.java.College.Admission.Management.System.Service;

import net.java.College.Admission.Management.System.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    Course saveCourse(Course course);
    List<Course> getAllCourses();
}
