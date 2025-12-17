package com.Event_Driven_Activity.Event_Driven_Activity_Services.Controller;

import com.Event_Driven_Activity.Event_Driven_Activity_Services.DTOs.ActivityRequest;
import com.Event_Driven_Activity.Event_Driven_Activity_Services.DTOs.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
public class RESTEndPoint {



    @RestController
    @RequestMapping("/api/activities")
    public class ActivityController {

        private final ActivityService activityService;

        public ActivityController(ActivityService activityService) {
            this.activityService = activityService;
        }

        @PostMapping
        public ResponseEntity<String> createActivity(@RequestBody ActivityRequest request) {
            activityService.processActivity(request);
            return ResponseEntity.ok("Activity created");
        }
    }

}
