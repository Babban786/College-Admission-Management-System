package net.java.College.Admission.Management.System.Repository;

import net.java.College.Admission.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
