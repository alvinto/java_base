package com.yyw.design.createmodel.builder.instance;

import java.util.Date;

/**
 * 自动发送邮件模板
 * Created by wangshuai on 2016/4/6.
 */
public abstract class AutoMessage {
    private String to;
    private String from;
    private String title;
    private String body;
    private Date date;

    /**
     * 发送邮件
     */
    public void send() {
        System.out.println("AutoMessage{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", date=" + date +
                '}');
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
