package net.java.College.Admission.Management.System.Controller;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Entity.Course;
import net.java.College.Admission.Management.System.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
