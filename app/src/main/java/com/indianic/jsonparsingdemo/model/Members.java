package com.indianic.jsonparsingdemo.model;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class Members {
    private String pending;
    private String confirmed;
    private String banned;
    private String when;
    private String isFriend;
    private String status;
    private ArrayList<Owner> ownerArrayList;
    private String rejected;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Owner> getOwnerArrayList() {
        return ownerArrayList;
    }

    public void setOwnerArrayList(ArrayList<Owner> ownerArrayList) {
        this.ownerArrayList = ownerArrayList;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getIsFriend() {
        return isFriend;
    }

    public void setIsFriend(String isFriend) {
        this.isFriend = isFriend;
    }

    public String getRejected() {
        return rejected;
    }

    public void setRejected(String rejected) {
        this.rejected = rejected;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getBanned() {
        return banned;
    }

    public void setBanned(String banned) {
        this.banned = banned;
    }
}
