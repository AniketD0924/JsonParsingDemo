package com.indianic.jsonparsingdemo.model;

/**
 * Created by indianic on 18/10/16.
 */

public class Owner {
    private String id;
    private String profileImage;
    private String fullname;
    private String gender;
    private String superfriend;

    public String getSuperfriend() {
        return superfriend;
    }

    public void setSuperfriend(String superfriend) {
        this.superfriend = superfriend;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
