package net.java.College.Admission.Management.System.Repository;

import net.java.College.Admission.Management.System.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
