package net.java.College.Admission.Management.System.Controller;

import lombok.RequiredArgsConstructor;
import net.java.College.Admission.Management.System.Dto.ApplicationDto;
import net.java.College.Admission.Management.System.Service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
    public ApplicationDto apply(@RequestBody ApplicationDto applicationDto) {
        return applicationService.apply(applicationDto);
    }

    @GetMapping
    public List<ApplicationDto> getAllApplications() {
        return applicationService.getAllApplications();
    }
}
