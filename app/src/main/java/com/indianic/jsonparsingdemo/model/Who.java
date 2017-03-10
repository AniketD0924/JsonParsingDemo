package com.indianic.jsonparsingdemo.model;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class Who {
    private ArrayList<Members> membersArrayList;
    private ArrayList<Groups> groupArrayList;

    public ArrayList<Groups> getGroupArrayList() {
        return groupArrayList;
    }

    public void setGroupArrayList(ArrayList<Groups> groupArrayList) {
        this.groupArrayList = groupArrayList;
    }

    public ArrayList<Members> getMembersArrayList() {
        return membersArrayList;
    }

    public void setMembersArrayList(ArrayList<Members> membersArrayList) {
        this.membersArrayList = membersArrayList;
    }
}
