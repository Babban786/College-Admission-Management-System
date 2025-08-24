package net.java.College.Admission.Management.System.Dto;

import lombok.*;
import net.java.College.Admission.Management.System.Entity.Application;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDto {
    private Long id;
    private Long studentId;
    private Long courseId;
    private String status;
}
