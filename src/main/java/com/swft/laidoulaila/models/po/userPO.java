package com.swft.laidoulaila.models.po;

import java.util.Date;

public class userPO {
    private Integer userID;
    private String userName;
    private String userGender;
    private String userWechat;
    private Date userBirthday;
    private Integer userAge;
    private String userJob;
    private String userWorkplace;

    public userPO(Integer userID, String userName, String userGender, String userWechat, Date userBirthday, Integer userAge, String userJob, String userWorkplace) {
        this.userID = userID;
        this.userName = userName;
        this.userGender = userGender;
        this.userWechat = userWechat;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userJob = userJob;
        this.userWorkplace = userWorkplace;
    }

    public userPO(){ super();}

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public String getUserWorkplace() {
        return userWorkplace;
    }

    public void setUserWorkplace(String userWorkplace) {
        this.userWorkplace = userWorkplace;
    }
}
