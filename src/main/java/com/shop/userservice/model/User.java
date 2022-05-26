package com.shop.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("users")
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private boolean isAdmin;
    private String img;
    private Date createdAt;
    private Date updatedAt;

    public User(String id, String username, String password, boolean isAdmin, String img, Date createdAt, Date updatedAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.img = img;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"username\":\"" + username + "\""
                + ",                         \"password\":\"" + password + "\""
                + ",                         \"isAdmin\":\"" + isAdmin + "\""
                + ",                         \"img\":\"" + img + "\""
                + ",                         \"createdAt\":" + createdAt
                + ",                         \"updatedAt\":" + updatedAt
                + "}";
    }
}
