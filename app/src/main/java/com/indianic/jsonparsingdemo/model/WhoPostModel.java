package com.indianic.jsonparsingdemo.model;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class WhoPostModel {
    private String _id;
    private String coupon;
    private String createdAt;
    private String description;
    private String isActive;
    private String privacy;
    private String updatedAt;
    private String what;
    private String profileImage;
    private ArrayList<BannerImage> bannerImageArrayList;
    private ArrayList<Cateogories> cateogoriesArrayList;
    private ArrayList<Counter> counterArrayList;
    private ArrayList<Owner> ownerArrayList;
    private ArrayList<When> whenArrayList;
    private ArrayList<Where> whereArrayList;
    private ArrayList<Who> whoArrayList;

    public ArrayList<Who> getWhoArrayList() {
        return whoArrayList;
    }

    public void setWhoArrayList(ArrayList<Who> whoArrayList) {
        this.whoArrayList = whoArrayList;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public ArrayList<Counter> getCounterArrayList() {
        return counterArrayList;
    }

    public void setCounterArrayList(ArrayList<Counter> counterArrayList) {
        this.counterArrayList = counterArrayList;
    }

    public ArrayList<Cateogories> getCateogoriesArrayList() {
        return cateogoriesArrayList;
    }

    public void setCateogoriesArrayList(ArrayList<Cateogories> cateogoriesArrayList) {
        this.cateogoriesArrayList = cateogoriesArrayList;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public ArrayList<BannerImage> getBannerImageArrayList() {
        return bannerImageArrayList;
    }

    public void setBannerImageArrayList(ArrayList<BannerImage> bannerImageArrayList) {
        this.bannerImageArrayList = bannerImageArrayList;
    }

    public ArrayList<Owner> getOwnerArrayList() {
        return ownerArrayList;
    }

    public void setOwnerArrayList(ArrayList<Owner> ownerArrayList) {
        this.ownerArrayList = ownerArrayList;
    }

    public ArrayList<When> getWhenArrayList() {
        return whenArrayList;
    }

    public void setWhenArrayList(ArrayList<When> whenArrayList) {
        this.whenArrayList = whenArrayList;
    }

    public ArrayList<Where> getWhereArrayList() {
        return whereArrayList;
    }

    public void setWhereArrayList(ArrayList<Where> whereArrayList) {
        this.whereArrayList = whereArrayList;
    }

}
