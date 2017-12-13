package com.laungcisin.springboot.rocketmq.entity;

import java.util.Date;

public class Subscribe {
    private Integer id;

    private String proname;

    private String url;

    private String topic;

    private String tag;

    private String gro;

    private String consumefromwhere;

    private String consumethreadmin;

    private String consumethreadmax;

    private String pullthresholdforqueue;

    private String consumemessagebatchmaxsize;

    private String pullbatchsize;

    private String pullinterval;

    private String businesskey;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGro() {
        return gro;
    }

    public void setGro(String gro) {
        this.gro = gro;
    }

    public String getConsumefromwhere() {
        return consumefromwhere;
    }

    public void setConsumefromwhere(String consumefromwhere) {
        this.consumefromwhere = consumefromwhere;
    }

    public String getConsumethreadmin() {
        return consumethreadmin;
    }

    public void setConsumethreadmin(String consumethreadmin) {
        this.consumethreadmin = consumethreadmin;
    }

    public String getConsumethreadmax() {
        return consumethreadmax;
    }

    public void setConsumethreadmax(String consumethreadmax) {
        this.consumethreadmax = consumethreadmax;
    }

    public String getPullthresholdforqueue() {
        return pullthresholdforqueue;
    }

    public void setPullthresholdforqueue(String pullthresholdforqueue) {
        this.pullthresholdforqueue = pullthresholdforqueue;
    }

    public String getConsumemessagebatchmaxsize() {
        return consumemessagebatchmaxsize;
    }

    public void setConsumemessagebatchmaxsize(String consumemessagebatchmaxsize) {
        this.consumemessagebatchmaxsize = consumemessagebatchmaxsize;
    }

    public String getPullbatchsize() {
        return pullbatchsize;
    }

    public void setPullbatchsize(String pullbatchsize) {
        this.pullbatchsize = pullbatchsize;
    }

    public String getPullinterval() {
        return pullinterval;
    }

    public void setPullinterval(String pullinterval) {
        this.pullinterval = pullinterval;
    }

    public String getBusinesskey() {
        return businesskey;
    }

    public void setBusinesskey(String businesskey) {
        this.businesskey = businesskey;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}