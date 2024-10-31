package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.Entities.Application;


import java.util.List;


public interface ApplicationService {

    // Retrieve all applications
    public List<Application> getApplications();
    
    // Retrieve a single application by ID
    public Application getApplication(long applicationId);

    // Add a new application
    public Application addApplication(Application application);
    
    // Update an existing application
    public Application updateApplication(Application application);
    
    // Delete an application by ID
    public void deleteApplication(long applicationId);
}

