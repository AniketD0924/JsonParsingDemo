package com.indianic.jsonparsingdemo.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by indianic on 18/10/16.
 */

public class PostModel implements Parcelable {
    public static final Creator<PostModel> CREATOR = new Creator<PostModel>() {
        @Override
        public PostModel createFromParcel(Parcel source) {
            return new PostModel(source);
        }

        @Override
        public PostModel[] newArray(int size) {
            return new PostModel[size];
        }
    };
    private String contentType = "";
    private String postID = "";
    private String content = "";
    private String createdDate = "";
    private String updatedDate = "";
    private String totalComments = "";
    private ArrayList<WhoPostModel> whoPostModelArrayList;
    private ArrayList<Owner> entityModelArrayList;
    private ArrayList<MutualFriends> mutualFriendsArrayList;

    public PostModel() {
    }

    protected PostModel(Parcel in) {
        this.contentType = in.readString();
        this.postID = in.readString();
        this.content = in.readString();
        this.createdDate = in.readString();
        this.updatedDate = in.readString();
        this.totalComments = in.readString();
        this.whoPostModelArrayList = new ArrayList<WhoPostModel>();
        in.readList(this.whoPostModelArrayList, WhoPostModel.class.getClassLoader());
    }

    public static Creator<PostModel> getCREATOR() {
        return CREATOR;
    }

    public ArrayList<MutualFriends> getMutualFriendsArrayList() {
        return mutualFriendsArrayList;
    }

    public void setMutualFriendsArrayList(ArrayList<MutualFriends> mutualFriendsArrayList) {
        this.mutualFriendsArrayList = mutualFriendsArrayList;
    }

    public ArrayList<Owner> getEntityModelArrayList() {
        return entityModelArrayList;
    }

    public void setEntityModelArrayList(ArrayList<Owner> entityModelArrayList) {
        this.entityModelArrayList = entityModelArrayList;
    }

    public ArrayList<WhoPostModel> getWhoPostModelArrayList() {
        return whoPostModelArrayList;
    }

    public void setWhoPostModelArrayList(ArrayList<WhoPostModel> whoPostModelArrayList) {
        this.whoPostModelArrayList = whoPostModelArrayList;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(String totalComments) {
        this.totalComments = totalComments;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contentType);
        dest.writeString(this.postID);
        dest.writeString(this.content);
        dest.writeString(this.createdDate);
        dest.writeString(this.updatedDate);
        dest.writeString(this.totalComments);
        dest.writeList(this.whoPostModelArrayList);
    }
}
