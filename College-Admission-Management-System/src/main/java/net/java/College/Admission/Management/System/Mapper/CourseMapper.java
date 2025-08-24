package net.java.College.Admission.Management.System.Mapper;

import net.java.College.Admission.Management.System.Dto.CourseDto;
import net.java.College.Admission.Management.System.Entity.Course;

public class CourseMapper {
    public static CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setCourseName(course.getCourseName());
        dto.setCapacity(course.getCapacity());
        dto.setCutOffMarks(course.getCutoffMarks());
        return dto;
    }

    public static Course toEntity(CourseDto dto) {
        Course course = new Course();
        course.setId(dto.getId());
        course.setCourseName(dto.getCourseName());
        course.setCapacity(dto.getCapacity());
        course.setCutoffMarks(dto.getCutOffMarks());
        return course;
    }
}
