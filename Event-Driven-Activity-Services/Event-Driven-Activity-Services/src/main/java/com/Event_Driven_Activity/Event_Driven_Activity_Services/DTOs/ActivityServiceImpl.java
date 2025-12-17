package com.Event_Driven_Activity.Event_Driven_Activity_Services.DTOs;


import com.Event_Driven_Activity.Event_Driven_Activity_Services.entity.Activity;
import com.Event_Driven_Activity.Event_Driven_Activity_Services.repository.ActivityRepository;
import org.springframework.stereotype.Service;
    @Service
    public class ActivityServiceImpl implements ActivityService {

        private final ActivityRepository repo;

        public ActivityServiceImpl(ActivityRepository repo) {
            this.repo = repo;
        }

        @Override
        public void processActivity(ActivityRequest request) {
            Activity entity = new Activity(null, request.getUserId(), request.getTaype(), request.getPayload());
            repo.save(entity);
        }
    }

