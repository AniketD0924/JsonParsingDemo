package com.indianic.jsonparsingdemo.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by indianic on 18/10/16.
 */

public class BannerImage implements Parcelable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String name;
    private String path;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.path);
    }

    public BannerImage() {
    }

    protected BannerImage(Parcel in) {
        this.name = in.readString();
        this.path = in.readString();
    }

    public static final Parcelable.Creator<BannerImage> CREATOR = new Parcelable.Creator<BannerImage>() {
        @Override
        public BannerImage createFromParcel(Parcel source) {
            return new BannerImage(source);
        }

        @Override
        public BannerImage[] newArray(int size) {
            return new BannerImage[size];
        }
    };
}
