package com.practice.project.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserData implements Serializable {
    @SerializedName("data")
    DataClass data;


    public UserData(DataClass data, SupportClass support) {
        this.data = data;
        this.support = support;
    }

    public DataClass getData() {
        return data;
    }

    public void setData(DataClass data) {
        this.data = data;
    }

    public SupportClass getSupport() {
        return support;
    }

    public void setSupport(SupportClass support) {
        this.support = support;
    }

    SupportClass support;

    public class DataClass{


        public String first_name;
        String last_name;
        String id;
        String email;
        String avatar;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAvatar() {
            return avatar;
        }

        @Override
        public String toString() {
            return "DataClass{" +
                    "first_name='" + first_name + '\'' +
                    ", last_name='" + last_name + '\'' +
                    ", id='" + id + '\'' +
                    ", email='" + email + '\'' +
                    ", avatar='" + avatar + '\'' +
                    '}';
        }

        public DataClass() {
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
    class SupportClass{
        String url, text;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "SupportClass{" +
                    "url='" + url + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}
