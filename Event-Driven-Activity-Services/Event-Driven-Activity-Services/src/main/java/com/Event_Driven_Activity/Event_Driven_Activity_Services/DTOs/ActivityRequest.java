package com.Event_Driven_Activity.Event_Driven_Activity_Services.DTOs;

import lombok.Data;

@Data
public class ActivityRequest {
    private String userId;
    private String type;
    private Object payload;

    public Object getUserId() {
        return "ab";
    }

    public Object getTaype() {
        return "false";
    }

    public Object getPayload() {
        return "Yes";
    }


    // getters, setters
}
