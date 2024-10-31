package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Application;



@Service
public class ApplicationServiceIMPL implements ApplicationService {

    private List<Application> list;

    public ApplicationServiceIMPL() {
        list = new ArrayList<>();
        list.add(new Application(145, "ritesh", "riteshjcbjh@gmail.com", "9552115645","Pune"));
    }

    @Override
    public List<Application> getApplications() {
        return list;
    }

    @Override
    public Application getApplication(long applicationId) {
        Optional<Application> application = list.stream().filter(app -> app.getId() == applicationId).findFirst();
        return application.orElse(null);
    }

    @Override
    public Application addApplication(Application application) {
        list.add(application);
        return application;
    }

    @Override
    public Application updateApplication(Application application) {
        for (int i = 0; i < list.size(); i++) {
            Application existingApplication = list.get(i);
            if (existingApplication.getId() == application.getId()) {
                list.set(i, application);
                return application;
            }
        }
        return null;
    }

    @Override
    public void deleteApplication(long applicationId) {
        list.removeIf(application -> application.getId() == applicationId);
    }
}
