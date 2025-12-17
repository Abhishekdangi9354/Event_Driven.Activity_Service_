package com.Event_Driven_Activity.Event_Driven_Activity_Services.repository;

import com.Event_Driven_Activity.Event_Driven_Activity_Services.entity.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity, String> {

}
