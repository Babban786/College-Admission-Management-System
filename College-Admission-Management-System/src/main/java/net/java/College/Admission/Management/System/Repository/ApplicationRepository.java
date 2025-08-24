package net.java.College.Admission.Management.System.Repository;

import net.java.College.Admission.Management.System.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
