package com.indianic.jsonparsingdemo.model;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class Counter {
    private String group;
    private String pictures;
    private ArrayList<Members> membersArrayList;
    private String following;

    public ArrayList<Members> getMembersArrayList() {
        return membersArrayList;
    }

    public void setMembersArrayList(ArrayList<Members> membersArrayList) {
        this.membersArrayList = membersArrayList;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

}
