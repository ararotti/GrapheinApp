package com.graphein.grapheinapp;

/**
 * Created by araratavsaroglu on 05/06/17.
 */

public class FeedItemModel {
    private String profilePicture;
    private String personName;
    private String historyName;
    private String date;
    private String titlePhoto;
    private String historyTitle;
    private String historyDetail;
    private int likeCount;

    public FeedItemModel() { }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getHistoryName() {
        return historyName;
    }

    public void setHistoryName(String historyName) {
        this.historyName = historyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    public String getHistoryTitle() {
        return historyTitle;
    }

    public void setHistoryTitle(String historyTitle) {
        this.historyTitle = historyTitle;
    }

    public String getHistoryDetail() {
        return historyDetail;
    }

    public void setHistoryDetail(String historyDetail) {
        this.historyDetail = historyDetail;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
