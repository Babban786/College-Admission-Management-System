package net.java.College.Admission.Management.System.Mapper;

import net.java.College.Admission.Management.System.Dto.ApplicationDto;
import net.java.College.Admission.Management.System.Entity.Application;

public class ApplicationMapper {

    public static ApplicationDto toDto(Application application) {
        ApplicationDto dto = new ApplicationDto();
        dto.setId(application.getId());
        dto.setStudentId(application.getStudent().getId());
        dto.setCourseId(application.getCourse().getId());
        dto.setStatus(application.getStatus());
        return dto;
    }

    public static Application toEntity(ApplicationDto dto) {
        Application application = new Application();
        application.setId(dto.getId());
        application.setStatus(dto.getStatus());
        return application;
    }
    }
