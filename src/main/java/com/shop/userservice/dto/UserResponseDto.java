package com.shop.userservice.dto;

public class UserResponseDto {
    private String id;
    private String username;
    private boolean isAdmin;
    private String img;

    public UserResponseDto(String id, String username, boolean isAdmin, String img) {
        this.id = id;
        this.username = username;
        this.isAdmin = isAdmin;
        this.img = img;
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

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"username\":\"" + username + "\""
                + ",                         \"isAdmin\":\"" + isAdmin + "\""
                + ",                         \"img\":\"" + img + "\""
                + "}";
    }
}
