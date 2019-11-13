package com.rupeng;

import java.util.Date;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 10:58
 * @description: Comments
 * @modified By：
 **/
public class Comments {
    private long id;
    private long userid;
    private String content;
    private Date commentDate;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getUserid() {
        return userid;
    }
    public void setUserid(long userid) {
        this.userid = userid;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCommentDate() {
        return commentDate;
    }
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
