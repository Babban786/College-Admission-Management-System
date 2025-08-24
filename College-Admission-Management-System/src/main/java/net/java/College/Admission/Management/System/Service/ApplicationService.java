package net.java.College.Admission.Management.System.Service;

import net.java.College.Admission.Management.System.Dto.ApplicationDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ApplicationService {
    ApplicationDto apply(ApplicationDto applicationDto);
    List<ApplicationDto> getAllApplications();
}
