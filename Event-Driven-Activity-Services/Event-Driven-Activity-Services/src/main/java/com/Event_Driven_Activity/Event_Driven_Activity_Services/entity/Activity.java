package com.Event_Driven_Activity.Event_Driven_Activity_Services.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "activities")
public class Activity {
    @Id
    private String id;
    private String userId;
    private String type;
    private Object payload;

    public Activity(Object o, Object userId, Object taype, Object payload) {
    }

// constructor, getters, setters
}