package com.nju.book.model;

import java.util.Date;

public class UserInfo {
    private Integer userId;

    private String userName;

    private String nickName;

    private String recordId;

    private String address;

    private String password;

    private String location;

    private Integer root;

    private String sex;

    private Short high;

    private Short weight;

    private String profile;

    private Date birth;

    private String sportsLike;

    private Short money;

    private Date dueTume;

    private Date addTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Short getHigh() {
        return high;
    }

    public void setHigh(Short high) {
        this.high = high;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSportsLike() {
        return sportsLike;
    }

    public void setSportsLike(String sportsLike) {
        this.sportsLike = sportsLike == null ? null : sportsLike.trim();
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public Date getDueTume() {
        return dueTume;
    }

    public void setDueTume(Date dueTume) {
        this.dueTume = dueTume;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}