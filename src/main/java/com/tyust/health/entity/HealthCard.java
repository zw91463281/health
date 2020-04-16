package com.tyust.health.entity;

import java.util.Date;

public class HealthCard {
    private Integer cradId;

    private Integer userId;

    private String province;

    private String city;

    private String county;

    private Long temperature;

    private Byte isEpidemicArea;

    private Byte isContactPatient;

    private Integer myhealth;

    private Byte isBackSchool;

    private Date createDate;

    private Integer status;

    private Integer flag;

    public Integer getCradId() {
        return cradId;
    }

    public void setCradId(Integer cradId) {
        this.cradId = cradId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Byte getIsEpidemicArea() {
        return isEpidemicArea;
    }

    public void setIsEpidemicArea(Byte isEpidemicArea) {
        this.isEpidemicArea = isEpidemicArea;
    }

    public Byte getIsContactPatient() {
        return isContactPatient;
    }

    public void setIsContactPatient(Byte isContactPatient) {
        this.isContactPatient = isContactPatient;
    }

    public Integer getMyhealth() {
        return myhealth;
    }

    public void setMyhealth(Integer myhealth) {
        this.myhealth = myhealth;
    }

    public Byte getIsBackSchool() {
        return isBackSchool;
    }

    public void setIsBackSchool(Byte isBackSchool) {
        this.isBackSchool = isBackSchool;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}