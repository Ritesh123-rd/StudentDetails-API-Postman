package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.Entities.Application;
import com.springrest.springrest.service.ApplicationService;

@RestController
public class MyController {
	
    @Autowired
    private ApplicationService applicationService;
	
    @GetMapping("/")
    public String home() {
        return "This is my home";
    }

    // Get all applicantinfo
    @GetMapping("/ApplicantInfo")
    public List<Application> getApplications() {
        return applicationService.getApplications();
    }
	   
    // Get a single applicant by ID
    @GetMapping("/applicant/{applicantId}")
    public Application getApplication(@PathVariable String applicantId) {
        return applicationService.getApplication(Long.parseLong(applicantId));
    }
	   
    // Add a new application
    @PostMapping("/applicantCreat")
    public Application addApplication(@RequestBody Application applicantCreat) {
        return applicationService.addApplication(applicantCreat);
    }

    // Update an existing application
    @PutMapping("/applicantUpdate/{applicantId}")
    public Application updateApplication(@PathVariable String applicantId, @RequestBody Application applicantUpdate) {
    	applicantUpdate.setId(Long.parseLong(applicantId));
        return applicationService.updateApplication(applicantUpdate);
    }

    // Delete an application by ID
    @DeleteMapping("/applicantDelete/{applicantId}")
    public void deleteApplication(@PathVariable String applicantId) {
        applicationService.deleteApplication(Long.parseLong(applicantId));
    }
}
