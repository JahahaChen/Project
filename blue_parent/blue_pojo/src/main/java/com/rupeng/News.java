package com.rupeng;

import java.util.Date;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 10:59
 * @description: 新闻
 * @modified By：
 **/
public class News {
    private long id;
    private Date newsTime;
    private String newsAuthor;
    private String newsTitle;
    private String newDescribe;
    private String newsContent;
    private boolean isDeleted;

    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getNewsTime() {
        return newsTime;
    }
    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }
    public String getNewsAuthor() {
        return newsAuthor;
    }
    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }
    public String getNewsTitle() {
        return newsTitle;
    }
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewDescribe() {
        return newDescribe;
    }
    public void setNewDescribe(String newDescribe) {
        this.newDescribe = newDescribe;
    }
    public String getNewsContent() {
        return newsContent;
    }
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
