package com.tyust.health.entity;

import java.util.Date;

public class Notice {
    private Integer id;

    private String name;

    private Integer userId;

    private Long phone;

    private Integer college;

    private String studentClass;

    private Integer userStatus;

    private Integer noticeStatus;

    private Integer batchId;

    private Date createTime;

    private Integer generatePeople;

    private Integer distributionPeople;

    private Date distributionTime;

    private Date receiveTime;

    private Integer flag;

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", phone=" + phone +
                ", college=" + college +
                ", studentClass='" + studentClass + '\'' +
                ", userStatus=" + userStatus +
                ", noticeStatus=" + noticeStatus +
                ", batchId=" + batchId +
                ", createTime=" + createTime +
                ", generatePeople=" + generatePeople +
                ", distributionPeople=" + distributionPeople +
                ", distributionTime=" + distributionTime +
                ", receiveTime=" + receiveTime +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGeneratePeople() {
        return generatePeople;
    }

    public void setGeneratePeople(Integer generatePeople) {
        this.generatePeople = generatePeople;
    }

    public Integer getDistributionPeople() {
        return distributionPeople;
    }

    public void setDistributionPeople(Integer distributionPeople) {
        this.distributionPeople = distributionPeople;
    }

    public Date getDistributionTime() {
        return distributionTime;
    }

    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}