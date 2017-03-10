package com.indianic.jsonparsingdemo.model;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class When {
    private String type;
    private String policy;
    private ArrayList<OrganizerDates> organizerDatesArrayList;

    public ArrayList<OrganizerDates> getOrganizerDatesArrayList() {
        return organizerDatesArrayList;
    }

    public void setOrganizerDatesArrayList(ArrayList<OrganizerDates> organizerDatesArrayList) {
        this.organizerDatesArrayList = organizerDatesArrayList;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
