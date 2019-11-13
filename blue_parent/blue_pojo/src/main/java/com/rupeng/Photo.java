package com.rupeng;

import java.util.Date;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 11:16
 * @description: Photo
 * @modified By：
 **/
public class Photo {
    private long id;
    private Date photoDateTime;
    private String photoAddress;
    private String photoAuthor;
    private String photoDescribe;

    public String getPhotoDescribe() {
        return photoDescribe;
    }
    public void setPhotoDescribe(String photoDescribe) {
        this.photoDescribe = photoDescribe;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getPhotoDateTime() {
        return photoDateTime;
    }
    public void setPhotoDateTime(Date photoDateTime) {
        this.photoDateTime = photoDateTime;
    }
    public String getPhotoAddress() {
        return photoAddress;
    }
    public void setPhotoAddress(String photoAddress) {
        this.photoAddress = photoAddress;
    }
    public String getPhotoAuthor() {
        return photoAuthor;
    }
    public void setPhotoAuthor(String photoAuthor) {
        this.photoAuthor = photoAuthor;
    }
}
